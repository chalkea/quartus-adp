package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;

import static controls.AdpControl.clickOnElement;

@Alias("Citizenship I9")
public class CitizenshipI9Page extends Page {
    public CitizenshipI9Page(WebDriver driver) { super(driver); }

        @Alias("Page Title")
        @FindBy(locator = "css=h1", excludeFromSearch = false)
        public Control pageTitle;

        @Alias("Next Button")
        @FindBy(locator = "xpath=//span[text()='Next']", excludeFromSearch = false)
        public Control nextButton;

        @Alias("Prev Button")
        @FindBy(locator = "xpath=//span[text()='Prev']", excludeFromSearch = false)
        public Control prevButton;

        @Alias("Cancel Button")
        @FindBy(locator = "xpath=//*[text()='Cancel'][@class='button__content']", excludeFromSearch = false)
        public Control cancelButton;

        @Alias("Citizenship/I9")
        @FindBy(locator = "xpath=//*[contains(text(), 'Citizenship/I9')]']", excludeFromSearch = false)
        public Control citizenshipI9;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
