package mvc.controller.people.personnelActions.hireEmployee;

import cucumber.steps.CommonSteps;
import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.PersonalDemographicsModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.PersonalDemographicsPage;
import org.openqa.selenium.Keys;
import ui.Page;
import ui.PageFactory;

import java.util.Map;

public class PersonalDemographicsController implements ControllerInterface {
    public static final String RACE_ETHNICITY = "Race Ethnicity";
    public static final String GENDER = "Gender";
    public static final String MARITAL_STATUS = "Marital Status";
    public static final String MARITAL_STATUS_DATE = "Marital Status Date";
    public static final String BIRTH_DATE = "Birthdate";
    public static final String HIGHEST_EDUC_LEVEL = "Highest Educ Level";
    public static final String RETIREE_BILLING_METHOD = "Retiree Billing Method";
    public static final String MEDICARE_DATE = "Medicare Date";
    public static final String DISABLED = "Disabled";
    public static final String DISCHARGE_DT = "Discharge Dt";
    public static final String STATUS_VETS_4212 = "Status Vets 4212";
    public static final String STATUS_VETS_100 = "Status Vets 100";

    PersonalDemographicsModel personalDemographicsModel = new PersonalDemographicsModel();
    Map<String, String> personalDemograpchicsInfo = personalDemographicsModel.loadData();

    @Override
    public void click(String element) {
        CommonSteps.clickOnElement(element);
    }

    @Override
    public void populateFromDataModel() {
        initialPage();
        CommonSteps.clickOnElement(GENDER);
        String locator = String.format("//span[text()='%s']", personalDemograpchicsInfo.get(GENDER));
        Page.getCurrent().buildXpathControl(locator).click();

        CommonSteps.clickOnElement(MARITAL_STATUS);
        locator = String.format("//span[text()='%s']", personalDemograpchicsInfo.get(MARITAL_STATUS));
        Page.getCurrent().buildXpathControl(locator).click();

        Page.getCurrent().buildCssControl("#metadata-form-4__JOB_DATABxBIRTHDATEx7 input").element().sendKeys("11/25/2021");
        Page.getCurrent().buildCssControl("#metadata-form-4__JOB_DATABxBIRTHDATEx7 input").element().sendKeys(Keys.TAB);

//        CommonSteps.typeAndTab(personalDemograpchicsInfo.get(BIRTH_DATE), BIRTH_DATE);
        System.out.println(personalDemograpchicsInfo);
    }

    private void initialPage() {
        try {
            Page.setCurrent(PageFactory.init(PersonalDemographicsPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
