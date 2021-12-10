package mvc.view.people.personnelActions.hireEmployee;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;

@Alias("Hire Employee")
public class HireEmployee extends Page {

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

    public HireEmployee(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {
        Page.setCurrent( this );
        return this;
    }
}
