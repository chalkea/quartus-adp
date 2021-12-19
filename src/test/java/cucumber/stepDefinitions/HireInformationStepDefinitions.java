package cucumber.stepDefinitions;

import mvc.controller.people.personnelActions.hireEmployee.*;
import core.Context;
import io.cucumber.java.en.And;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.CitizenshipI9Page;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.JobStatusPage;

public class HireInformationStepDefinitions {
    @And("Practitioner enters all employee information and is on the {string} page")
    public void practitionerEntersAllEmployeeInformationAndIsOnThePage(String navigateToPage) {

        HrInformationHireController hrInformationHireController = new HrInformationHireController();
        EmployeeInformationController employeeInformationController = new EmployeeInformationController();
        PersonalDemographicsController personalDemographicsController = new PersonalDemographicsController();
        CitizenshipI9Controller citizenshipI9Controller = new CitizenshipI9Controller();
        JobStatusController jobStatusController = new JobStatusController();
        JobInformationController jobInformationController = new JobInformationController();
        JobPayLocationController jobPayLocationController = new JobPayLocationController();

        Context.put("navigateToPage",navigateToPage);

        hrInformationHireController.clickOkButton();
        employeeInformationController.populateFromDataModel();
        employeeInformationController.click("Next Button");

        personalDemographicsController.populateFromDataModel();
        personalDemographicsController.click("Next Button");

        citizenshipI9Controller.populateFromDataModel();
        citizenshipI9Controller.click("Next Button");

        jobStatusController.populateFromDataModel();
        jobStatusController.click("Next Button");

        jobInformationController.populateFromDataModel();
        jobInformationController.click("Next Button");

        jobPayLocationController.populateFromDataModel();
        jobPayLocationController.click("Next Button");

    }
}
