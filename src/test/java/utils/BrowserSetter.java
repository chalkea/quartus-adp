package utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetter {
    public static void setBrowserConfig(String browser) {
        switch (browser) {
            case "chrome":
                setBrowserPath("chrome","src/test/drivers/chromedriver");
//                WebDriverManager.chromedriver().setup();
                break;
            case "firefox":
                setBrowserPath("gecko","src/test/drivers/geckodriver");
                break;
            case "edge":
                setBrowserPath("edge","src/test/drivers/msedgedriver");
//                WebDriverManager.edgedriver().setup();
                break;
            case "safari":
                setBrowserPath("safari","/usr/bin/safaridriver");
                break;
        }
    }

    private static void setBrowserPath(String browser, String path) {
        SystemPropertySetter.setBrowserDriverPath(browser, path);
    }
}
