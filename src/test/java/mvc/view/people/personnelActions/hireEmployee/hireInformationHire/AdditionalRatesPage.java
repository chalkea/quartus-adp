package mvc.view.people.personnelActions.hireEmployee.hireInformationHire;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;

@Alias("Additional Rates")
public class AdditionalRatesPage extends Page {
    public AdditionalRatesPage(WebDriver driver) {
        super(driver);
    }

    @Alias("Page Title")
    @FindBy(locator = "css=h1", excludeFromSearch = false)
    public Control pageTitle;

    @Alias("Effective Date")
    @FindBy(locator = "css=UNKNOWN", excludeFromSearch = false)
    public Control effectiveDate;

    @Alias("Current")
    @FindBy(locator = "css=UNKNOWN", excludeFromSearch = false)
    public Control current;

    @Alias("Effective Date Sequence")
    @FindBy(locator = "css=UNKOWN", excludeFromSearch = false)
    public Control effectiveDateSequence;

    @Alias("Hourly Rate 2")
    @FindBy(locator = "css=UNKOWN", excludeFromSearch = false)
    public Control hourlyRate2;

    @Alias("Hourly Rate 3")
    @FindBy(locator = "css=UNKOWN", excludeFromSearch = false)
    public Control hourlyRate3;


    //********
    @Alias("Submit Button")
    @FindBy(locator = "xpath=//span[text()='Submit']", excludeFromSearch = false)
    public Control submit;

    @Alias("Prev Button")
    @FindBy(locator = "xpath=//span[text()='Prev']", excludeFromSearch = false)
    public Control prevButton;

    @Alias("Cancel Button")
    @FindBy(locator = "xpath=//*[text()='Cancel'][@class='button__content']", excludeFromSearch = false)
    public Control cancelButton;

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
