package cucumber.stepDefinitions.hooks;


import com.applitools.eyes.*;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import core.Configuration;
import core.Context;
import core.Driver;
import facades.database.MongoDBFacade;
import facades.database.RelationalDBFacade;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import ui.Page;
import utils.BrowserSetter;
import utils.ConfigFileReader;
import utils.VisualTestTool;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class VisualTestsHooks2 {
    static VisualGridRunner runner = new VisualGridRunner(new RunnerOptions().testConcurrency(5));
    static Eyes eyes = new Eyes(runner);

    public VisualTestsHooks2() {
    }


    @Before(value = "@VisualTest", order=2)
    public void beforeVisualTests(Scenario scenario) {

        setVisualSettings(scenario.getName());

        setBatchSetting(scenario);
    }

    private void setBatchSetting(Scenario scenario) {
        String batchName = "batch";
        String nextBatch = "next";
        String userName = System.getProperty("user.name");
        String environment = System.getProperty("environment");

        batchName = "Env: " + environment
                + "User: " + userName
                + "Scenario: " + scenario.getName();

        if (nextBatch.equalsIgnoreCase("next")) VisualTestTool.setUp(eyes);

        if (!batchName.equalsIgnoreCase(nextBatch))
            eyes.setBatch(new BatchInfo(nextBatch));
    }

    private void setVisualSettings(String scenario) {
        eyes.setLogHandler(new StdoutLogHandler(true));
        eyes.setLogHandler(new FileLogger("visualTest.log", true, true));
        VisualTestTool.setUp(eyes);
//        eyes.open(webDriver, "Demo App", "Ultrafast grid demo", new RectangleSize(800, 600));
        eyes.open(Driver.current(),"EHRMS EV6",scenario, new RectangleSize(1400, 1400));
        Context.put("eyes", eyes);
    }

    @After(value = "@VisualTest", order = 2)
    public void afterScenario(Scenario scenario) throws Exception {
        eyes.closeAsync();
        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        System.out.println(allTestResults);
    }
}
