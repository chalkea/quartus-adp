package cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SetHighestAccessMode {
    @Given("java class exists")
    public void javaClassExists() {

    }

    @When("I invoke the java class")
    public void iInvokeTheJavaClass() throws Exception {
//        LoginSetHighestAccessMode.test();
        LoginSetHighestAccessMode.start();
    }
}
