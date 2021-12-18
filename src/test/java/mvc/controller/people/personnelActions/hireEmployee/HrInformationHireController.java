package mvc.controller.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import cucumber.steps.CommonSteps;
import ui.Page;
import ui.controls.Control;

public class HrInformationHireController {
    public HrInformationHireController() {}

    public void clickOkButton() {

        try {
            Control control = Page.getCurrent().onPage("Empl ID");
            boolean pageNotLoded = control.inVisible(3);
            while (pageNotLoded) {
                CommonSteps.doWhileSpinnerIsPresent();
                pageNotLoded = control.inVisible(3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Page.getCurrent().buildXpathControl("//span[text()='Ok']").isClickable(15);
        CommonSteps.clickOnElement("Ok Button");
    }
    public void enterEmplId () {
        String emplid = Faker.instance().number().digits(5);
        CommonSteps.typeAndEnter(emplid,"Empl Id");
    }
}
