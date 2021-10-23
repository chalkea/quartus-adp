package utils;

public class BrowserSetter {
    public static void setBrowserConfig(String browser) {
        switch (browser) {
            case "chrome":
                setBrowserPath("chrome","src/test/drivers/chromedriver");
                break;
            case "firefox":
                setBrowserPath("gecko","src/test/drivers/geckodriver");
                break;
            case "edge":
                setBrowserPath("edge","src/test/drivers/msedgedriver");
                break;
        }
    }

    private static void setBrowserPath(String browser, String path) {
        SystemPropertySetter.setBrowserDriverPath(browser, path);
    }
}
