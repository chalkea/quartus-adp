package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Earnings Distribution")
public class EarningsDistributionPage extends Page {
    public EarningsDistributionPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Effective Date")
    @FindBy(locator = "css=#metadata-form-16__JOB_DATA4xEFFDTx5", excludeFromSearch = false)
    public Control effectiveDate;

    @Alias("Reason")
    @FindBy(locator = "css=#metadata-form-16__JOB_DATA4xDESCRx12 span", excludeFromSearch = false)
    public Control reason;

    @Alias("Effective Date Sequence")
    @FindBy(locator = "css=#metadata-form-16__JOB_DATA4xEFFSEQx7 span", excludeFromSearch = false)
    public Control effectiveDateSequence;

    @Alias("Regular Shift")
    @FindBy(locator = "css=#metadata-form-16__JOB_DATA4xSHIFTx16 input", excludeFromSearch = false)
    public Control regularShift;

    @Alias("GL Pay Type")
    @FindBy(locator = "css=#metadata-form-16__group__JOB_DATA4xGL_PAY_TYPEx23 input", excludeFromSearch = false)
    public Control glPayType;

    @Alias("Account Fund")
    @FindBy(locator = "css=#metadata-form-16__JOB_DATA4xACCT_CDx24 input", excludeFromSearch = false)
    public Control accountFund;

    @Alias("None Radio Button")
    @FindBy(locator = "xpath=//span[text()='None']", excludeFromSearch = false)
    public Control noneRadioButton;

    @Alias("By Percent")
    @FindBy(locator = "xpath=//span[text()='By Percent']", excludeFromSearch = false)
    public Control byPercentRadioButton;

    @Alias("Add Item")
    @FindBy(locator = "css=#metadata-form-16__group__collectionJOB_DATA4x34x1xz a", excludeFromSearch = false)
    public Control addItemLink;

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

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
