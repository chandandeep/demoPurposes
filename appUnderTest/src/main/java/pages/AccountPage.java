package pages;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class AccountPage extends AbstractPage<AccountPage> {

    @FindBy(css="span[class*='navigation_page']")
    public WebElement navigationBar;


    @FindBy(css="a[title="+"%s"+"]")
    public WebElement menuOnNavigationBar;
    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String getUrl() {
        return "controller=my-account";
    }
}
