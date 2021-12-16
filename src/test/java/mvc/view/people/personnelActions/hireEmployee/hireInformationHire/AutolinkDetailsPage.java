package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Autolink Details")
public class AutolinkDetailsPage extends Page {
    public AutolinkDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Effective Date")
    @FindBy(locator = "css=#metadata-form-18__AL_JOB_DATAxEFFDTx26", excludeFromSearch = false)
    public Control effectiveDate;

    @Alias("Reason")
    @FindBy(locator = "css=#metadata-form-18__AL_JOB_DATAxDESCRx35 span", excludeFromSearch = false)
    public Control reason;

    @Alias("Effective Date Sequence")
    @FindBy(locator = "css=#metadata-form-18__AL_JOB_DATAxEFFSEQx28 span", excludeFromSearch = false)
    public Control effectiveDateSequence;

    @Alias("File Number")
    @FindBy(locator = "css=#metadata-form-18__group__AL_JOB_DATAxFILE_NBRx38 input", excludeFromSearch = false)
    public Control fileNumber;


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

    @Alias("Earnings Distribution")
    @FindBy(locator = "xpath=//*[(text()='Earnings Distribution')]", excludeFromSearch = false)
    public Control jobPayLocation;

    @Alias("Autolink Details")
    @FindBy(locator = "xpath=//*[(text()='Autolink Details')]", excludeFromSearch = false)
    public Control autolinkDetails;

    @Alias("Cost Number Detail")
    @FindBy(locator = "xpath=//*[(text()='Cost Number Detail')]", excludeFromSearch = false)
    public Control costNumberDetail;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
