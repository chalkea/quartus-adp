package mvc.view.people.personnelActions.hireEmployee;

import core.Alias;
import core.Context;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
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
    @FindBy(locator = "xpath=//span[contains(@class, 'button__content')][text()='Ok']", excludeFromSearch = false)
    public Control buttonOk;

    public HrInformationHirePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Page navigate() {
        doGlobalSearchNavigationSequence();
        Page.setCurrent(this);
        return this;
    }

    private void doGlobalSearchNavigationSequence() {
        String theTask = (String) Context.get("theTask");
        theTask = theTask.replaceAll("Hire","\\(Hire\\)");
        String locatorPattern = String.format("//*[contains(@class, 'actity-menu-items')]//a[(text()='%s')]", theTask);
        selectTaskFromGlobalSearch((String) Context.get("parentTask"), theTask, locatorPattern);
    }
}
