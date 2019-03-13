package stepDefs;

import common.ConfigFileReader;
import driverUtils.SingletonWebDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.omg.SendingContext.RunTime;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class CommonStepDef {

    ConfigFileReader configFileReader = new ConfigFileReader();

    protected WebDriver getWebDriver(){
        SingletonWebDriver.setBrowserName(configFileReader.getBrowserName().toString());
        return SingletonWebDriver.getInstance();
    }

    public void navigateToUrl(){
        new LoginPage(getWebDriver()).navigate(configFileReader.getAppurl());
    }


}
