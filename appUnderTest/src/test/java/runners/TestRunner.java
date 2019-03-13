package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import driverUtils.SingletonWebDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {
            "json:reports/cucumber.json" ,
            "junit:reports/cucumber.xml"},
                           /* dryRun = true,
                            strict = true,*/
            monochrome = true,
            features = "src/test/resources",
           /* tags = {"@smoke"},*/
            glue = {"stepDefs"}
    )

    public class TestRunner {

    @AfterClass
    public static void tearDown() {
        System.out.println("this is executed");
        if (SingletonWebDriver.isInitialized()) {
            SingletonWebDriver.getInstance().close();
            SingletonWebDriver.getInstance().quit();
        }

    }

    }
