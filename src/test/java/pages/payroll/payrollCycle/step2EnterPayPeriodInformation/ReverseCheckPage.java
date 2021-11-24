package pages.payroll.payrollCycle.step2EnterPayPeriodInformation;

import core.Alias;
import core.Context;
import cucumber.steps.CommonSteps;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;

@Alias("Reverse Check")
public class ReverseCheckPage extends Page {
    @Alias("Page Title")
    @FindBy(locator = "css=#portlet .dijitTitlePaneTextNode", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Pay Group")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Pay Group']/following-sibling::app-metadata-uppercase/input", excludeFromSearch = false)
    public Edit payGroup;

    @Alias("Date Picker")
    @FindBy(locator = "xpath=//adp-date-picker/div/input", excludeFromSearch = false)
    public Edit datePicker;

    @Alias("Check Number")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Check Number']/following-sibling::app-metadata-number/adp-formatted-field/div/input", excludeFromSearch = false)
    public Edit checkNumber;

    @Alias("Autolink Payroll Run Year")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Autolink Payroll Run Year']/following-sibling::app-metadata-uppercase/input", excludeFromSearch = false)
    public Edit autolinkPayrollRunYear;

    @Alias("Week Number")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Week Number']/following-sibling::app-metadata-number/adp-formatted-field/div/input", excludeFromSearch = false)
    public Edit weekNumber;

    @Alias("Autolink Payroll Number")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Autolink Payroll Number']/following-sibling::app-metadata-uppercase/input", excludeFromSearch = false)
    public Edit autolinkPayrollNumber;

    @Alias("Empl ID")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Empl ID']/following-sibling::app-metadata-uppercase/input", excludeFromSearch = false)
    public Edit emplId;

    @Alias("Autolink File Number")
    @FindBy(locator = "//*[@data-adp-field-label='Empl ID']/following-sibling::app-metadata-uppercase/input", excludeFromSearch = false)
    public Edit autolinkFileNumber;

    @Alias("Name")
    @FindBy(locator = "xpath=//*[@data-adp-field-label='Name']/following-sibling::van-metadata-input-text/input", excludeFromSearch = false)
    public Edit name;

    @Alias("Search Button")
    @FindBy(locator = "xpath=//span[contains(text(),'Search')]", excludeFromSearch = false)
    public Control searchButton;

    @Alias("Reset Button")
    @FindBy(locator = "xpath=//span[contains(text(),'Reset')]", excludeFromSearch = false)
    public Control reset;

    @Override
    public Page navigate() {
        String locatorPattern = "\"//*[text()='%s']/following-sibling::div/a\"";

        CommonSteps.selectTaskFromGlobalSearch((String) Context.get("parentTask"), (String) Context.get("task"),locatorPattern);
        Page.setCurrent( this );
        return this;
    }
    public ReverseCheckPage(WebDriver driver) { super(driver); }
}
