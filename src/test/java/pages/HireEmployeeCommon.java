package pages;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;

@Alias("Hire Employee Common")
public class HireEmployeeCommon extends Page {

    @Alias("Last Name Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__lastName span.valid-label", excludeFromSearch = false)
    public Control labelLastName;

    @Alias("Last Name")
    @FindBy(locator = "css=input#personal-info-employee-search__lastName", excludeFromSearch = false)
    public Edit lastName;

    @Alias("First Name Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__firstName span.valid-label", excludeFromSearch = false)
    public Control labelFirstName;

    @Alias("First Name")
    @FindBy(locator = "css=input#personal-info-employee-search__firstName", excludeFromSearch = false)
    public Edit firstName;

    @Alias("Ssn Last4 Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__ssnLastFour span.valid-label", excludeFromSearch = false)
    public Control labelSsnLast4;

    @Alias("Ssn Last4")
    @FindBy(locator = "css=#personal-info-employee-search__group__ssnLastFour input", excludeFromSearch = false)
    public Edit ssnLast4;

    @Alias("Employee ID Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__employeeId span", excludeFromSearch = false)
    public Control labelEmployeeId;

    @Alias("Employee ID")
    @FindBy(locator = "css=#personal-info-employee-search__group__ssnLastFour input", excludeFromSearch = false)
    public Edit employeeId;

    @Alias("Status Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__employeeId span", excludeFromSearch = false)
    public Control labelStatus;

    @Alias("Status")
    @FindBy(locator = "css=#personal-info-employee-search__status input", excludeFromSearch = false)
    public Edit status;

    @Alias("File Number Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__fileNumber span.valid-label", excludeFromSearch = false)
    public Control labelFileNumber;

    @Alias("File Number")
    @FindBy(locator = "css=#personal-info-employee-search__group__fileNumber input", excludeFromSearch = false)
    public Edit fileNumber;

    @Alias("Pay Group Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__paygroup span.valid-label", excludeFromSearch = false)
    public Control labelPayGroup;

    @Alias("Pay Group")
    @FindBy(locator = "css=#personal-info-employee-search__group__paygroup input", excludeFromSearch = false)
    public Edit payGroup;

    @Alias("Reports To Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__reportToID span.valid-label", excludeFromSearch = false)
    public Control labelReportTo;

    @Alias("Reports To")
    @FindBy(locator = "css=#personal-info-employee-search__reportToID input", excludeFromSearch = false)
    public Edit reportsTo;

    @Alias("Department Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__department span.valid-label", excludeFromSearch = false)
    public Control labelDepartment;

    @Alias("Department")
    @FindBy(locator = "css=#personal-info-employee-search__group__paygroup input", excludeFromSearch = false)
    public Edit department;

    @Alias("Location Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__location span.valid-label", excludeFromSearch = false)
    public Control labelLocation;

    @Alias("Location")
    @FindBy(locator = "css=#personal-info-employee-search__location input", excludeFromSearch = false)
    public Edit location;

    @Alias("Job Code Title Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__job span.valid-label", excludeFromSearch = false)
    public Control labelJobCodeTitle;

    @Alias("Job Code Title")
    @FindBy(locator = "css=#personal-info-employee-search__job input", excludeFromSearch = false)
    public Edit jobCodeTitle;

    @Alias("Cost Number Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__costNumber span.valid-label", excludeFromSearch = false)
    public Control labelCostNumber;

    @Alias("Cost Number")
    @FindBy(locator = "css=#personal-info-employee-search__group__costNumber input", excludeFromSearch = false)
    public Edit costNumber;

    @Alias("Payroll Department Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__payrollDepartment span.valid-label", excludeFromSearch = false)
    public Control labelpayrollDepartment;

    @Alias("Payroll Department")
    @FindBy(locator = "css=#personal-info-employee-search__payrollDepartment Input", excludeFromSearch = false)
    public Edit payrollDepartment;

    @Alias("Position Number Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__positionNbr  span.valid-label", excludeFromSearch = false)
    public Control labelPositionNumber;

    @Alias("Position Number")
    @FindBy(locator = "css=#personal-info-employee-search__group__positionNbr input", excludeFromSearch = false)
    public Edit positionNumber;

    @Alias("Payroll Status Label")
    @FindBy(locator = "css=#personal-info-employee-search__group__alEmplStatus  span.valid-label", excludeFromSearch = false)
    public Control labelPayrollStatus;

    @Alias("Payroll Status")
    @FindBy(locator = "css=#personal-info-employee-search__alEmplStatus input", excludeFromSearch = false)
    public Edit payrollStatus;

    @Alias("Search Button")
    @FindBy(locator = "css=button.vdl-button--primary span", excludeFromSearch = false)
    public Edit buttonSearch;

    @Alias("Reset Button")
    @FindBy(locator = "css=#app-microapp-enterprise-ui-root-container adp-button:nth-child(3) button span", excludeFromSearch = false)
    public Edit buttonReset;

    public HireEmployeeCommon(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {
        Page.setCurrent( this );
        return this;
    }
}
