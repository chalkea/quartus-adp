package controls;

import core.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import ui.Page;
import ui.controls.Control;

import java.time.Duration;
import java.util.NoSuchElementException;

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

    @Override
    public void click() {
        Page.getCurrent().waitForAngularRequestToComplete();
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
