package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverUtils.SingletonWebDriver;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class Hooks {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("setting up");

        CommonStepDef commonStepDef = new CommonStepDef();

        commonStepDef.getWebDriver();
        System.out.println("set up done");

    }

    @After(order = 1)
    public  void logout(){
        System.out.println("running logout");
        SingletonWebDriver.getInstance().get("http://automationpractice.com/index.php?mylogout=");
        System.out.println("logout exeuted");

    }



}
