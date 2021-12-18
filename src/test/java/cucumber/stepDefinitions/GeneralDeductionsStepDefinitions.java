package cucumber.stepDefinitions;

import controls.AdpControl;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class GeneralDeductionsStepDefinitions {
    @And("user selects employee having emplid {string}")
    public void userSelectsEmployeeHavingEmplid(String emplid) throws Exception {
        AdpControl.goingTo("General Deductions Summary");
        AdpControl.enterValue(emplid, "Employee ID");
        AdpControl.clickOnElement("Search Button");
        AdpControl.selectByVisibleText("Russell", By.cssSelector("#app-microapp-enterprise-ui-root-container > app-microapp-enterprise-ui-root > enterprise-layout > div > div > div > app-search > div > van-employee-search-view > van-employee-search-results > van-scrollview > div > van-selection-list > adp-advanced-datagrid > div > div.adp-advanced-datagrid__body > cdk-virtual-scroll-viewport > div.cdk-virtual-scroll-content-wrapper"));
    }
}
