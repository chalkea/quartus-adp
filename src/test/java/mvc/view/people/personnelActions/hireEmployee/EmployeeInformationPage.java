package mvc.view.people.personnelActions.hireEmployee;

import core.Alias;
import core.Context;
import cucumber.steps.CommonSteps;
import org.openqa.selenium.WebDriver;
import pages.HireEmployee;
import ui.FindBy;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;

import static cucumber.steps.CommonSteps.selectTaskFromGlobalSearch;

@Alias("Employee Information")
public class EmployeeInformationPage extends Page{
    @Alias("Logical field name")
    @FindBy(locator = "css=#somelocator", excludeFromSearch = false)
    public Control logicalfieldname;

    public EmployeeInformationPage(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {

        String theTask = (String) Context.get("theTask");
        String locatorPattern = String.format("//*[contains(@class, 'actity-menu-items')]//a[(text()='%s')]", theTask);
        selectTaskFromGlobalSearch((String) Context.get("parentTask"), theTask, locatorPattern);
        try {
            PageFactory.init(HireEmployee.class);
            CommonSteps.clickOnElement("Ok Button");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Page.setCurrent( this );
        return this;
    }
}


