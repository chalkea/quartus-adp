package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.AdditionalRatesPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.JobStatusPage;
import ui.Page;
import ui.PageFactory;

import static controls.AdpControl.clickOnElement;

public class AdditionalRatesController implements ControllerInterface {
    @Override
    public void populateFromDataModel() {
        initializePage();
    }

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(AdditionalRatesPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
