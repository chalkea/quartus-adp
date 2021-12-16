package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Job Information")
public class JobInformationPage extends Page {
    public JobInformationPage(WebDriver driver) {
        super(driver);
    }

        @Alias("Page Title")
        @FindBy(locator = "css=h1", excludeFromSearch = false)
        public Control pageTitle;

        @Alias("Standard Hours")
        @FindBy(locator = "css=#metadata-form-18__group__JOB_DATA1AxSTD_HOURSx13 input", excludeFromSearch = false)
        public Control standardHours;

        @Alias("Employee Class")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxEMPL_CLASSx15 input", excludeFromSearch = false)
        public Control employeeClass;

        @Alias("EEO Exclusion")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxEEO_CLASSx16 input", excludeFromSearch = false)
        public Control eeoExclusion;

        @Alias("FLSA Status")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxFLSA_STATUSx17 input", excludeFromSearch = false)
        public Control flsaStatus;

        @Alias("Action")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xACTIONx19 input", excludeFromSearch = false)
        public Control action;

        @Alias("Officer Code")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxOFFICER_CDx18 input", excludeFromSearch = false)
        public Control officerCode;

        @Alias("Full/Part Time")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxFULL_PART_TIMEx19 input", excludeFromSearch = false)
        public Control fullPartTime;

        @Alias("Regular/Temporary")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxREG_TEMPx20 input", excludeFromSearch = false)
        public Control regularTemporary;

        @Alias("Workers Comp Cd")
        @FindBy(locator = "css=#metadata-form-18__JOB_DATA1AxWORKERS_COMP_CDx21 input", excludeFromSearch = false)
        public Control workersCompCd;

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

        @Alias("Job Information")
        @FindBy(locator = "xpath=//*[(text()='Job Information')]", excludeFromSearch = false)
        public Control citizenshipI9;

        @Alias("Job/Pay/Location")
        @FindBy(locator = "xpath=//*[(text()='Job/Pay/Location')]", excludeFromSearch = false)
        public Control jobPayLocation;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
