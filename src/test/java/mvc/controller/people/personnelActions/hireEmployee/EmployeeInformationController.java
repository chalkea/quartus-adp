package mvc.controller.people.personnelActions.hireEmployee;

import controls.AdpControl;
import cucumber.steps.CommonSteps;
import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.EmployeeInformationModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.EmployeeInformationPage;
import org.openqa.selenium.By;
import ui.Page;
import ui.PageFactory;
import java.util.HashMap;

public class EmployeeInformationController implements ControllerInterface {

    public static final String SOCIAL_SECURITY = "Social Security";
    public static final String FIRST_NAME = "First Name";
    public static final String MIDDLE_NAME = "Middle Name";
    public static final String LAST_NAME = "Last Name";
    public static final String NAME_PREFIX = "Name Prefix";
    public static final String APPLIED_FOR_SSN = "Applied For Ssn";
    public static final String SSN_IS_FEDERAL_EIN = "Ssn Is Federal Ein";
    public static final String LOCAL_NATIONAL = "Local National";
    public static final String NAME_SUFFIX = "Name Suffix";
    public static final String ALTER_DERIVED_NAME = "Alter Derived Name";
    public static final String ADDRESS_1 = "Address1";
    public static final String ADDRESS_2 = "Address2";
    public static final String ADDRESS_3 = "Address3";
    public static final String CITY = "City";
    public static final String ST_PROV = "St Prov";
    public static final String POSTAL_ZIP = "Postal Zip";
    public static final String COUNTRY = "Country";
    public static final String DATE_OF_RESIDENCE = "Date Of Residence";
    public static final String COUNTY = "County";
    public static final String PHONE_TYPE = "Phone Type";
    public static final String PHONE_SEARCH = "Phone Search";
    public static final String PHONE = "Phone";
    public static final String EMAIL_BUSINESS = "Email Business";
    public static final String EMAIL_PERSONAL = "Email Personal";
    public static final String YES = "yes";
    public static final String ST_PROV_SEARCH = "StProv Search";

    public void click(String element) {
        AdpControl.clickOnElement(element);
    }

    public void populateFromDataModel() {
        EmployeeInformationModel employeeInformationModel = new EmployeeInformationModel();
        HashMap<String, String> employeeInformation = employeeInformationModel.loadData();
        initializePage();
        System.out.println( employeeInformation );
        enterIdentityInfo(employeeInformation);
        enterNameInfo(employeeInformation);
        enterAddressInfo(employeeInformation);
        enterAndSelectContactInfo(employeeInformation);
    }

    private void enterAndSelectContactInfo(HashMap<String, String> employeeInformation) {
        AdpControl.clickOnElement(PHONE_SEARCH);
        CommonSteps.doWaitForSearchPromptList();
        String locator = String.format("//span[contains(text(), '%s')]", "CEL1 - Cellular Phone 1");
        Page.getCurrent().getDriver().findElement(By.xpath(locator)).click();
//        CommonSteps.selectByVisibleText(employeeInformation.get(PHONE_TYPE), By.xpath(locator));
        AdpControl.typeAndTab(employeeInformation.get(PHONE), PHONE);
        AdpControl.typeAndTab(employeeInformation.get(EMAIL_BUSINESS), EMAIL_BUSINESS);
        AdpControl.typeAndTab(employeeInformation.get(EMAIL_PERSONAL), EMAIL_PERSONAL);
    }

    private void enterAddressInfo(HashMap<String, String> employeeInformation) {
        AdpControl.typeAndTab(employeeInformation.get(ADDRESS_1), ADDRESS_1);
        AdpControl.typeAndTab(employeeInformation.get(ADDRESS_2), ADDRESS_2);
        AdpControl.typeAndTab(employeeInformation.get(ADDRESS_3), ADDRESS_3);
        AdpControl.typeAndTab(employeeInformation.get(CITY), CITY);
        AdpControl.clickOnElement(ST_PROV_SEARCH);
        AdpControl.clickOnElement("StProvList");
        //CommonSteps.typeAndEnter(employeeInformation.get(ST_PROV), ST_PROV);
        AdpControl.typeAndTab(employeeInformation.get(POSTAL_ZIP), POSTAL_ZIP);
        //CommonSteps.typeAndEnter(employeeInformation.get(COUNTRY), COUNTRY);
        AdpControl.typeAndTab(employeeInformation.get(DATE_OF_RESIDENCE), DATE_OF_RESIDENCE);
        //CommonSteps.typeAndTab("12/16/1996", DATE_OF_RESIDENCE);
        AdpControl.typeAndTab(employeeInformation.get(COUNTY), COUNTY);
    }

    private void enterNameInfo(HashMap<String, String> employeeInformation) {
        AdpControl.typeAndTab(employeeInformation.get(FIRST_NAME), FIRST_NAME);
        AdpControl.typeAndTab(employeeInformation.get(MIDDLE_NAME), MIDDLE_NAME);
        AdpControl.typeAndTab(employeeInformation.get(LAST_NAME), LAST_NAME);
        AdpControl.typeAndTab(employeeInformation.get(NAME_PREFIX), NAME_PREFIX);
//        CommonSteps.typeAndTab(employeeInformation.get(NAME_SUFFIX), NAME_SUFFIX);
        if (employeeInformation.get(ALTER_DERIVED_NAME).equalsIgnoreCase(YES)) AdpControl.clickOnElement(ALTER_DERIVED_NAME);
    }

    private void enterIdentityInfo(HashMap<String, String> employeeInformation) {
        AdpControl.typeAndTab(employeeInformation.get(SOCIAL_SECURITY), SOCIAL_SECURITY);
        if (employeeInformation.get(APPLIED_FOR_SSN).equalsIgnoreCase(YES)) AdpControl.clickOnElement(APPLIED_FOR_SSN);
        if (employeeInformation.get(SSN_IS_FEDERAL_EIN).equalsIgnoreCase(YES)) AdpControl.clickOnElement(SSN_IS_FEDERAL_EIN);
        if (employeeInformation.get(LOCAL_NATIONAL).equalsIgnoreCase(YES)) AdpControl.clickOnElement(LOCAL_NATIONAL);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(EmployeeInformationPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
