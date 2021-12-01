package cucumber.steps;

import com.github.javafaker.Faker;
import controls.AdpControl;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.EnterpriseHomePage;
import ui.Page;
import ui.PageFactory;
import ui.controls.Control;
import ui.controls.Edit;
import ui.controls.SelectList;
import ui.controls.TableView;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.openqa.selenium.Keys.ENTER;
import static ui.Page.getCurrent;

public class CommonSteps {
    public static final String ACTIVITY = "'Activity'";
    private static EnterpriseHomePage enterpriseHomePage;
    private static Faker faker = Faker.instance();
    private static AdpControl adpControl;

    public static void EnterPersonalDetails() throws Exception {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String password = "password001";
        String number = faker.number().digits(5);
        String email = firstName + "." + lastName + number + "@" + "testAdp.com";

        enterpriseHomePage = PageFactory.init(EnterpriseHomePage.class);
    }

    public static void logoffUser() throws Exception {
        EnterpriseHomePage enterpriseHomePage = PageFactory.init(EnterpriseHomePage.class);
        Page.setCurrent(enterpriseHomePage);
        enterpriseHomePage.leftNavNasUser.click();
        enterpriseHomePage.leftNavLogoff.click();
        getCurrent().getDriver().switchTo().activeElement();
        enterpriseHomePage.btnOk.click();
    }

    public static void loginTo(String name) throws Exception {
        goingTo(name);

        if (System.getProperty("userType").equalsIgnoreCase("adpUser")) {
            enterLoginCredentials();
            loginUsingLadpUser ();
        } else
            enterLoginCredentials();
        System.setProperty("loggedin", "yes");
    }

    private static void loginUsingLadpUser() throws Exception {

        String cssLocator =  "#toolbarQuickSearchInput";
        Control quickSearch = getCurrent().buildCssControl(cssLocator);
        quickSearch.isClickable(30);

        String client = System.getProperty("client");
        getCurrent().getDriver().findElement(By.cssSelector(cssLocator)).clear();
        getCurrent().getDriver().findElement(By.cssSelector(cssLocator)).sendKeys(client);

        String locator = String.format ( "//*[text()='%s' or contains(text(), '%s' )]", client, client);
        Control xpath = getCurrent().buildXpathControl(locator);
        xpath.click();

        String locatorPractitioner = String.format ( "//*[text()='%s' or contains(text(), '%s' )]", "Practitioner", "Practitioner");
        Control xpathPractitioner = getCurrent().buildXpathControl(locatorPractitioner);
        xpathPractitioner.isClickable(30);
        xpathPractitioner.click();
    }

    private static void enterLoginCredentials() throws Exception {
        String user = System.getProperty("user");
        String psw = System.getProperty("psw");

        if (user == null || psw == null || user.isEmpty() || psw.isEmpty())
            throw new RuntimeException("Missing credentials for login!\n Please add to runconfiguration.");

        typeAndEnter(user, "User Id");
        typeAndEnter(psw, "Password");
    }

    public static void goingTo(String name) throws Exception {
        Page target = Page.screen(name);
        Assert.assertNotNull("Unable to find the '" + name + "' page", target);
        target.navigate();
    }

    public static void verifyCurrentPage(String name) throws Exception {
        Page target = Page.screen ( name );
        Assert.assertTrue ( "The '" + name + "' screen is not current", target.isCurrent () );
        Page.setCurrent ( target );

    }
    public static void typeAndEnter(String text, String fieldName ) throws Exception {
        Control control = enterValue(text, fieldName);
        control.element().sendKeys(ENTER);
    }


    public static Control enterValue(String text, String fieldName) throws Exception {
        Edit control = (Edit) verifyElementExists(fieldName);
        control.setText(text);
        return control;
    }

    public static Object verifyElementExists(String fieldName) throws Exception {
        Page.getCurrent().waitForAngularRequestToComplete();
        Control control = getCurrent ().onPage ( fieldName );
        Assert.assertNotNull ( "Unable to find '" + fieldName + "' element on current page", control );
        Assert.assertTrue ( "Element '" + fieldName + "' is not available", control.exists () );
        return control;
    }

    public static Control verifyFieldText(String fieldName, String text) throws Exception {
        Control control = (Control) verifyElementExists ( fieldName );
        String actualText = control.getText ().trim ().replaceAll ( "\n","" );
        Assert.assertTrue ( String.format ( "The '%s' field has unexpected text. \nExp: '%s', \nGot: '%s'"
                , fieldName
                , text
                , actualText )
                , text.equals ( actualText ) || actualText.contains ( text ) );
        return control;

    }

    public static void verifyListEmptyState(String list, String emptyState) throws Exception {
        boolean empty = emptyState.trim ().equals ( "" );
        TableView control = (TableView) verifyElementExists ( list );
        if (empty) {
            Assert.assertTrue ( "The '" + list + "' is not empty", control.isEmpty () );
        } else {
            Assert.assertTrue ( "The '" + list + "' is empty", control.isNotEmpty () );

        }
    }

