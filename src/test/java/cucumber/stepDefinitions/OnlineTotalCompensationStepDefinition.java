package cucumber.stepDefinitions;

import core.Context;
import cucumber.steps.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mvc.view.WelcomeToADP;
import org.junit.Assert;
import ui.Page;
import ui.controls.Control;

import java.util.Map;

public class OnlineTotalCompensationStepDefinition {
    WelcomeToADP welcomeToADP;

    @Given("a practitioner {string} is logged in for OTR client")
    public void aPractitionerIsLoggedInForOTRClient(String userName) throws Exception {
        Context.put("UserName", userName);
        CommonSteps.loginTo("Welcome to ADP");
    }

    @When("when the practitioner views {string} {string}")
    public void viewMySelf(String barName, String itemName) {
        viewAsPractioner(barName, itemName,"");
    }
    @When("the practitioner views {string} {string} for {string}")
    public void viewAsPractioner(String barName, String itemName, String employee) {
        Context.put("barName", barName);
        Context.put("itemName", itemName);
        Context.put("employee", employee);
        String locatorPattern = "//*[contains(text(), '%s')]//parent::div//descendant::a[text()='" + itemName + "']";
        CommonSteps.selectTaskFromGlobalSearch(barName, itemName, locatorPattern);
        String pageTitle = "//*[text()='Total Compensation'][@data-dojo-attach-point='titleNode']";
        Control control = Page.getCurrent().buildXpathControl(pageTitle);
        Assert.assertEquals(itemName, control.getText());

        //Switch to iframe: id=portalIFrame
        Page.getCurrent().getDriver().switchTo().defaultContent();
        Page.getCurrent().getDriver().switchTo().frame("portalIFrame_iframe");

        //        CommonSteps.doThreadSleep(3000);
        Control in = Page.getCurrent().buildCssControl("input#quickSearchEmployee");
        in.isClickable(7);
        in.click();
        in.element().sendKeys(employee.substring(0, 5));
        Page.getCurrent().buildXpathControl("//*[text()='Taylor, Andrew - 910901']").click();


        //Compare
        Page.getCurrent().buildCssControl("#totalCompensationTotal").isClickable(7);
        Page.getCurrent().buildCssControl("#totalCompensationTotal").getText();
        Page.getCurrent().buildCssControl("#basePayTotal").getText();
        Page.getCurrent().buildCssControl("#companyContributionsMark").getText();
        //        Page.getCurrent().getDriver().switchTo().defaultContent();
    }

    @Then("^(I|the practitioner) should see (the following|their) Total Compensation of$")
    public void iShouldSeeTheFollowingOf(io.cucumber.datatable.DataTable dataTable ) {
        Map<String,String> totalCompensation = dataTable.asMap(String.class, String.class);
        totalCompensation.get("Total Compensation");
        totalCompensation.get("Base Pay");
        totalCompensation.get("Company Contributions");
    }

}
