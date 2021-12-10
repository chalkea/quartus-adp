package cucumber.stepDefinitions;

import cucumber.steps.CommonSteps;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertFalse;

public class NavigationStepDefinitions {

    @Then("User should not see {string} in LEFT NAVIGATION MENU")
    public void userShouldNotSeeInLEFTNAVIGATIONMENU(String itemName) {
        boolean exists = CommonSteps.verifyFieldNotPresent(itemName);
        assertFalse("Fouund item name: " + itemName, exists);

    }
}
