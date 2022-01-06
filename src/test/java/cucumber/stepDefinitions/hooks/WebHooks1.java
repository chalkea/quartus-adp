package cucumber.stepDefinitions.hooks;


import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import core.Configuration;
import core.Context;
import core.Driver;
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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WebHooks1 {
    public static final String USER_NAME = "user.name";
    public static final String TEST = "test";
    private Map<String, Object> vars;
    private JavascriptExecutor js;
    private String skipBrowserStuff = "no";
    private String sameBrowser;

    public WebHooks1() {
    }

    @Before(value="@Web", order=1)
    public void beforeScenario(Scenario scenario) throws Exception {
        sameBrowser = System.getProperty("sameBrowser");
        ExtentReports extentReports;
        ExtentHtmlReporter htmlReporter;
        ExtentTest extentTest;

        Context.put("extentReports", new ExtentReports());
        Context.put("htmlReporter", new ExtentHtmlReporter(System.getProperty("user.dir"+"/out/extent_report.html")));

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
//    @Before(order=1)
//    public void beforeAssignAuthor (Scenario scenario) {
//        if (scenario.getName().contains("Warriors")) {
//            Reporter.addStepLog("Add author");
//            Reporter.assignAuthor("EV6 Automation - Warriors: Allen Toole");
//        }
//    }

    @After(value = "@Web", order = 1)
    public void afterScenario(Scenario scenario) throws Exception {

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
//    @After(order=1)
//    public static void writeExtentReport() {
//        loadXMLConfig(new File(FileReaderManager.getInstance()
//                .getConfigReader().getReportConfigPath()));
//        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//    }

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
    }
}
