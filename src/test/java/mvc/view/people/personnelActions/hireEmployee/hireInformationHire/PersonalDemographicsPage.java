package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Personal Demographics")
public class PersonalDemographicsPage extends Page {
    public PersonalDemographicsPage(WebDriver driver) {
        super(driver);
    }

        @Alias("Page Title")
        @FindBy(locator = "css=h1", excludeFromSearch = false)
        public Control pageTitle;

        @Alias("Race Ethnicity")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxRACE_ETHNICITYx3 input", excludeFromSearch = false)
        public Control raceEthnicity;

        @Alias("Gender")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxSEXx4 input", excludeFromSearch = false)
        public Control gender;

        @Alias("Marital Status")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxMAR_STATUSx5 i", excludeFromSearch = false)
        public Control maritalStatus;

        @Alias("Marital Status Date")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxMAR_STATUS_DTx6 input", excludeFromSearch = false)
        public Control maritalStatusDate;

        @Alias("Birthdate")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxBIRTHDATEx7 input", excludeFromSearch = false)
        public Control birthDate;

        @Alias("Highest Educ Level")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxHIGHEST_EDUC_LVLx10 input", excludeFromSearch = false)
        public Control highestEducLevel;

        @Alias("Retiree Billing Method")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxRETIREE_BILLINGx11 input", excludeFromSearch = false)
        public Control retireeBillingMethod;

        @Alias("Medicare Date")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxMEDICARE_DTx12", excludeFromSearch = false)
        public Control medicareDate;

        @Alias("Diabled")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxDISABLEDx14 input", excludeFromSearch = false)
        public Control disabled;

        @Alias("Discharge Dt")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxMIL_DISCHARGE_DTx22 input", excludeFromSearch = false)
        public Control dischargeDt;

        @Alias("Status Vets 4212")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxMILITARY_VETS100Ax17 input", excludeFromSearch = false)
        public Control statusVets4212;

        @Alias("Status Vets 100")
        @FindBy(locator = "css=#metadata-form-4__JOB_DATABxMILITARY_VETS100Ax17 input", excludeFromSearch = false)
        public Control statusVets100;

        @Alias("Next Button")
        @FindBy(locator = "xpath=//span[text()='Next']", excludeFromSearch = false)
        public Control nextButton;

        @Alias("Prev Button")
        @FindBy(locator = "xpath=//span[text()='Prev']", excludeFromSearch = false)
        public Control prevButton;

        @Alias("Cancel Button")
        @FindBy(locator = "xpath=//*[text()='Cancel'][@class='button__content']", excludeFromSearch = false)
        public Control cancelButton;

        @Alias("Citizenship/I9")
        @FindBy(locator = "xpath=//*[contains(text(), 'Citizenship/I9')]']", excludeFromSearch = false)
        public Control citizenshipI9;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
