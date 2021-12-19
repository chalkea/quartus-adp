package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.BenefitProgramModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.AutolinkDetailsPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.BenefitProgramPage;
import ui.Page;
import ui.PageFactory;

import java.util.Map;

import static controls.AdpControl.clickOnElement;

public class BenefitProgramController implements ControllerInterface {

    BenefitProgramModel benefitProgramModel = new BenefitProgramModel();
    Map<String, String> benefitProgramInfo = benefitProgramModel.loadData();

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void populateFromDataModel() {
        initializePage();
        clickOnElement("Benefit Program Search");
        clickOnElement("Benefit Program dropdown");
        System.out.println(benefitProgramInfo);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(BenefitProgramPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
