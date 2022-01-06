package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features"}
        , glue={"cucumber/stepDefinitions"}
        ,
        plugin = {
                "html:target/cucumber-html-report"
                , "junit:target/cucumber-junit.xml"
                , "json:target/cucumber.json"
                , "pretty:target/cucumber-pretty.txt"
                , "usage:target/cucumber-usage.json"
                , "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        }
)
public class RunCukes {
}
