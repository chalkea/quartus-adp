package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Compensation Details")
public class CompensationDetailsPage extends Page {
    public CompensationDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Effective Date")
    @FindBy(locator = "css=span#XX_metadata-form-14__JOB_DATA3xEFFDTx5_7d26ab8f-aa43-d97e-8fd9-0ec86016845f", excludeFromSearch = false)
    public Control effectiveDate;

    @Alias("Reason")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xDESCRx17", excludeFromSearch = false)
    public Control reason;

    @Alias("Comp Frequency")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xCOMP_FREQUENCYx25 input", excludeFromSearch = false)
    public Control payGroup;

    @Alias("Comp Rate")
    @FindBy(locator = "css=#metadata-form-14__group__JOB_DATA3xCOMPRATEx26 input", excludeFromSearch = false)
    public Control compRate;

    @Alias("Annl Benefits Base")
    @FindBy(locator = "css=#metadata-form-14__group__JOB_DATA3xANNL_BENEF_BASE_RTx28 input", excludeFromSearch = false)
    public Control annlBenefitsBase;

    @Alias("Comp Date")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xCOMP_ENTRY_DTx29 input", excludeFromSearch = false)
    public Control compDate;

    @Alias("Currency Code")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xCURRENCY_CDx31 input", excludeFromSearch = false)
    public Control currencyCode;

    @Alias("Hourly Rate")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xHOURLY_RTx39 span", excludeFromSearch = false)
    public Control hourlyRate;

    @Alias("Monthly Rate")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xMONTHLY_RTx40 span", excludeFromSearch = false)
    public Control monthlyRate;

    @Alias("Annual Rate")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xANNUAL_RTx41 span", excludeFromSearch = false)
    public Control annualRate;

    @Alias("Aggregate Amt")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xCHANGE_AMTx44 span", excludeFromSearch = false)
    public Control aggregateAmt;

    @Alias("Aggregate percent")
    @FindBy(locator = "css=#metadata-form-14__JOB_DATA3xCHANGE_PCTx45 span", excludeFromSearch = false)
    public Control aggregatePercent;

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

    @Alias("Compensation Details")
    @FindBy(locator = "xpath=//*[(text()='Compensation Details')]", excludeFromSearch = false)
    public Control compensationDetails;

    @Alias("Earnings Distribution")
    @FindBy(locator = "xpath=//*[(text()='Earnings Distribution')]", excludeFromSearch = false)
    public Control jobPayLocation;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
