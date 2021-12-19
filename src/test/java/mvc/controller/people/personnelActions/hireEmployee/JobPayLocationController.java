package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.JobPayLocationPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.JobStatusPage;
import ui.Page;
import ui.PageFactory;

import static controls.AdpControl.clickOnElement;

public class JobPayLocationController implements ControllerInterface {
    @Override
    public void populateFromDataModel() {
        initializePage();
        Page.getCurrent().buildXpathControl("//*[@id='metadata-form-12__JOB_DATA2xPAYGROUPx20']//*/i").isClickable(5);
        Page.getCurrent().buildXpathControl("//*[@id='metadata-form-12__JOB_DATA2xPAYGROUPx20']//*/i").click();
        Page.getCurrent().buildCssControl(".vdl-popup__content li:nth-of-type(1)").isClickable(5);
        Page.getCurrent().buildCssControl(".vdl-popup__content li:nth-of-type(1)").click();
    }

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(JobPayLocationPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
