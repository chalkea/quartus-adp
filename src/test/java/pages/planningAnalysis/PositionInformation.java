package pages.planningAnalysis;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;

@Alias("Position Information")
public class PositionInformation extends Page {

    @Alias("Page Title")
    @FindBy(locator = "css=span.dijitTitlePaneTextNode", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Empl ID")
    @FindBy(locator = "css=div input.vdl-textbox", excludeFromSearch = false)
    public Edit emplId;

    @Alias("Empl ID Label")
    @FindBy(locator = "css=span.valid-label.ng-star-inserted", excludeFromSearch = false)
    public Control labelEmplId;

    @Alias("Ok Button")
    @FindBy(locator = "css=button .button__content", excludeFromSearch = false)
    public Control buttonOk;

    public PositionInformation(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {
        Page.setCurrent( this );
        return this;
    }
}
