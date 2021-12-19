package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.BenefitProgramModel;
import mvc.model.people.personnelActions.hireEmployee.EmployeeInformationModel;
import mvc.model.people.personnelActions.hireEmployee.EmploymentInformationModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.BenefitProgramPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.EmployeeInformationPage;
import ui.Page;
import ui.PageFactory;

import java.util.Map;

import static controls.AdpControl.clickOnElement;

public class EmploymentInformationController implements ControllerInterface {

    EmploymentInformationModel employmentInformationModel = new EmploymentInformationModel();
    Map<String, String> benefitProgramInfo = employmentInformationModel.loadData();

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void populateFromDataModel() {
        initializePage();
        System.out.println(benefitProgramInfo);
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
