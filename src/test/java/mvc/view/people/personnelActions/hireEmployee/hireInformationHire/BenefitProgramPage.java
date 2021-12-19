package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Benefit Program")
public class BenefitProgramPage extends Page {
    public BenefitProgramPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Event Date")
    @FindBy(locator = "css=#metadata-form-22__JOB_DATA5xEVENT_DTx11 input", excludeFromSearch = false)
    public Control eventDate;

    @Alias("Benefit Program")
    @FindBy(locator = "css=#metadata-form-22__JOB_DATA5xBENEFIT_PROGRAMx12 input", excludeFromSearch = false)
    public Control benefitProgram;

    @Alias("Benefit Program Search")
    @FindBy(locator = "css=#metadata-form-22__JOB_DATA5xBENEFIT_PROGRAMx12 i", excludeFromSearch = false)
    public Control benefitProgramSearch;

    @Alias("Benefit Program dropdown")
    @FindBy(locator = "xpath=//*[@class='vdl-popup__content van-search-input__popup']//*/li[1]", excludeFromSearch = false)
    public Control benefitProgramDropdown;

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

    @Alias("Cost Number Detail")
    @FindBy(locator = "xpath=//*[(text()='Cost Number Detail')]", excludeFromSearch = false)
    public Control costNumberDetail;

    @Alias("Benefit Program")
    @FindBy(locator = "xpath=//*[(text()='Benefit Program')]", excludeFromSearch = false)
    public Control benefitProgramLink;

    @Alias("Employment Information")
    @FindBy(locator = "xpath=//*[(text()='Employment Information')]", excludeFromSearch = false)
    public Control employmentInformation;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
