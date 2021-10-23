package utils;

public class SystemPropertySetter {
    static void setBrowserDriverPath(String browser, String path) {
        System.setProperty("webdriver."+browser+".driver", path);
    }
    static void setSystemProperty(String property, String value) {
        System.setProperty(property, value);
    }
}
