package mvc.view.people.leaveOfAbsenceAdministration;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Absence Details")
public class AbsenceDetailsPage extends Page {
    public AbsenceDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Absence Detail")
    @FindBy(locator = "xpath=//h3[text()='General Absences']", excludeFromSearch = false)
    public Control absenceDetailTitle;

    @Alias("Back to Employee Search")
    @FindBy(locator = "xpath=//*[name()='b'][text()='Back to Employee Search']", excludeFromSearch = false)
    public Control backToEmployeeSearch;

    @Alias("Add New Record")
    @FindBy(locator = "xpath=//span[contains(text(), 'Add New Record')]", excludeFromSearch = false)
    public Control leftNavPayroll;

    @Alias("Effective Dated Row One")
    @FindBy(locator = "xpath=//*[name()='app-slidein-list-view'][1]", excludeFromSearch = false)
    public Control effectiveDatedRowOne;

    @Alias("General Absences link")
    @FindBy(locator = "xpath=//div[contains(text(), 'General Absences')]", excludeFromSearch = false)
    public Control generalAbsencesLink;

    @Alias("FMLA Details link")
    @FindBy(locator = "xpath=//div[contains(text(), 'FMLA Details')]", excludeFromSearch = false)
    public Control fmlaDetailsLink;

    @Alias("Log off")
    @FindBy(locator = "css=#nasShellMasthead  .fa-power-off", excludeFromSearch = false)
    public Control leftNavLogoff;

    @Alias("Back")
    @FindBy(locator = "xpath=//span[contains(text(), 'Back')][@class='button__content mobile-view']", excludeFromSearch = false)
    public Control back;

    @Alias("Ok")
    @FindBy(locator = "id=revit_form_Button_0", excludeFromSearch = false)
    public Control btnOk;

    @Alias("Submit")
    @FindBy(locator = "xpath=//*[text()='Submit']", excludeFromSearch = false)
    public Control btnSubmit;

    @Alias("Search")
    @FindBy(locator = "xpath=//*[text()='Search']", excludeFromSearch = false)
    public Control searchButton;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
