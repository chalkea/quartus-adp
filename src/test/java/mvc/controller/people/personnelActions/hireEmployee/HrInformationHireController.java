package mvc.controller.people.personnelActions.hireEmployee;

import com.github.javafaker.Faker;
import controls.AdpControl;
import ui.Page;
import ui.controls.Control;

public class HrInformationHireController {
    public HrInformationHireController() {}

    public void clickOkButton() {

        try {
            Control control = Page.getCurrent().onPage("Empl ID");
            boolean pageNotLoded = control.inVisible(3);
            while (pageNotLoded) {
                AdpControl.doWhileSpinnerIsPresent();
                pageNotLoded = control.inVisible(3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Page.getCurrent().buildXpathControl("//span[text()='Ok']").isClickable(15);
        AdpControl.clickOnElement("Ok Button");
    }
    public void enterEmplId () {
        String emplid = Faker.instance().number().digits(5);
        AdpControl.typeAndEnter(emplid,"Empl Id");
    }
}
