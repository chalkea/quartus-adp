package cucumber.stepDefinitions;

import mvc.controller.people.personnelActions.hireEmployee.*;
import core.Context;
import io.cucumber.java.en.And;

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
        CompensationDetailsController compensationDetailsController = new CompensationDetailsController();
        EarningsDistributionController earningsDistributionController = new EarningsDistributionController();
        AutolinkDetailsController autolinkDetailsController = new AutolinkDetailsController();
        CostNumberDetailController costNumberDetailController = new CostNumberDetailController();
        BenefitProgramController benefitProgramController = new BenefitProgramController();

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

        compensationDetailsController.populateFromDataModel();
        compensationDetailsController.click("Next Button");

        earningsDistributionController.populateFromDataModel();
        earningsDistributionController.click("Next Button");

        autolinkDetailsController.populateFromDataModel();
        autolinkDetailsController.click("Next Button");

        costNumberDetailController.populateFromDataModel();
        costNumberDetailController.click("Next Button");

        benefitProgramController.populateFromDataModel();
        benefitProgramController.click("Next Button");

    }
}
