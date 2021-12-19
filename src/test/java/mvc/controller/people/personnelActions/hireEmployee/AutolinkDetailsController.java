package mvc.controller.people.personnelActions.hireEmployee;

import mvc.controller.ControllerInterface;
import mvc.model.people.personnelActions.hireEmployee.AutolinkDetailsModel;
import mvc.model.people.personnelActions.hireEmployee.PersonalDemographicsModel;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.AutolinkDetailsPage;
import mvc.view.people.personnelActions.hireEmployee.hireInformationHire.PersonalDemographicsPage;
import org.openqa.selenium.Keys;
import ui.Page;
import ui.PageFactory;

import java.util.Map;

import static controls.AdpControl.clickOnElement;
import static controls.AdpControl.typeAndTab;

public class AutolinkDetailsController implements ControllerInterface {
    public static final String FILE_NUMBER = "File Number";

    AutolinkDetailsModel autolinkDetailsModel = new AutolinkDetailsModel();
    Map<String, String> autolinkDetailsInfo = autolinkDetailsModel.loadData();

    @Override
    public void click(String element) {
        clickOnElement(element);
    }

    @Override
    public void populateFromDataModel() {
        initializePage();
//        typeAndTab(autolinkDetailsInfo.get(FILE_NUMBER), FILE_NUMBER);
        String locator = "#metadata-form-18__group__AL_JOB_DATAxFILE_NBRx38 input";
        Page.getCurrent().buildCssControl(locator).element().sendKeys(autolinkDetailsInfo.get(FILE_NUMBER));
        System.out.println(autolinkDetailsInfo);
    }

    @Override
    public void initializePage() {
        try {
            Page.setCurrent(PageFactory.init(AutolinkDetailsPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
