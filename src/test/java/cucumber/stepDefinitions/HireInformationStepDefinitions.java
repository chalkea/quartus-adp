package cucumber.stepDefinitions;

import com.vimalselvam.cucumber.listener.Reporter;
import core.Context;
import cucumber.steps.CommonSteps;
import io.cucumber.java.en.And;
import mvc.controller.people.personnelActions.hireEmployee.*;
import org.junit.Assert;
import ui.Page;
import ui.controls.Control;

import static ui.Page.getCurrent;

public class HireInformationStepDefinitions {

    @And("Practitioner enters all employee information and is on the {string} page")
    public void practitionerEntersAllEmployeeInformationAndIsOnThePage(String navigateToPage) {

        HrInformationHireController hrInformationHireController = new HrInformationHireController();
        Context.put("navigateToPage", navigateToPage);
        hrInformationHireController.clickOkButton();

        handleEmployeeInformationPage();

        handlePersonalDemographicsPage();

        handleCitizenshipI9Page();

        handleJobStatusPage();

        handleJobInformtionPage();

        handleJobPayLocationPage();

        handleCompensationDetailsPage();

        handleEarningsDistributionPage();

        handleAutolinkDetailsPage();

        handleCostNumberDetailPage();

        handleBenefitProgramPage();

        handleEmploymentInformationPage();

        handleUnionInformationPage();

        handleAdditionalRatePage();
        CommonSteps.doThreadSleep(5000);

        isButtonPresent("Ok");
        isButtonPresent("Ok");
        isButtonPresent("Ok");
        isButtonPresent("No");

        Reporter.addStepLog("New Hire");
        Control c = Page.getCurrent().buildXpathControl("//*[contains(text(),'Your changes have been saved.')]");
        Assert.assertTrue("New hire did not complete", c.exists(5));
    }

    private void handleEmployeeInformationPage() {
        EmployeeInformationController employeeInformationController = new EmployeeInformationController();
        employeeInformationController.populateFromDataModel();
        employeeInformationController.click("Next Button");
    }

    private void handlePersonalDemographicsPage() {
        PersonalDemographicsController personalDemographicsController = new PersonalDemographicsController();
        personalDemographicsController.populateFromDataModel();
        personalDemographicsController.click("Next Button");
    }

    private void handleCitizenshipI9Page() {
        CitizenshipI9Controller citizenshipI9Controller = new CitizenshipI9Controller();
        citizenshipI9Controller.populateFromDataModel();
        citizenshipI9Controller.click("Next Button");
    }

    private void handleJobStatusPage() {
        JobStatusController jobStatusController = new JobStatusController();
        jobStatusController.populateFromDataModel();
        jobStatusController.click("Next Button");
    }

    private void handleJobInformtionPage() {
        JobInformationController jobInformationController = new JobInformationController();
        jobInformationController.populateFromDataModel();
        jobInformationController.click("Next Button");
    }

    private void handleJobPayLocationPage() {
        JobPayLocationController jobPayLocationController = new JobPayLocationController();
        jobPayLocationController.populateFromDataModel();
        jobPayLocationController.click("Next Button");
    }

    private void handleCompensationDetailsPage() {
        CompensationDetailsController compensationDetailsController = new CompensationDetailsController();
        compensationDetailsController.populateFromDataModel();
        compensationDetailsController.click("Next Button");
    }

    private void handleEarningsDistributionPage() {
        EarningsDistributionController earningsDistributionController = new EarningsDistributionController();
        earningsDistributionController.populateFromDataModel();
        earningsDistributionController.click("Next Button");
    }

    private void handleAutolinkDetailsPage() {
        AutolinkDetailsController autolinkDetailsController = new AutolinkDetailsController();
        autolinkDetailsController.populateFromDataModel();
        autolinkDetailsController.click("Next Button");
    }

    private void handleCostNumberDetailPage() {
        CostNumberDetailController costNumberDetailController = new CostNumberDetailController();
        costNumberDetailController.populateFromDataModel();
        costNumberDetailController.click("Next Button");
    }

    private void handleBenefitProgramPage() {
        BenefitProgramController benefitProgramController = new BenefitProgramController();
        benefitProgramController.populateFromDataModel();
        benefitProgramController.click("Next Button");
    }

    private void handleEmploymentInformationPage() {
        EmploymentInformationController employmentInformationController = new EmploymentInformationController();
        employmentInformationController.populateFromDataModel();
        employmentInformationController.click("Next Button");
    }

    private void handleUnionInformationPage() {
        UnionInformationController unionInformationController = new UnionInformationController();
        unionInformationController.populateFromDataModel();
        unionInformationController.click("Next Button");
    }

    private void handleAdditionalRatePage() {
        AdditionalRatesController additonalRatesController = new AdditionalRatesController();
        additonalRatesController.populateFromDataModel();
        additonalRatesController.click("Submit Button");
    }

    private void isButtonPresent(String button) {
        String locator = String.format("//button/span[text()='%s']", button);
        if (getCurrent().buildXpathControl(locator).exists())
            getCurrent().buildXpathControl(locator).click();
    }
}
