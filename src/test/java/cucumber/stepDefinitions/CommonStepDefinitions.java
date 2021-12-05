package cucumber.stepDefinitions;

import com.paulhammant.ngwebdriver.NgWebDriver;
import controls.AdpControl;
import core.Driver;
import cucumber.steps.CommonSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import pages.HireEmployee;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;
import utils.UrlEnvironmentSetter;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CommonStepDefinitions {
    private DataTable content;
    private JavascriptExecutor jsDriver;

    @Then("I should see the following fields are shown:")
    public void verifyMultipleFieldsAvailability(List<String> elements) throws Exception {
        CommonSteps.verifyMultipleFieldsExists(elements);
    }

    @Then("I have the following text on the page")
    public void verifyTextOnThePage(List<List<String>> content) throws Exception {
        CommonSteps.verifyGenericTextOnThePage(content);
    }

    @When("I should see the page contains the following data:")
    public void pageContainsData(List<Map<String, String>> content) throws Exception {
        CommonSteps.verifyInputOfMultipleFields(content);
    }

    @Given("a user having valid credentials")

    public void getEnvironmentClientPageCriteria()
            throws Exception {
        chooseEnvironmentAndLoginApp( );
    }

    @Given("I have valid credentials for {string} environment")
    public void chooseEnvironmentAndLoginApp()
            throws Exception {
        if (System.getProperty("byPassLogin").equalsIgnoreCase("no")) {
            UrlEnvironmentSetter.SetEnvironmentUrl();
            CommonSteps.loginTo("Welcome to ADP");
        }
    }

    @Given("(the logged in user automatically navigates to)/(I am on the) {string} page/screen")
    @When("(I)/(a New user) goes/go to the {string} page/screen")
    public void navigateToPage(String name) throws Exception {
        CommonSteps.goingTo(name);
    }

    @When("I click/tap on the {string} button/element/control")
    public void clickOnTheButton(String name) throws Exception {
        Control control = Page.getCurrent().onPage(name);
        Assert.assertNotNull("Unable to find '" + name + "' element on current page", control);
        control.click();
    }

    @When("I enter {string} into the {string} field")
    public void enterValue(String text, String fieldName) throws Exception {
        CommonSteps.enterValue(text, fieldName);
    }

    @When("I accept the alert message")
    public void acceptAlert() {
        Driver.current().switchTo().alert().accept();
    }

    @When("I populate current page with the following data:")
    public void populatePageWithData(Map<String, String> content) throws Exception {
        enterTextOnPage(content);
    }

    private void enterTextOnPage(Map<String, String> content) throws Exception {
        CommonSteps.enterTextIntoMultipleFields(content);
    }

    @Then("I should see the {string} field is available/present")
    public Control verifyElementExists(String fieldName) throws Exception {
        return (Control) CommonSteps.verifyElementExists(fieldName);
    }

    @And("I should see the {string} field is available/present on {string} page")
    public void iShouldSeeTheFieldIsAvailableOnPage(String fieldname, String page) throws Exception {
        Page.getCurrent().waitForAngularRequestToComplete();
        verifyCurrentPage(page);
        verifyElementExists(fieldname);
    }

    @Then("(I/user should) see {string} page/screen")
    public void verifyCurrentPage(String name) throws Exception {
        CommonSteps.verifyCurrentPage(name);
    }

    @Then("I should see | the {string} field contains the {string} text")
    public Control verifyFieldText(String fieldName, String text) throws Exception {
        return CommonSteps.verifyFieldText(fieldName, text);
    }

    @Then("I should see the {string} text is shown")
    public void verifyTextIsPresent(String text) {
        CommonSteps.verifyTextPresence(text);
    }

    @Then("I should see the following labels are shown:")
    public void verifyMultipleLabelsAvailability(List<String> elements) throws Exception {
        CommonSteps.verifyLabelsAvailability(elements);
    }

    @Then("/(I should see/the)/ {string} list is {} empty")
    public void verifyListEmptyState(String list, String emptyState) throws Exception {
        CommonSteps.verifyListEmptyState(list, emptyState);
    }

    @Then("(I should see |)the (first|last) (row|item) of the {string} (list|table) " +
            "contains the following data:")
    public void verifyListRowData(String firstLast, String list, DataTable data) throws Exception {
        CommonSteps.verifyListRowData(firstLast, list, data);
    }

    @When("/(I |)(click|tap)/ on the (first|last) {string} element of the {string} (list|table)")
    public void clickOnSubItem(String firstLast, String item, String list) throws Exception {
        CommonSteps.clickOnSubItem(firstLast, item, list);
    }

    @When("(New/the) user navigates to {string}")
    public void newUserNavigatesTo(String page) throws Exception {
        navigateToPage(page);
    }

    @Then("(New/the) user is able to enter personal details and register")
    public void newUserIsAblePersonalDetailsAndRegister() throws Exception {
        CommonSteps.EnterPersonalDetails();
    }

    @Then("(user/can) (click/tap)(s) register")
    public void userTapsRegister() throws Exception {
//        CommonSteps.tapRegisterButton();
    }

    @And("the user logs off")
    public void theUserLogsOff() throws Exception {
        CommonSteps.clickOnLeftNavigationItem(CommonSteps.createDataTable(Collections.singletonList("Dashboard")));
//        CommonSteps.logoffUser();
    }

    @Then("I tap the navigation links and see the corresponding task panel")
    public void clickNavItem(DataTable content) throws Exception {
        CommonSteps.clickOnLeftNavigationItem(content);
    }

    @And("Practitioner enters {string} into the {string} and select value from search prompt")
    public void practitionerEntersIntoTheAndSelectValueFromSearchPrompt(String value, String field) throws Exception {
        CommonSteps.enterValue(value, field);
        CommonSteps.selectFromSearchPrompt("//span[contains(text(), 'N1234')]");
        CommonSteps.clickOnElement("Search Button");
        CommonSteps.clickOnElement("Highest Access Checkbox");
        CommonSteps.clickOnElement("Save Button");
    }
}
