package cucumber.stepDefinitions;

import controls.AdpControl;
import core.Context;
import io.cucumber.java.en.Given;

public class CheckReverseStepDefinition {
    CommonStepDefinitions commonStepDefinitions = new CommonStepDefinitions();
    @Given("Practitioner User is on the {string} page under {string}")
    public void practitionerUserIsOnThePage(String theTask, String parentTask) throws Exception {
        Context.put("theTask", theTask);
        Context.put("parentTask", parentTask);
        commonStepDefinitions.chooseEnvironmentAndLoginApp();
        AdpControl.goingTo(theTask);
    }
}
