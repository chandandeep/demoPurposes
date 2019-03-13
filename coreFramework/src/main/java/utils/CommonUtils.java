package utils;

import com.google.common.base.Function;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */

public class CommonUtils {

    public static WebDriver driver;

    public CommonUtils(WebDriver driver ){
        this.driver = driver;
    }

    public static void  waitTillElementDisplayed(final WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(2, TimeUnit.MINUTES);
        wait.ignoring(StaleElementReferenceException.class); // We need to ignore this
        wait.until(ExpectedConditions.visibilityOf(element));

    }

}
