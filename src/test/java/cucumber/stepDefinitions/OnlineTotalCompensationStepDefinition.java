package cucumber.stepDefinitions;

import core.Context;
import cucumber.steps.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mvc.view.WelcomeToADP;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.Page;
import ui.controls.Control;

import java.util.ArrayList;
import java.util.List;

public class OnlineTotalCompensation {
    WelcomeToADP welcomeToADP;

    @Given("a practitioner {string} is logged in for OTR client")
    public void aPractitionerIsLoggedInForOTRClient(String userName) throws Exception {
        Context.put("UserName", userName);
        CommonSteps.loginTo("Welcome to ADP");
    }

    @When("view {string} for {string} under {string}")
    public void viewFor(String itemName, String employee, String barName) {
        Context.put("itemName", itemName);
        Context.put("employee", employee);
        String locatorPattern = "//*[contains(text(), '%s')]//parent::div//descendant::a[text()='" + itemName + "']";
        CommonSteps.selectTaskFromGlobalSearch(barName, itemName, locatorPattern);
        String pageTitle = "//*[text()='Total Compensation'][@data-dojo-attach-point='titleNode']";
        Control control = Page.getCurrent().buildXpathControl(pageTitle);
        Assert.assertEquals(itemName, control.getText());

        //Switch to iframe: id=portalIFrame
        Page.getCurrent().getDriver().switchTo().frame(0);
        Control in = Page.getCurrent().buildCssControl("input#quickSearchEmployee");
        in.click();
        in.element().sendKeys(employee.substring(0, 5));
        Page.getCurrent().buildXpathControl("//*[text()='Taylor, Andrew - 910901']").click();


        //Compare
        Page.getCurrent().buildCssControl("#totalCompensationTotal").getText();
        Page.getCurrent().buildCssControl("#basePayTotal").getText();
        Page.getCurrent().buildCssControl("#companyContributionsTotal").getText();
        //        Page.getCurrent().getDriver().switchTo().defaultContent();
    }

    @And("views {string} under {string}")
    public void viewsUnder(String arg0, String arg1) {
    }

    @Then("I should see the following {string} of")
    public void iShouldSeeTheFollowingOf(String arg0) {
    }
}
