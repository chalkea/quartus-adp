package pages;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Template Starter")
public class ATemplateStarterPage extends Page {

    @Alias("Logical field name")
    @FindBy(locator = "css=#somelocator", excludeFromSearch = false)
    public Control logicalfieldname;

    public ATemplateStarterPage(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {
        Page.setCurrent( this );
        return this;
    }
}
