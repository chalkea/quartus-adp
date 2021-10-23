package utils;

public class UrlEnvironmentSetter {
    private static String environment = System.getProperty("environment");
    public static void SetEnvironmentUrl() {
        switch (environment) {
            case "dit":
                SystemPropertySetter.setSystemProperty("url","https://enterpriseportal-dit.nj.adp.com/public/index.htm");
                break;
            case "ipe":
                SystemPropertySetter.setSystemProperty("url","https://enterpriseportal-ipe.nj.adp.com/public/index.htm");
                break;
            case "uat":
                SystemPropertySetter.setSystemProperty("url","https://enterpriseportal-uat.adp.com/public/index.htm");
                break;
            case "prod":
                SystemPropertySetter.setSystemProperty("url","https://online.adp.com/signin/v1/?APPID=EnterprisePortal&productId=80e309c3-70d0-bae1-e053-3505430b5495&returnURL=https://enterpriseportal.adp.com/public/index.htm&callingAppId=EnterprisePortal");
                break;
            default:
                System.setProperty("environment","fit");
                SystemPropertySetter.setSystemProperty("url","https://enterpriseportal-fit.nj.adp.com/public/index.htm");
                break;
        }
    }
}