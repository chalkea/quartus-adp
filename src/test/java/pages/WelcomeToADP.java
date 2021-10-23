package pages;

import core.Alias;
import core.Configuration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import ui.FindBy;
import ui.Page;
import ui.controls.Edit;

@Alias("Welcome to ADP")
public class WelcomeToADP extends Page {

    @Alias("User ID Label")
    @FindBy(locator = "id=user_id", excludeFromSearch = false)
    public Edit labelUserId;

    @Alias("User Id")
    @FindBy(locator = "id=login-form_username", excludeFromSearch = false)
    public Edit inputUserId;

    @Alias("Remember Me Label")
    @FindBy(locator = "id=span_remember_me", excludeFromSearch = false)
    public Edit labelRememberMe;

    @Alias("Remember Me Checkbox")
    @FindBy(locator = "css=id^=checkbox_", excludeFromSearch = false)
    public Edit chkboxRememberMe;

    @Alias("Password Label")
    @FindBy(locator = "id=login-form_password_label", excludeFromSearch = false)
    public Edit labelPassword;

    @Alias("Password")
    @FindBy(locator = "id=login-form_password", excludeFromSearch = false)
    public Edit inputPassword;

    @Alias("Signin Button")
    @FindBy(locator = "id=signBtn", excludeFromSearch = false)
    public Edit btnSignin;

    @Alias("Alert message")
    @FindBy(locator = "class=vdl-alert__content", excludeFromSearch = false)
    public Edit alertMessage;

    public WelcomeToADP(WebDriver driver) {
        super(driver);
    }

    @Override
    public Page navigate() {
//        String environment = System.getProperty("environment");
//        String baseUrl = System.getProperty("url");
        this.getDriver().get(System.getProperty("url"));
        if (Configuration.platform().isWeb())

        {
            this.getDriver().manage().window().setSize(new Dimension(1250, 1250));
        }

        Page.setCurrent(this);
        return this;
    }
}
