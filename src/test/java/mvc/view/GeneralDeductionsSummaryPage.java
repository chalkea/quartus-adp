package mvc.view;

import core.Alias;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;
import ui.controls.SelectList;

@Alias("General Deductions Summary")
public class GeneralDeductionsSummaryPage extends Page {

    @Alias("Page Title")
    @FindBy(locator = "css=span.dijitTitlePaneTextNode", excludeFromSearch = false)
    public Control pageTitle;

    //Last Name
    //First Name
    //Last 4 of SSN
    //Birth Month/Day

    //Employee ID
    @Alias("Employee ID")
    @FindBy(locator = "css=#personal-info-employee-search__group__employeeId > app-metadata-uppercase > input", excludeFromSearch = false)
    public Edit employeeId;
    //Status
    //File Number
    //Pay Group

    //Reports To
    //Department
    //Location
    //Job Code/Title

    //Cost Number
    //Payroll Department
    //Position Number
    //Payroll Status

    //Results Set
    @Alias("Results table")
    @FindBy(locator = "css=#app-microapp-enterprise-ui-root-container > app-microapp-enterprise-ui-root > enterprise-layout > div > div > div > app-search > div > van-employee-search-view > van-employee-search-results > van-scrollview > div > van-selection-list > adp-advanced-datagrid > div > div.adp-advanced-datagrid__body > cdk-virtual-scroll-viewport > div.cdk-virtual-scroll-content-wrapper > div:nth-child(1) > adp-datagrid-cell.virtual-cell-default.grid-cell.idx-1.van-col-lastName.ng-star-inserted > a", excludeFromSearch = true)
    public SelectList resultSet;

    //Search Button
    @Alias("Search Button")
    @FindBy(locator = "css=#app-microapp-enterprise-ui-root-container  adp-button:nth-child(2) button span", excludeFromSearch = false)
    public Control searchButton;
    //Reset Button

    public GeneralDeductionsSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Page navigate() {
        Page.setCurrent(this);
        return this;
    }
}
