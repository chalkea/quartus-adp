package pages.systemAdmin;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

public class ProfilePage extends Page {
    @Alias("Profile")
    @FindBy(locator = "xpath=//span[contains(text(), 'Search')]", excludeFromSearch = false)
    public Control buttonSearch;

    // Profile Description: #testing > div > input
    // Profile User ID: #testing > div > input
    // Name: #task-search__OS_OPERATOR_ACCT\:1256xNAMEx4
    // Operator id: #testing > div > input

    public ProfilePage(WebDriver driver) { super(driver);}
}
