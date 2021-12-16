package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Job Pay Location")
public class JobPayLocationPage extends Page {
    public JobPayLocationPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Effective Date")
    @FindBy(locator = "css=#XX_metadata-form-20__JOB_DATA2xEFFDTx6_82649829-ad80-d07b-0386-cff056b0d797", excludeFromSearch = false)
    public Control effectiveDate;

    @Alias("Company")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xCOMPANYx14 input", excludeFromSearch = false)
    public Control company;

    @Alias("Pay Group")
    @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxEEO_CLASSx16 input", excludeFromSearch = false)
    public Control payGroup;

    @Alias("Employee Type")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xEMPL_TYPEx24 input", excludeFromSearch = false)
    public Control employeeType;

    @Alias("Work Location")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xLOCATIONx2z input", excludeFromSearch = false)
    public Control workLocation;

    @Alias("Reporting Location")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xREPORTING_LOCATIONx42 input", excludeFromSearch = false)
    public Control reportingLocation;

    @Alias("Geog Differential")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xGEOG_DIFF_IDx45 input", excludeFromSearch = false)
    public Control geogDifferential;

    @Alias("Holiday Schedule")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xHOLIDAY_SCHEDULEx48 input", excludeFromSearch = false)
    public Control holidaySchedule;

    @Alias("Salary Plan")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xSAL_ADMIN_PLANx53 input", excludeFromSearch = false)
    public Control salaryPlan;

    @Alias("Salary Grade")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xGRADEx55 input", excludeFromSearch = false)
    public Control salaryGrade;

    @Alias("Grade Entry Date")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xGRADE_ENTRY_DTx57 input", excludeFromSearch = false)
    public Control gradeEntryDate;

    @Alias("Salary Step")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xSTEPx59 input", excludeFromSearch = false)
    public Control salaryStep;

    @Alias("Salary Entry Date")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xSTEP_ENTRY_DTx60 input", excludeFromSearch = false)
    public Control salaryEntryDate;

    @Alias("Next Step Date")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xNEXT_STEP_DTx61 input", excludeFromSearch = false)
    public Control nextStepDate;

    @Alias("Variable Plan")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xVARIABLE_PLAN_CDx62 input", excludeFromSearch = false)
    public Control variablePlan;

    @Alias("Variable Plan Date")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xVAR_PLAN_ENTRY_DTx64 input", excludeFromSearch = false)
    public Control variablePlanDate;

    @Alias("Split Base")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xSPLIT_BASEx65 input", excludeFromSearch = false)
    public Control splitBase;

    @Alias("Split Variable")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xSPLIT_VARIABLEx68", excludeFromSearch = false)
    public Control splitVariable;

    @Alias("Allow Draw")
    @FindBy(locator = "css=#metadata-form-20__JOB_DATA2xALLOW_DRAWx69 label", excludeFromSearch = false)
    public Control allowDraw;

    //********
    @Alias("Next Button")
    @FindBy(locator = "xpath=//span[text()='Next']", excludeFromSearch = false)
    public Control nextButton;

    @Alias("Prev Button")
    @FindBy(locator = "xpath=//span[text()='Prev']", excludeFromSearch = false)
    public Control prevButton;

    @Alias("Cancel Button")
    @FindBy(locator = "xpath=//*[text()='Cancel'][@class='button__content']", excludeFromSearch = false)
    public Control cancelButton;

    @Alias("Job/Pay/Location")
    @FindBy(locator = "xpath=//*[(text()='Job/Pay/Location')]", excludeFromSearch = false)
    public Control jobPayLocation;

    @Alias("Compensation Details")
    @FindBy(locator = "xpath=//*[(text()='Compensation Details')]", excludeFromSearch = false)
    public Control compensationDetails;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
