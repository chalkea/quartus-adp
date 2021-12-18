package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.CitizenshipI9Page;
import ui.PageFactory;
import static controls.AdpControl.clickOnElement;

public class CitizenshipI9Controller implements ControllerInterface {
    @Override
    public void populateFromDataModel() {
        initializePage();
        click("Next Button");
    }

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void initializePage() {
        try {
            PageFactory.init(CitizenshipI9Page.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
