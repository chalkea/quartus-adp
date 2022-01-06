package cucumber.stepDefinitions.hooks;


import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import core.Configuration;
import core.Context;
import core.Driver;
import facades.database.MongoDBFacade;
import facades.database.RelationalDBFacade;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mvc.controller.ControllerInterface;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import ui.Page;
import utils.BrowserSetter;
import utils.ConfigFileReader;
import utils.VisualTestTool;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DbHooks3 {
    public static final String USER_NAME = "user.name";
    public static final String TEST = "test";

    /*
        Before order is 1, 2, 3
        After order is 3, 2, 1
     */

    public DbHooks3() {
    }

    @Before(value = "@SqlDb", order=3)
    public void beforeSqlDbScenario(Scenario scenario) {
        String connectionString = "jdbc:oracle:thin:@//ehrms-ev6-np-db6.ehrms-db-inp.usea1.scn.aws.adp:1521/e6boaws";
        RelationalDBFacade relationalDBFacade = new RelationalDBFacade(connectionString, "DBADM", "DBADM");
        Context.put("relationalDBFacade", relationalDBFacade);
        try {
            ResultSet resultSet = relationalDBFacade.selectRecords("select paygroup, count(local_tax_cd)\n" +
                    "from sd46.ps_al_pg_local\n" +
                    "group by paygroup\n" +
                    "order by count(local_tax_cd) desc");

            resultSet.first();

        } catch (SQLException throwables) {
            System.out.println("Select query failed!");
            throwables.printStackTrace();
        }
    }

    @After(value = "@SqlDb", order=3)
    public void afterSqlDbScenario(Scenario scenario) {
       RelationalDBFacade relationalDBFacade = (RelationalDBFacade) Context.get("relationalDBFacade");
       relationalDBFacade.closeConnection();
    }

    @Before(value = "@NoSqlDb", order = 3)
    public void beforeNoSqlDbScenario(Scenario scenario) {
        MongoDBFacade mongoDBFacade = new MongoDBFacade();
        mongoDBFacade.createCollection(System.getProperty(USER_NAME) + "_" + TEST);
        Context.put("mongoDBFacade", mongoDBFacade);
    }

    @After(value = "@NoSqlDb", order = 3)
    public void afterNoSqlDbScenario(Scenario scenario) {
        MongoDBFacade mongoDBFacade = (MongoDBFacade) Context.get("mongoDBFacade");
        mongoDBFacade.dropCollection(System.getProperty(USER_NAME) + "_" + TEST);
    }
}
