package pages.changeJobInformation;

import core.Alias;
import cucumber.steps.CommonSteps;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

import java.util.Arrays;
import java.util.List;

import static cucumber.steps.CommonSteps.clickOnLeftNavigationItem;

@Alias("Change Job")
public class ChangeJob extends Page {
    @Alias("Page Title")
    @FindBy(locator = "css=span.dijitTitlePaneTextNode", excludeFromSearch = false)
    public Control pageTitle;

    public ChangeJob(WebDriver driver) {super(driver);}
    @Override
    public Page navigate() {
        List<String> raw = Arrays.asList("People", "Personnel Actions", "Change Job/Position Information", "Change Job/Position");
        DataTable content = CommonSteps.createDataTable(raw);
        try {
            clickOnLeftNavigationItem(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Page.setCurrent( this );
        return this;
    }
}
