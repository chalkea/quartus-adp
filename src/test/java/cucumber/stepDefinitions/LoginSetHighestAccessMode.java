package cucumber.stepDefinitions;

import junit.framework.TestCase;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/*
// The source code was generated by javaSeleniumGenerator.js
// Copyright: Tricentis
// Website: https://www.tricentis.com
// Java plugin version: 1.3.3
*/
public class LoginSetHighestAccessMode extends TestCase {
    private static WebDriver driver = null;
    private static Robot robot = null;
    private static Boolean isFirefoxDriver = false;
    private static final Boolean alwaysExecuteActionInLatestWindow = true;

    private static final int MOUSE_LEFT = 0;
    private static final int MOUSE_RIGHT = 2;
    private static final int PAGE_LOAD_TIMEOUT = 60;

//    public static void start() {
//        LoginSetHighestAccessMode.
//    }

    public void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "");
//        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        robot = new Robot();
        driver.manage().window().maximize();
        driver.get("https://online-fit.nj.adp.com/signin/v1?APPID=EnterprisePortal&productId=7ab877eb-7a68-f136-e053-1a4f10332043&returnURL=https://enterpriseportal-fit.nj.adp.com/public/index.htm&callingAppId=EnterprisePortal");
    }

    public static void start() throws Exception {
        /*Type  in 'User ID' edit box: 'atoole1@e6boaws'*/
        sendKeys(null, By.id("login-form_username"), "atoole1@e6boaws", true, 1);
        /*Press  Enter*/
        sendKeys(null, By.id("login-form_username"), "atoole1@e6boaws", true, 1);
        /*Type  in 'Password' edit box: '********'*/
        sendKeys(null, By.id("login-form_password"), "********", true, 8);
        /*Press  Enter*/
        sendKeys(null, By.id("login-form_password"), "********", true, 1);
        /*Click here*/
        click(null, By.xpath(".//*[@id='email-button']/span/span"), MOUSE_LEFT, 6);
        /*Click here*/
        click(null, By.xpath(".//*[@id='verifyOtpBtn']/span/span"), MOUSE_LEFT, 4);
        /*Click 'System admin' link*/
        click(null, By.xpath(".//*[@id='nas-favorites']/a[12]/span"), MOUSE_LEFT, 9);
        /*Click 'Security Administration' link*/
        click(null, By.xpath(".//*[@id='childMenu']/span/a[10]/span[1]"), MOUSE_LEFT, 3);
        /*Click 'Operator' link*/
        click(null, By.xpath(".//*[@id='childMenu']/span/a[4]"), MOUSE_LEFT, 3);
        /*Click 'Profile' link*/
        click(null, By.xpath(".//*[@id='childMenu']/span/a[1]/span"), MOUSE_LEFT, 2);
        /*Type  in 'LastName,FirstName MiddleInitial' edit box: 'toole,ariana'*/
        sendKeys(null, By.id("task-search__OS_OPERATOR_ACCT:1256xNAMEx4"), "toole,ariana", true, 7);
        /*Press  Enter*/
        sendKeys(null, By.id("task-search__OS_OPERATOR_ACCT:1256xNAMEx4"), "toole,ariana", true, 1);
        /*Click here*/
        click(null, By.xpath(".//*[@id='testing']/div/i[1]"), MOUSE_LEFT, 14);
        /*Click here*/
        click(null, By.xpath(".//*[@id='testing']/div/i"), MOUSE_LEFT, 2);
        /*Click here*/
        click(null, By.xpath("html/body/div[11]/div/div/ul/li[5]/span"), MOUSE_LEFT, 3);
        /*Select check box*/
        click(null, By.id("adp-checkbox-16"), MOUSE_LEFT, 2);
        /*Click here*/
        click(null, By.xpath(".//*[@id='entNonEffTabDiv']/div/adp-snackbar/div/div/adp-button/div/button/span"), MOUSE_LEFT, 3);
    }

    public void tearDown() {
        driver.quit();
    }

    public static void click(String frames, By locator, int mouseButton, int timeoutInSeconds) throws Exception {
        click(frames, locator, mouseButton, null, timeoutInSeconds);
    }

    /*
     * try to click on an element, retry until the timeout is reached
     * */
    public static void click(String frames, By locator, int mouseButton, String combinedControlKeys, int timeoutInSeconds) throws Exception {
        if (alwaysExecuteActionInLatestWindow) switchToLastWindow(frames);
        Boolean success = false;
        long timeoutInMillies = timeoutInSeconds * 1000;
        WebElement elm = null;
        // indicate whether the element is an <option> tag on Firefox browser
        Boolean isOptionTagOnFireFox = false;
        // time spent counters
        long timeSpentInMillis = 0;
        // try to click on the element until wait timout reached
        while ((success == false) && (timeSpentInMillis <= timeoutInMillies)) {
            long startFinding = System.currentTimeMillis();
            try {
                // find the element and calculate time spent
                elm = findElement(locator, 1);
                timeSpentInMillis += System.currentTimeMillis() - startFinding;

                if (elm != null) {
                    // get tag name of the element
                    String tag = elm.getTagName();
                    // check whether the element is <option> tag on Firefox browser
                    isOptionTagOnFireFox = isFirefoxDriver && (0 == elm.getTagName().compareToIgnoreCase("option"));

                    // press control keys (Ctrl, Alt, Shift, Meta), if any
                    pressControlKeys(combinedControlKeys);
                    if (mouseButton == MOUSE_LEFT) {
                        // click on the element
                        elm.click();
                    }
                    else if (mouseButton == MOUSE_RIGHT) {
                        Actions action = new Actions(driver);
                        action.contextClick(elm);
                        action.build().perform();
                    }
                    // release control keys (Ctrl, Alt, Shift, Meta)
                    releaseControlKeys(combinedControlKeys);
                    // successfully clicked on element, turn on the flag to escape the loop
                    success = true;
                }
            } catch (Exception e) {
                releaseControlKeys(combinedControlKeys);
                timeSpentInMillis += System.currentTimeMillis() - startFinding;
                // probably the element is not present yet or it is non-clickable
                System.out.println(e.getMessage());
                // if element is found and we reached to the timeout, try to click on it with JavaScript
                if ((elm != null) && (timeSpentInMillis > timeoutInMillies)) {
                    // press control keys (Ctrl, Alt, Shift, Meta), if any
                    pressControlKeys(combinedControlKeys);
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].click();", elm);
                    releaseControlKeys(combinedControlKeys);
                    // successfully clicked on element, turn on the flag to escape the loop
                    success = true;
                }
            }
        }

        if (success) {
            // if element is <option> tag on Firefox browser,
            // perform a workaround to support MOUSE_LEFT
            if (isOptionTagOnFireFox)
            {
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(300);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }
        }
        else { // failed
            if (elm == null) {
                throw new NoSuchElementException("Element not found.");
            } else {
                throw new Exception("Failed to click on the element");
            }
        }
    }

    public static void sendKeys(String frames, By locator, String keys, boolean clearTextBeforeSendingKeys, int timeoutInSeconds) throws Exception {
        if (alwaysExecuteActionInLatestWindow) switchToLastWindow(frames);
        WebElement elm = findElement(locator, timeoutInSeconds);
        if (clearTextBeforeSendingKeys) elm.clear();
        elm.sendKeys(keys);
    }

    public void sendSpecialKey(String frames, By locator, Keys specialKey, int timeoutInSeconds) throws Exception {
        sendSpecialKey(frames, locator, specialKey, null, timeoutInSeconds);
    }

    public void sendSpecialKey(String frames, By locator, Keys specialKey, String combinedControlKeys, int timeoutInSeconds) throws Exception {
        if (alwaysExecuteActionInLatestWindow) switchToLastWindow(frames);
        WebElement elm = findElement(locator, timeoutInSeconds);
        String key = Keys.chord(specialKey);

        if (null != combinedControlKeys) {
            if (combinedControlKeys.contains("Shift"))
                key = Keys.chord(Keys.SHIFT, key);
            if (combinedControlKeys.contains("Alt"))
                key = Keys.chord(Keys.ALT, key);
            if (combinedControlKeys.contains("Ctrl"))
                key = Keys.chord(Keys.CONTROL, key);
            if (combinedControlKeys.contains("Meta"))
                key = Keys.chord(Keys.META, key);
        }

        if (0 < key.length())
            elm.sendKeys(key);
    }

    private static void sendKeyWithoutTarget(int keyCode) {
        sendKeyWithoutTarget(keyCode, null);
    }

    private static void sendKeyWithoutTarget(int keyCode, String combinedControlKeys) {
        pressControlKeys(combinedControlKeys);
        robot.keyPress(keyCode);
        robot.delay(300);
        robot.keyRelease(keyCode);
        releaseControlKeys(combinedControlKeys);
    }

    private static WebElement findElement(By locator, int waitForElementTimeoutInSeconds) throws InterruptedException {
        while(true) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, waitForElementTimeoutInSeconds);
                return wait.until(ExpectedConditions.elementToBeClickable(locator)); //element is displayed and enabled.
            } catch (TimeoutException timeoutException) {
                // sometimes WebDriverWait falied to find elements, e.g. Dojo checkboxs, and we need to fall back to use WebDriver itself
                return driver.findElement(locator);
            } catch (UnhandledAlertException alertException) {
                // Alert dialog is about to be closed, wait a moment and retry
                Thread.sleep(500);
            }
        }
    }
    private static void switchToFrames(String jsonFrames) throws Exception{
        driver.switchTo().defaultContent();
        JSONArray array = new JSONArray(jsonFrames);
        int len = array.length();
        for (int index = 0; index < len; index++) {
            JSONObject obj = array.getJSONObject(index);
            String type = obj.getString("type");
            String value = obj.getString("value");
            // switch to desired frame/iframe
            if (0 == type.compareToIgnoreCase("index")) {
                driver.switchTo().frame(Integer.parseInt(value));
            } else {
                driver.switchTo().frame(value);
            }
        }
    }

    private void performActionDialog(Boolean accept, String data) {
        try {
            // wait 2 seconds to ensure the alert is available
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            if (accept) {
                if (null != data) {
                    alert.sendKeys(data);
                }
                alert.accept();
            }
            else {
                alert.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void pressControlKeys(String keysCombination) {
        if (null == keysCombination)
            return;
        if (keysCombination.contains("Ctrl"))
            robot.keyPress(KeyEvent.VK_CONTROL);
        if (keysCombination.contains("Alt"))
            robot.keyPress(KeyEvent.VK_ALT);
        if (keysCombination.contains("Shift"))
            robot.keyPress(KeyEvent.VK_SHIFT);
        if (keysCombination.contains("Meta"))
            robot.keyPress(KeyEvent.VK_META);
    }

    private static void releaseControlKeys(String keysCombination) {
        if (null == keysCombination)
            return;
        if (keysCombination.contains("Ctrl"))
            robot.keyRelease(KeyEvent.VK_CONTROL);
        if (keysCombination.contains("Alt"))
            robot.keyRelease(KeyEvent.VK_ALT);
        if (keysCombination.contains("Shift"))
            robot.keyRelease(KeyEvent.VK_SHIFT);
        if (keysCombination.contains("Meta"))
            robot.keyRelease(KeyEvent.VK_META);
    }
    public void selectItemByVisibleText(String frames, By selectElementLocator, int waitForElementTimeout,  String text) throws Exception {
        if (alwaysExecuteActionInLatestWindow) switchToLastWindow(frames);
        Select sel = new Select(findElement(selectElementLocator, waitForElementTimeout));
        sel.selectByVisibleText(text);
    }
    private static void switchToLastWindow(String activeFrame) throws Exception{
        Object[] handles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String)handles[handles.length - 1]);
        if (null != activeFrame) switchToFrames(activeFrame);
    }
}
