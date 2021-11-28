package pages.systemAdmin;

import core.Alias;
import core.Context;
import cucumber.steps.CommonSteps;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;

import static cucumber.steps.CommonSteps.selectTaskFromGlobalSearch;

@Alias("Profile")
public class ProfilePage extends Page {
    @Alias("Title")
    @FindBy(locator = "css=#portlet span.dijitTitlePaneTextNode", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Operator Id")
    @FindBy(locator = "css=#task-search__OS_OPERATOR_ACCT\\:1256xOPRIDx5 input", excludeFromSearch = false)
//    @FindBy(locator = "css=#testing > div > input", excludeFromSearch = false)
    public Edit operatorId;

    @Alias("Select Operator ID")
    @FindBy(locator = "css=body > div.vdl-popup.ng-tns-c21-2.ng-trigger.ng-trigger-popupTransition.ng-star-inserted > div > div > ul > li:nth-child(1) > span", excludeFromSearch = false)
    public Control selectOperatorId;

    @Alias("Search Button")
    @FindBy(locator = "xpath=//span[contains(text(), 'Search')]", excludeFromSearch = false)
    public Control buttonSearch;

    @Alias("Highest Access Checkbox")
    @FindBy(locator = "css=#ENT__OS_OPERATOR_ACCTxHIGHACCESSMODEx24 label", excludeFromSearch = false)
    public Control higestAccessCheckbox;

    @Alias("Save Button")
    @FindBy(locator = "css=#entNonEffTabDiv adp-snackbar adp-button button", excludeFromSearch = false)
    public Control saveButton;

    // Profile Description: #testing > div > input
    // Profile User ID: #testing > div > input
    // Name: #task-search__OS_OPERATOR_ACCT\:1256xNAMEx4
    // Operator id: #testing > div > input

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Page navigate() {
        String locatorPattern = "//*[contains(@class, 'actity-menu-items')]//a[(text()='Profile')]";
        selectTaskFromGlobalSearch((String) Context.get("parentTask"), (String) Context.get("theTask"), locatorPattern);
        Page.setCurrent(this);
        return this;
    }
}
