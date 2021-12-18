package cucumber.stepDefinitions;

import mvc.controller.people.personnelActions.hireEmployee.CitizenshipI9Controller;
import mvc.controller.people.personnelActions.hireEmployee.EmployeeInformationController;
import mvc.controller.people.personnelActions.hireEmployee.HrInformationHireController;
import core.Context;
import io.cucumber.java.en.And;
import mvc.controller.people.personnelActions.hireEmployee.PersonalDemographicsController;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.CitizenshipI9Page;

public class HireInformationStepDefinitions {
    @And("Practitioner enters all employee information and is on the {string} page")
    public void practitionerEntersAllEmployeeInformationAndIsOnThePage(String navigateToPage) {

        HrInformationHireController hrInformationHireController = new HrInformationHireController();
        EmployeeInformationController employeeInformationController = new EmployeeInformationController();
        PersonalDemographicsController personalDemographicsController = new PersonalDemographicsController();
        CitizenshipI9Controller citizenshipI9Controller = new CitizenshipI9Controller();


        Context.put("navigateToPage",navigateToPage);

        hrInformationHireController.clickOkButton();
        employeeInformationController.populateFromDataModel();
        employeeInformationController.click("Next Button");

        personalDemographicsController.populateFromDataModel();
        personalDemographicsController.click("Next Button");

        citizenshipI9Controller.populateFromDataModel();
        citizenshipI9Controller.click("Next Button");

    }
}
