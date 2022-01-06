package utils;

import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.WebDriver;

public abstract class VisualTestTool {

    public static void setUp(Eyes eyes) {
        Configuration configuration = eyes.getConfiguration();

        configuration.setForceFullPageScreenshot(true);
        configuration.setStitchMode(StitchMode.CSS);
        configuration.setHideScrollbars(true);
        configuration.setHideCaret(true);
//        configuration.setServerUrl("myEyesServer");
        configuration.setAppName("ADP EV6 HRMS");
        configuration.setTestName("something");
        configuration.setApiKey("YyQ2yygdnTUCLaUzy1100shDwI106u4WcmD5AA0NNGej107Pg110");
        configuration.setProxy(new ProxySettings("http://usproxy.es.oneadp.com","tooleap","Kelsey042119947325"));
        configuration.addBrowser(800, 600, BrowserType.CHROME);
        configuration.addBrowser(700, 500, BrowserType.FIREFOX);
        configuration.addBrowser(1600, 1200, BrowserType.IE_11);
        configuration.addBrowser(1024, 768, BrowserType.EDGE_CHROMIUM);
        configuration.addBrowser(800, 600, BrowserType.SAFARI);
        configuration.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
        configuration.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);

        eyes.setConfiguration(configuration);
    }
}
