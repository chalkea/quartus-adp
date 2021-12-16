package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Employment Information")
public class EmploymentInformationPage extends Page {
    public EmploymentInformationPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    //********
    @Alias("Next Button")
    @FindBy(locator = "xpath=//span[text()='Next']", excludeFromSearch = false)
    public Control nextButton;

    @Alias("Prev Button")
    @FindBy(locator = "xpath=//span[text()='Prev']", excludeFromSearch = false)
    public Control prevButton;

    @Alias("Cancel Button")
    @FindBy(locator = "xpath=//*[text()='Cancel'][@class='button__content']", excludeFromSearch = false)
    public Control cancelButton;

    @Alias("Benefit Program")
    @FindBy(locator = "xpath=//*[(text()='Benefit Program')]", excludeFromSearch = false)
    public Control benefitProgramLink;

    @Alias("Employment Information")
    @FindBy(locator = "xpath=//*[(text()='Employment Information')]", excludeFromSearch = false)
    public Control employmentInformation;

    @Alias("Union Information")
    @FindBy(locator = "xpath=//*[(text()='Union Information')]", excludeFromSearch = false)
    public Control unionInformation;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
