package utils;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static void main(String[] args) {
        BrowserSetter.setBrowserConfig("chrome");
//        WebDriver webDriver = Page.getCurrent().getDriver();
        WebDriver webDriver = new ChromeDriver();

        VisualGridRunner runner = new VisualGridRunner(new RunnerOptions().testConcurrency(5));
        Eyes eyes = new Eyes(runner);
        setUp(eyes);

        try {
            ultraFastTest(webDriver, eyes);
        } finally {
            tearDown(webDriver, runner);
        }
    }

    public static void setUp(Eyes eyes) {
        Configuration configuration = eyes.getConfiguration();
        configuration.setApiKey("YyQ2yygdnTUCLaUzy1100shDwI106u4WcmD5AA0NNGej107Pg110");
        configuration.setBatch(new BatchInfo("Ultrafast Batch"));
        configuration.addBrowser(800, 600, BrowserType.CHROME);
        configuration.addBrowser(700, 500, BrowserType.FIREFOX);
        configuration.addBrowser(1600, 1200, BrowserType.IE_11);
        configuration.addBrowser(1024, 768, BrowserType.EDGE_CHROMIUM);
        configuration.addBrowser(800, 600, BrowserType.SAFARI);

        configuration.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
        configuration.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);

        configuration.setProxy(new ProxySettings("http://usproxy.es.oneadp.com","toolea0","Kelsey042119947325" ));
        eyes.setConfiguration(configuration);
    }

    public static void ultraFastTest(WebDriver webDriver, Eyes eyes) {
        try {
            webDriver.get("https://demo.applitools.com");
            // Call Open on eyes to initialize a test session
            eyes.open(webDriver, "Demo App", "Ultrafast grid demo", new RectangleSize(800, 600));
            // check the login page with fluent api, see more info here
            // https://applitools.com/docs/topics/sdk/the-eyes-sdk-check-fluent-api.html
            eyes.check(Target.window().fully().withName("Login page"));
            webDriver.findElement(By.id("log-in")).click();
            // Check the app page
            eyes.check(Target.window().fully().withName("App page"));
            // Call Close on eyes to let the server know it should display the results
            eyes.closeAsync();
        } finally {
            eyes.abortAsync();
        }
    }

    private static void tearDown(WebDriver webDriver, VisualGridRunner runner) {
        // Close the browser
        webDriver.quit();
        // we pass false to this method to suppress the exception that is thrown if we
        // find visual differences
        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        System.out.println(allTestResults);
    }
}
