package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.JobInformationModel;
import mvc.model.people.personnelActions.hireEmployee.PersonalDemographicsModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.JobInformationPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.PersonalDemographicsPage;
import org.openqa.selenium.Keys;
import ui.Page;
import ui.PageFactory;

import java.util.Map;

import static controls.AdpControl.clickOnElement;

public class JobInformationController implements ControllerInterface {
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

    JobInformationModel jobInformationModel = new JobInformationModel();
    Map<String, String> jobInformationInfo = jobInformationModel.loadData();

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void populateFromDataModel() {
        initializePage();
        System.out.println(jobInformationInfo);
    }

    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(JobInformationPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
