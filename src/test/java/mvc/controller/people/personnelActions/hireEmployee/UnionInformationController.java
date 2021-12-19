package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.UnionInformationModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.AutolinkDetailsPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.UnionInformationPage;
import ui.Page;
import ui.PageFactory;

import java.util.Map;

import static controls.AdpControl.clickOnElement;

public class UnionInformationController implements ControllerInterface {
    public static final String FILE_NUMBER = "File Number";

    UnionInformationModel unionInformationModel = new UnionInformationModel();
    Map<String, String> unionInformation = unionInformationModel.loadData();

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void populateFromDataModel() {
        initializePage();
        System.out.println(unionInformation);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(UnionInformationPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
