package cucumber.stepDefinitions;

import controllers.HireInformationController;
import core.Context;
import io.cucumber.java.en.And;

public class HireInformationStepDefinitions {
    @And("Practitioner enters all employee information and is on the {string} page")
    public void practitionerEntersAllEmployeeInformationAndIsOnThePage(String navigateToPage) {
        HireInformationController hireInformationController = new HireInformationController();
        Context.put("navigateToPage",navigateToPage);
        hireInformationController.populateEmployeePage();

        HireInformationController.clickOkButton("Submit Button");
    }
}
