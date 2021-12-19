package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Union Information")
public class UnionInformationPage extends Page {
    public UnionInformationPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    //********
    @Alias("Next Button")
    @FindBy(locator = "xpath=//span[text()='Next']", excludeFromSearch = false)
    public Control submitButton;

    @Alias("Prev Button")
    @FindBy(locator = "xpath=//span[text()='Prev']", excludeFromSearch = false)
    public Control prevButton;

    @Alias("Cancel Button")
    @FindBy(locator = "xpath=//*[text()='Cancel'][@class='button__content']", excludeFromSearch = false)
    public Control cancelButton;

    @Alias("Union Information")
    @FindBy(locator = "xpath=//*[(text()='Union Information')]", excludeFromSearch = false)
    public Control unionInformation;

    @Alias("Additional Rates")
    @FindBy(locator = "xpath=//*[(text()='Additional Rates')]", excludeFromSearch = false)
    public Control additionalRates;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
