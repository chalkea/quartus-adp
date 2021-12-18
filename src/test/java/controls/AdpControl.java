package controls;

import core.Configuration;
import cucumber.steps.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import ui.Page;
import ui.controls.Control;
import ui.controls.Edit;
import ui.controls.SelectList;
import ui.controls.TableView;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.TAB;
import static ui.Page.getCurrent;

public class AdpControl extends Control {
    Duration duration = Duration.ofSeconds(Long.valueOf(Configuration.get("timeout")));
    Duration interval = Duration.ofSeconds(5);
    Wait<WebDriver> fluentWait = new FluentWait<>(getDriver())
            .withTimeout(duration)
            .pollingEvery(interval)
            .ignoring(NoSuchElementException.class);

    public AdpControl(Page parentValue, By locatorValue) {
        super(parentValue, locatorValue);
    }

    public static void clickControl(Control control) {
        doWhileSpinnerIsPresent();
        control.click();
    }

    public static void moveToElement(WebElement webElement) {
        Actions actions = new Actions(Page.getCurrent().getDriver());
        actions.moveToElement((WebElement) webElement);
        actions.perform();
    }

    public static void pressEnter(String s) {
        Page.getCurrent().buildXpathControl(s).element().sendKeys(ENTER);
    }

    public static void selectByVisibleText(String text, By locator) {
        SelectList selectList = new SelectList(Page.getCurrent(), locator);
        selectList.selectByText(text);
    }

    public static void clickOnElement(String search_button) {
        Page.getCurrent().waitForAngularRequestToComplete();
        doWhileSpinnerIsPresent();
        Control control = (Control) verifyElementExists(search_button);
        control.isClickable(5);
        control.click();
    }

    public static void clickOnSubItem(String firstLast, String item, String list) throws Exception {
        int index = 0;
        TableView control = (TableView) verifyElementExists(list);
        if (firstLast.equals("last")) {
            index = control.getItemsCount() - 1;
        }
        control.getSubItem(item, index).click();

    }

    public static void doWhileSpinnerIsPresent() {
        boolean oneOrMoreSpinnersOnPage = true;
        while (oneOrMoreSpinnersOnPage == true) {
            List<WebElement> spinnerCount = Page.getCurrent().getDriver()
                    .findElements(By.xpath("//*[name()='svg' and @class='vdl-busy-indicator__icon'] | //*[name='svg' and @class='nas-busy-indicator__icon']"));
            oneOrMoreSpinnersOnPage = spinnerCount.size() != 0;
        } ////*[contains(@class, 'actity-menu-items')]
    }

    public static void typeAndEnter(String text, String fieldName) {
        try {
            Control control = enterValue(text, fieldName);
            control.element().sendKeys(ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void goingTo(String name) throws Exception {
        Page target = Page.screen(name);
        Assert.assertNotNull("Unable to find the '" + name + "' page", target);
        target.navigate();
    }

    public static void typeAndTab(String text, String fieldName) {
        try {
            doWhileSpinnerIsPresent();
            Control control = enterValue(text, fieldName);
            if (control.getText().isEmpty()) {
                enterValue(text, fieldName);
            }
            control.element().sendKeys(TAB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object verifyElementExists(String fieldName) {
        Page.getCurrent().waitForAngularRequestToComplete();
        Control control = null;
        try {
            control = getCurrent().onPage(fieldName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotNull("Unable to find '" + fieldName + "' element on current page", control);
        Assert.assertTrue("Element '" + fieldName + "' is not available", control.exists());
        return control;
    }

    public static Control verifyFieldText(String fieldName, String text) throws Exception {
        Control control = (Control) verifyElementExists(fieldName);
        String actualText = control.getText().trim().replaceAll("\n", "");
        Assert.assertTrue(String.format("The '%s' field has unexpected text. \nExp: '%s', \nGot: '%s'"
                , fieldName
                , text
                , actualText)
                , text.equals(actualText) || actualText.contains(text));
        return control;
    }

    public static void verifyMultipleFieldsExists(List<String> elements) throws Exception {
        for (String element : elements) {
            verifyElementExists(element);
        }
    }

    public static Control enterValue(String text, String fieldName) throws Exception {
        CommonSteps.doThreadSleep(2000);
        doWhileSpinnerIsPresent();
        Edit control = (Edit) verifyElementExists(fieldName);
        control.setText(text);
        return control;
    }

    @Override
    public void click() {
        Page.getCurrent().waitForAngularRequestToComplete();
        waitTilSpinnerIsGone();
        super.click();
    }

    @Override
    public <T extends Page> T clickAndWait(Class<T> pageClass) throws Exception {
        Page.getCurrent().waitForAngularRequestToComplete();
        return super.clickAndWait(pageClass);
    }

    public void waitTilSpinnerIsGone () {
         By locator = By.cssSelector("#app-microapp-enterprise-ui-root-container adp-busy-indicator svg");
         fluentWait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(locator)));
         waitUntil(ExpectedConditions.invisibilityOfElementLocated( locator),30);
    }
}
