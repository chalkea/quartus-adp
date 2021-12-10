package mvc.view.systemAdmin;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Education")
public class EducationPage extends Page {

    @Alias("Search button")
    @FindBy(locator = "xpath=//span[contains(text(), 'Search')]", excludeFromSearch = false)
    public Control buttonSearch;

    @Alias("Matches found")
    @FindBy(locator = "css=#app-microapp-enterprise-ui-root-container ent-task-search-results p", excludeFromSearch = false)
    public Control labelMatchesFound;
//#app-microapp-enterprise-ui-root-container > app-microapp-enterprise-ui-root > enterprise-layout > div > div > div > app-hire-search > adp-busy-indicator > div > svg
    public EducationPage(WebDriver driver) { super(driver); }

    @Override
    public Page navigate() {
        Page.setCurrent( this );
        return this;
    }
}
