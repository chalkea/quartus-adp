package controllers.people;

import com.github.javafaker.Faker;
import cucumber.steps.CommonSteps;
import ui.Page;
import ui.controls.Control;

public class HrInformationHireController {
    public HrInformationHireController() {}

    public void clickOkButton() {

        try {
            Control control = Page.getCurrent().onPage("Empl Id");
            boolean pageNotLoded = control.inVisible(3);
            while (pageNotLoded) {
                CommonSteps.doWhileSpinnerIsPresent();
                pageNotLoded = control.inVisible(3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        CommonSteps.clickOnElement("Ok Button");
    }
    public void enterEmplId () {
        String emplid = Faker.instance().number().digits(5);
        CommonSteps.typeAndEnter(emplid,"Empl Id");
    }
}
