package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Cost Number Detail")
public class CostNumberDetailPage extends Page {
    public CostNumberDetailPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Effective Date")
    @FindBy(locator = "css=#metadata-form-20__AL_JOB_DATA2xEFFDTx8", excludeFromSearch = false)
    public Control effectiveDate;

    @Alias("Reason")
    @FindBy(locator = "css=#metadata-form-20__AL_JOB_DATA2xDESCRx15 span", excludeFromSearch = false)
    public Control reason;

    @Alias("Effective Date Sequence")
    @FindBy(locator = "css=#metadata-form-20__AL_JOB_DATA2xEFFSEQx10 span", excludeFromSearch = false)
    public Control effectiveDateSequence;


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

    @Alias("Autolink Details")
    @FindBy(locator = "xpath=//*[(text()='Autolink Details')]", excludeFromSearch = false)
    public Control autolinkDetails;

    @Alias("Cost Number Detail")
    @FindBy(locator = "xpath=//*[(text()='Cost Number Detail')]", excludeFromSearch = false)
    public Control costNumberDetail;

    @Alias("Benefit Program")
    @FindBy(locator = "xpath=//*[(text()='Benefit Program')]", excludeFromSearch = false)
    public Control benefitProgram;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
