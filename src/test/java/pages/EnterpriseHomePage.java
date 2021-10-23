package pages;

import core.Alias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Ehrms Dashboard")
public class EnterpriseHomePage extends Page {
    public EnterpriseHomePage(WebDriver driver) {
        super(driver);
    }

    @Alias("People")
    @FindBy(locator = "xpath=//span[contains(text(), 'People')]", excludeFromSearch = false)
    public Control leftNavPeople;

    @Alias("Payroll")
    @FindBy(locator = "xpath=//span[contains(text(), 'Payroll')]", excludeFromSearch = false)
    public Control leftNavPayroll;

    @Alias("NAS User")
    @FindBy(locator = "css=.nas-user-dropdown", excludeFromSearch = false)
    public Control leftNavNasUser;

    @Alias("Log off")
    @FindBy(locator = "css=#nasShellMasthead  .fa-power-off", excludeFromSearch = false)
    public Control leftNavLogoff;

    @Alias("Ok")
    @FindBy(locator = "id=revit_form_Button_0", excludeFromSearch = false)
    public Control btnOk;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
