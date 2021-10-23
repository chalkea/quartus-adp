package cucumber.stepDefinitions.hooks;


import core.Configuration;
import core.Driver;
import facades.database.MongoDBFacade;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import ui.Page;
import utils.BrowserSetter;
import utils.SystemPropertySetter;
import utils.UrlEnvironmentSetter;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WebHooks {
    private Map<String, Object> vars;
    private JavascriptExecutor js;

    public WebHooks () {}

    @Before
    public void beforeScenario ( Scenario scenario ) throws Exception {
        js = (JavascriptExecutor) Driver.current();

//        MongoDBFacade mongoDBFacade = new MongoDBFacade();
//        mongoDBFacade.createCollection("credentials","/Users/toolea0/automation/src/test/resources/data/credentials.csv");

        Configuration.load();
        Configuration.print();
        Proxy proxy = new Proxy();

        String browser = System.getProperty("browser");
        BrowserSetter.setBrowserConfig(browser);
//        UrlEnvironmentSetter.SetEnvironmentUrl();

        DesiredCapabilities cap = new DesiredCapabilities();

        ChromeOptions options = new ChromeOptions();
        FirefoxProfile profile = new FirefoxProfile();

        Map<String, Object> prefs = new HashMap();
        if (Configuration.platform().isWeb()) {
            Driver.addChromeOptions(browser, options);
        } else {
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", "Android Emulator");
            cap.setCapability("browserName", "Chrome");
            cap.setCapability("commandTimeout", "60");
            Driver.add(Configuration.get("driver_url"), browser, cap);
        }
    }

    @After
    public void afterScenario (Scenario scenario ) throws Exception {
        if (scenario.isFailed()) {
            Page currentPage = new Page (Driver.current());
            String fileName = "./target/screenshots/" + currentPage.getClass().getSimpleName()
                    + "-" + new Date().getTime() + ".png";
            currentPage.captureScreenShot( fileName );
        }
        Driver.current().quit();
    }
}
