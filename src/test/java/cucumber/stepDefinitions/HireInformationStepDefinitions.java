package cucumber.stepDefinitions;

import controllers.EmployeeInformationController;
import controllers.people.HrInformationHireController;
import core.Context;
import io.cucumber.java.en.And;

public class HireInformationStepDefinitions {
    @And("Practitioner enters all employee information and is on the {string} page")
    public void practitionerEntersAllEmployeeInformationAndIsOnThePage(String navigateToPage) {
        HrInformationHireController hrInformationHireController = new HrInformationHireController();
        EmployeeInformationController employeeInformationController = new EmployeeInformationController();
        Context.put("navigateToPage",navigateToPage);

        hrInformationHireController.clickOkButton();
        employeeInformationController.populateEmployeePage();

        EmployeeInformationController.clickOkButton("Submit Button");
    }
}
