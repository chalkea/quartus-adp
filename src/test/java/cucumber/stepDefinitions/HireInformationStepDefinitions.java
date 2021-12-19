package cucumber.stepDefinitions;

import controls.AdpControl;
import cucumber.steps.CommonSteps;
import mvc.controller.people.personnelActions.hireEmployee.*;
import core.Context;
import io.cucumber.java.en.And;
import org.junit.Assert;
import ui.Page;
import ui.controls.Control;

import static controls.AdpControl.*;
import static ui.Page.*;

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
        EmploymentInformationController employmentInformationController = new EmploymentInformationController();
        UnionInformationController unionInformationController = new UnionInformationController();
        AdditionalRatesController additonalRatesController = new AdditionalRatesController();

        Context.put("navigateToPage", navigateToPage);

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

        employmentInformationController.populateFromDataModel();
        employmentInformationController.click("Next Button");

        unionInformationController.populateFromDataModel();
        unionInformationController.click("Next Button");

        additonalRatesController.populateFromDataModel();
        additonalRatesController.click("Submit Button");
        CommonSteps.doThreadSleep(5000);

        isButtonPresent("Ok");
        isButtonPresent("Ok");
        isButtonPresent("Ok");
        isButtonPresent("No");

        Control c = Page.getCurrent().buildXpathControl("//*[contains(text(),'Your changes have been saved.')]");
        Assert.assertTrue("New hire did not complete", c.exists(5));
    }

    private void isButtonPresent(String button) {
        String locator = String.format("//button/span[text()='%s']", button);
        if (getCurrent().buildXpathControl(locator).exists())
            getCurrent().buildXpathControl(locator).click();
    }
}
