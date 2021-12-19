package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.CitizenshipI9Page;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.JobStatusPage;
import ui.Page;
import ui.PageFactory;

import static controls.AdpControl.clickOnElement;

public class JobStatusController implements ControllerInterface {
    @Override
    public void populateFromDataModel() {
        initializePage();
        click("Department Search");
//        Page.getCurrent().buildXpathControl("//span[text()='0100 - Enterprise']").click();
        Page.getCurrent().buildXpathControl("//div['VanBaseDropdownInput-']//*[@class='vdl-popup__content van-search-input__popup']//*/li[3]").click();
        click("Job Code Search");
//        Page.getCurrent().buildXpathControl("//span[text()='1003 - Nurse Supervisor1']").click();
        Page.getCurrent().buildXpathControl("//*['VanBaseDropdownInput-'][@class='vdl-list__option ng-tns-c21-36 ng-star-inserted'][4]").click();
    }

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(JobStatusPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
