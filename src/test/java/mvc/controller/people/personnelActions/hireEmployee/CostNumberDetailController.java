package mvc.controller.people.personnelActions.hireEmployee;

import controls.AdpControl;
import cucumber.steps.CommonSteps;
import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.CostNumberDetailModel;
import mvc.model.people.personnelActions.hireEmployee.EmployeeInformationModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.CostNumberDetailPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.EmployeeInformationPage;
import org.openqa.selenium.By;
import ui.Page;
import ui.PageFactory;

import java.util.HashMap;

public class CostNumberDetailController implements ControllerInterface {


    public void click(String element) {
        AdpControl.clickOnElement(element);
    }

    public void populateFromDataModel() {
        CostNumberDetailModel costNumberDetailModel = new CostNumberDetailModel();
        HashMap<String, String> costNumberDetailInfo = costNumberDetailModel.loadData();
        initializePage();
        System.out.println( costNumberDetailInfo );
    }


    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(CostNumberDetailPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
