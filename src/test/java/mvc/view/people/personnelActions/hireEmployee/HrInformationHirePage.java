package mvc.view.people.personnelActions.hireEmployee;

import core.Alias;
import core.Context;
import cucumber.steps.CommonSteps;
import org.openqa.selenium.WebDriver;
import pages.HireEmployee;
import ui.FindBy;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;
import ui.controls.Edit;

import static cucumber.steps.CommonSteps.selectTaskFromGlobalSearch;

@Alias("HR Information Hire")
public class HrInformationHirePage extends Page {

    @Alias("Page Title")
    @FindBy(locator = "css=span.dijitTitlePaneTextNode", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Empl ID")
    @FindBy(locator = "css=input", excludeFromSearch = false)
    public Edit emplId;

    @Alias("Empl ID Label")
    @FindBy(locator = "css=span.valid-label", excludeFromSearch = false)
    public Control labelEmplId;

    @Alias("Ok Button")
    @FindBy(locator = "css=button .button__content", excludeFromSearch = false)
    public Control buttonOk;

    public HrInformationHirePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Page navigate() {
        String theTask = (String) Context.get("theTask");
        String locatorPattern = String.format("//*[contains(@class, 'actity-menu-items')]//a[(text()='%s')]", theTask);
        selectTaskFromGlobalSearch((String) Context.get("parentTask"), theTask, locatorPattern);
        try {
            PageFactory.init(HrInformationHirePage.class);
            CommonSteps.clickOnElement("Ok Button");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Page.setCurrent(this);
        return this;
    }
}
