package mvc.view.people.personnelActions.hireEmployee;

import core.Alias;
import core.Context;
import cucumber.steps.CommonSteps;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;
import ui.controls.Edit;

import static cucumber.steps.CommonSteps.selectTaskFromGlobalSearch;

@Alias("Employee Information")
public class EmployeeInformationPage extends Page{

    @Alias("Social Security No")
    @FindBy(locator = "css=app-metadata-ssn input", excludeFromSearch = false)
    public Edit socialSecurityNo;

    @Alias("Applied for SSN")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxAPPLIED_FOR_SSNx8 label", excludeFromSearch = false)
    public Control appliedForSsn;

    @Alias("First Name")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxFIRST_NAMEx13", excludeFromSearch = false)
    public Edit firstName;

    @Alias("Middle Name")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxMIDDLE_NAMEx14", excludeFromSearch = false)
    public Edit middleName;

    @Alias("Last Name")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxLAST_NAMEx15", excludeFromSearch = false)
    public Edit lastName;

    @Alias("Name Prefix")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxNAME_PREFIXx16", excludeFromSearch = false)
    public Edit namePrefix;

    @Alias("Alter Derived name")
    @FindBy(locator = "css=#XX_metadata-form-2__JOB_DATAAxOVERRIDE_NAME_CMDx18_b018817c-fd20-32ff-4511-d329ed9fbd82  button", excludeFromSearch = false)
    public Control alterDerivedName;

    @Alias("Address1")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxSTREET1x20", excludeFromSearch = false)
    public Edit address1;

    @Alias("Address2")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxSTREET2x21", excludeFromSearch = false)
    public Edit address2;

    @Alias("Address3")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxSTREET3x22", excludeFromSearch = false)
    public Edit address3;

    @Alias("City")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxCITYx23", excludeFromSearch = false)
    public Edit city;

    @Alias("StProv")
    @FindBy(locator = "css=[data-popup-uid='VanBaseDropdownInput-1638411361778'", excludeFromSearch = false)
    public Edit stProv;

    @Alias("StProv Search")
    @FindBy(locator = "css=div[data-popup-uid='VanBaseDropdownInput-1638411361778'] i", excludeFromSearch = false)
    public Control stProvSearch;

    @Alias("Postal Zip")
    @FindBy(locator = "css=#metadata-form-2__group__JOB_DATAAxZIPx26  input", excludeFromSearch = false)
    public Edit postalZip;

    @Alias("Country")
    @FindBy(locator = "css=#metadata-form-2__group__JOB_DATAAxZIPx26  input", excludeFromSearch = false)
    public Edit country;

    @Alias("Country Search")
    @FindBy(locator = "css=[data-popup-uid='VanBaseDropdownInput-1638411361779'] i.fa-search", excludeFromSearch = false)
    public Control countrySearch;

    @Alias("Date of Residence")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxRESIDENCE_DTx29  input", excludeFromSearch = false)
    public Edit dateOfResidence;

    @Alias("County")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxCOUNTYx30", excludeFromSearch = false)
    public Edit county;

    @Alias("Phone Type")
    @FindBy(locator = "css=[data-popup-uid='VanBaseDropdownInput-1638411361780'] input", excludeFromSearch = false)
    public Edit phoneType;

    @Alias("Phone")
    @FindBy(locator = "css=#metadata-form-2__group__JOB_DATAAxPHONEx34  input", excludeFromSearch = false)
    public Edit phone;

    @Alias("Email Business")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxEMAIL_ADDRESSx36", excludeFromSearch = false)
    public Edit emailBusiness;

    @Alias("Email Personal")
    @FindBy(locator = "css=#metadata-form-2__JOB_DATAAxEMAIL_ADDRESS2x37", excludeFromSearch = false)
    public Edit emailPersonal;

    @Alias("Cancel Button")
    @FindBy(locator = "xpath=//span[@class='button__content'][contains(text(), 'Cancel')]", excludeFromSearch = false)
    public Edit cancelButton;

    @Alias("Prev Button")
    @FindBy(locator = "xpath=//span[@class='button__content'][contains(text(), 'Prev')]", excludeFromSearch = false)
    public Edit prevButton;

    @Alias("Next Button")
    @FindBy(locator = "xpath=//span[@class='button__content'][contains(text(), 'Next')]", excludeFromSearch = false)
    public Edit nextButton;

    @Alias("Error Msg Bottom")
    @FindBy(locator = "xpath=//p[contains(text(), 'You cannot move forward until you have completed everything above.')]", excludeFromSearch = false)
    public Edit errorMessageBottom;


    public EmployeeInformationPage(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {

        String theTask = (String) Context.get("theTask");
        String locatorPattern = String.format("//*[contains(@class, 'actity-menu-items')]//a[(text()='%s')]", theTask);
        selectTaskFromGlobalSearch((String) Context.get("parentTask"), theTask, locatorPattern);
        try {
            PageFactory.init(EmployeeInformationPage.class);
            CommonSteps.clickOnElement("Ok Button");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Page.setCurrent( this );
        return this;
    }
}


