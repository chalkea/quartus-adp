package cucumber.stepDefinitions.hooks;


import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.TestResultsSummary;
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

public class WebHooks {
    public static final String USER_NAME = "user.name";
    public static final String TEST = "test";
    private Map<String, Object> vars;
    private JavascriptExecutor js;
    private String skipBrowserStuff = "no";
    private String sameBrowser;
    static VisualGridRunner runner = new VisualGridRunner(new RunnerOptions().testConcurrency(5));
    static Eyes eyes = new Eyes(runner);

    public WebHooks() {
    }

    @Before("order=0")
    public void beforeScenario(Scenario scenario) throws Exception {
        sameBrowser = System.getProperty("sameBrowser");

        if (Driver.current() != null
                && sameBrowser.equalsIgnoreCase("yes")) {
            System.setProperty("byPassLogin", "yes");
            skipBrowserStuff = "yes";
        } else {
            System.setProperty("byPassLogin", "no");
        }

        switch (skipBrowserStuff) {
            case "yes":
                break;
            default:

                js = (JavascriptExecutor) Driver.current();

                Configuration.load();
                Configuration.print();
                Proxy proxy = new Proxy();

                String browser = System.getProperty("browser");

                BrowserSetter.setBrowserConfig(browser);

                DesiredCapabilities cap = new DesiredCapabilities();

                ChromeOptions options = new ChromeOptions();
                FirefoxProfile profile = new FirefoxProfile();

                Map<String, Object> prefs = new HashMap();
                if (Configuration.platform().isWeb()) {
                    if (browser.equalsIgnoreCase("chrome"))
                        Driver.addChromeOptions(browser, options);
                    else
                        Driver.add(browser, cap);
                } else {
                    cap.setCapability("platformName", "Android");
                    cap.setCapability("deviceName", "Android Emulator");
                    cap.setCapability("browserName", "Chrome");
                    cap.setCapability("commandTimeout", "60");
                    Driver.add(Configuration.get("driver_url"), browser, cap);
                }
        }
    }
//    @Before
//    public void beforeAssignAuthor (Scenario scenario) {
//        if (scenario.getName().contains("Warriors")) {
//            Reporter.addStepLog("Add author");
//            Reporter.assignAuthor("EV6 Automation - Warriors: Allen Toole");
//        }
//    }

    @After
    public void afterScenario(Scenario scenario) throws Exception {
        eyes.closeAsync();
        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        System.out.println(allTestResults);

        System.out.println(scenario.getName() + "\n" + scenario.getLine());
        switch (sameBrowser) {
            case "yes":
                skipBrowserStuff = null;
                break;
            default:
                if (scenario.isFailed()) {
                    Page currentPage = new Page(Driver.current());
                    String fileName = "./target/screenshots/" + currentPage.getClass().getSimpleName()
                            + "-" + new Date().getTime() + ".png";
                    currentPage.captureScreenShot(fileName);
                }
                Driver.current().quit();
        }
    }
//    @After
//    public static void writeExtentReport() {
//        loadXMLConfig(new File(FileReaderManager.getInstance()
//                .getConfigReader().getReportConfigPath()));
//        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//    }

    @Before("@SqlDb")
    public void beforeSqlDbScenario(Scenario scenario) {
        String connectionString = "jdbc:oracle:thin:@//ehrms-ev6-np-db6.ehrms-db-inp.usea1.scn.aws.adp:1521/e6boaws";
        RelationalDBFacade relationalDBFacade = new RelationalDBFacade(connectionString, "DBADM", "DBADM");
        Context.put("relationalDBFacade", relationalDBFacade);
        try {
            ResultSet resultSet = relationalDBFacade.selectRecords("select paygroup, count(local_tax_cd)\n" +
                    "from sd46.ps_al_pg_local\n" +
                    "group by paygroup\n" +
                    "order by count(local_tax_cd) desc");

            resultSet.first();

        } catch (SQLException throwables) {
            System.out.println("Select query failed!");
            throwables.printStackTrace();
        }

    }

    @After(value="@SqlDb")
    public void afterSqlDbScenario(Scenario scenario) {

    }

    @Before(value="@NoSqlDb")
    public void beforeNoSqlDbScenario(Scenario scenario) {
        MongoDBFacade mongoDBFacade = new MongoDBFacade();
        mongoDBFacade.createCollection(System.getProperty(USER_NAME) + "_" + TEST);
        Context.put("mongoDBFacade", mongoDBFacade);
    }

    @After(value="@NoSqlDb")
    public void afterNoSqlDbScenario(Scenario scenario) {
        MongoDBFacade mongoDBFacade = (MongoDBFacade) Context.get("mongoDBFacade");
        mongoDBFacade.dropCollection(System.getProperty(USER_NAME) + "_" + TEST);
    }

    public static class FileReaderManager {
        private static FileReaderManager fileReaderManager = new FileReaderManager();
        private static ConfigFileReader configFileReader;

        private FileReaderManager() {
        }

        public static FileReaderManager getInstance() {
            return fileReaderManager;
        }

        public ConfigFileReader getConfigReader() {
            return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
        }

        @Before (value="@VisualTests", order=1)
        public void beforeVisualTests(Scenario scenario) {
            VisualTestTool.setUp(eyes);
            eyes.open(Driver.current());
            Context.put("eyes", eyes);

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
    }
}