    public static void verifyGenericTextOnThePage(List<List<String>> content) throws Exception {
        System.out.println ( content.toString () );
        for (int i = 0; i < content.size (); i++) {
            if (i == 0) {
                continue;
            }
            System.out.println ( content.get ( i ).get ( 0 ) + " " + content.get ( i ).get ( 1 ) );
            verifyFieldText ( content.get ( i ).get ( 0 ).toString (), content.get ( i ).get ( 1 ).toString () );
        }

    }

    public static void verifyMultipleFieldsExists(List<String> elements) throws Exception {
        for (String element : elements) {
            verifyElementExists ( element );
        }
    }

    public static void verifyInputOfMultipleFields(List<Map<String, String>> content) throws Exception {
        for (Map<String, String> row : content) {
            verifyFieldText ( row.get ( "Field" ) , row.get ( "Text" ) );
        }
    }

    public static void enterTextIntoMultipleFields(List<Map<String, String>> content) throws Exception {
        for (Map<String, String> row : content) {
            enterValue ( row.get ( "Field" ), row.get ( "Value" ) );
        }

    }

    public static void verifyTextPresence(String text) {
        Assert.assertTrue ( "Unable to find text: '" + text + "'"
                , getCurrent ().isTextPresent ( text ) );
    }

    public static void verifyLabelsAvailability(List<String> elements) throws Exception {
        for (String element : elements) {
            verifyElementExists ( element );
        }
    }

    public static void verifyListRowData(String firstLast, String list, DataTable data) throws Exception {
        int index = 0;
        TableView control = (TableView) verifyElementExists ( list );
        if (firstLast.equals ( "last" )) {
            index = control.getItemsCount () - 1;
        }
        List<Map<String, String>> content = data.asMaps ( String.class, String.class );
        for (Map<String, String> row : content) {
            for (Map.Entry<String, String> entry : row.entrySet ()) {
                String key = entry.getKey ();
                String value = entry.getValue ();
                Assert.assertEquals (
                        String.format ( "The %s row element '%s' has unexpected value", firstLast, key ),
                        value, control.getSubItem ( key, index ).getText () );
            }
        }

    }

    public static void clickOnSubItem(String firstLast, String item, String list) throws Exception {
        int index = 0;
        TableView control = (TableView) verifyElementExists ( list );
        if (firstLast.equals ( "last" )) {
            index = control.getItemsCount () - 1;
        }
        control.getSubItem ( item, index ).click ();

    }

    public static void clickOnElement(String search_button) throws Exception {
        Control control = (Control) verifyElementExists(search_button);
        control.click();
    }

    public static void selectByVisibleText(String text, By locator) {
        SelectList selectList = new SelectList(Page.getCurrent(), locator);
        selectList.selectByText(text);
    }

    public static void clickOnLeftNavigationItem(DataTable content) throws Exception {
        List<String> items = content.asList();
        Page.getCurrent().waitForAngularRequestToComplete();

        String locator = "#nas-top-menu > a.bread-crumb.home-crumb > span";
        Page.getCurrent().buildCssControl(locator).isClickable(15);
        Page.getCurrent().buildCssControl(locator).click();
        for (String item : items) {

            Page.getCurrent().waitForAngularRequestToComplete();
//            locator = String.format ( "//span[normalize-space(text())='%s']", item);
            locator = String.format ( "//a//span[contains(text(),'%s')][@class='label']", item);
            WebElement webElement = Page.getCurrent().getDriver().findElement(By.xpath(locator));
            Control control = null;
            try {
                moveToElement(webElement);
                control = Page.getCurrent()
                        .buildXpathControl(locator);
                control.click();
            } catch (ElementClickInterceptedException e) {
                control.isClickable(15);
                control.click();
            }
            Thread.sleep(1000);
        }
        String fileName = "./target/screenshots/passed/" + Page.getCurrent().getClass().getSimpleName()
                + "-" + new Date().getTime() + ".png";
        Page.getCurrent().captureScreenShot(fileName);
    }
    public static void selectTaskFromGlobalSearch (String parentTask, String task, String locatorPattern)  {

        String gsl = "#toolbarQuickSearchInput";
        Page.getCurrent().buildCssControl(gsl).click();
        Page.getCurrent().buildCssControl(gsl).element().clear();
        Page.getCurrent().buildCssControl(gsl).element().sendKeys(task);
        String act = "//*[@id='nasShellMastheadSearch']//*[contains(text()," + ACTIVITY + ")]";
        doThreadSleep(500);
        
        Page.getCurrent().buildXpathControl(act).click();

        String locator = String.format(locatorPattern,parentTask);
        WebDriver driver = Page.getCurrent().getDriver();
        WebElement element = driver.findElement(By.xpath(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Page.getCurrent().buildXpathControl(locator).click();

    }
    public static void moveToElement(WebElement webElement) {
        Actions actions = new Actions( Page.getCurrent ().getDriver() );
        actions.moveToElement ((WebElement) webElement);
        actions.perform ();
    }

    public static DataTable createDataTable(List<String> raw) {
        return DataTable.create(Collections.singletonList(raw));
    }
    private static void doThreadSleep(long mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
        }
    }

    public static void selectFromSearchPrompt(String locator) {
        Page.getCurrent().buildXpathControl(locator).click();
    }

    public static void pressEnter(String s) {
        Page.getCurrent().buildXpathControl(s).element().sendKeys(ENTER);
    }
}
