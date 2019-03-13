package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class TestContext {

    private WebDriver driver;

    public TestContext(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage loginPage = new LoginPage(driver);
}
