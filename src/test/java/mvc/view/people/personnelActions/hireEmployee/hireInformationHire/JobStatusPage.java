package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Citizenship I9")
public class JobStatusPage extends Page {
    public JobStatusPage(WebDriver driver) {
        super(driver);
    }

        @Alias("Page Title")
        @FindBy(locator = "css=h1", excludeFromSearch = false)
        public Control pageTitle;

        @Alias("Effective Date")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xEFFDTx13 input", excludeFromSearch = false)
        public Control effectiveDate;

        @Alias("Effective Date Sequence")
        @FindBy(locator = "css=#metadata-form-16__group__JOB_DATA1xEFFSEQx15 input", excludeFromSearch = false)
        public Control effectiveDateSequence;

        @Alias("Action")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xACTIONx19 input", excludeFromSearch = false)
        public Control action;

        @Alias("Reason Code")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xACTION_REASONx23 input", excludeFromSearch = false)
        public Control reasonCode;

        @Alias("Position")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xPOSITION_NBRx28 input", excludeFromSearch = false)
        public Control position;

        @Alias("Department")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xPOSITION_NBRx28 input", excludeFromSearch = false)
        public Control department;

        @Alias("Job Code")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xJOBCODEx37 input", excludeFromSearch = false)
        public Control jobCode;

        @Alias("Reports To")
        @FindBy(locator = "css=#metadata-form-16__JOB_DATA1xREPORTS_TO_IDx40 input", excludeFromSearch = false)
        public Control reportsTo;

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

        @Alias("Citizenship/I9")
        @FindBy(locator = "xpath=//*[contains(text(), 'Citizenship/I9')]']", excludeFromSearch = false)
        public Control citizenshipI9;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
