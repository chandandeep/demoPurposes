package pages;

import common.AbstractPage;
import controls.Controllers;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.invoke.WrongMethodTypeException;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class AccountPage extends AbstractPage<AccountPage> {


    @FindBy(css="a[title='Information']")
    public WebElement personalInformationTab;

    @FindBy(css="span[class='navigation_page']")
    public WebElement navigationPage;

    @FindBy(id="firstname")
    public WebElement firstNameField;

    @FindBy(id="old_passwd")
    public WebElement oldPasswordField;

    @FindBy(id="passwd")
    public WebElement newPasswordField;

    @FindBy(id="confirmation")
    public WebElement confirmPasswordField;

    @FindBy(css="button[name='submitIdentity']")
    public WebElement saveInformationButtton;

    @FindBy(css="p[class*='alert-success']")
    public WebElement successInfoSavedMessage;

    public static String firstName = null;

    public static final String PASSWORD = "12345";

    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }


    @Override
    public String getUrl() {
        return "?controller=my-account";
    }


    public void clickOnPersonalInformation(){
        Controllers.button.click(personalInformationTab);

    }

    public String getNavigationPage(){
        return navigationPage.getText();
    }



    public String enterFirstName(){
        firstName= RandomStringUtils.random(6, true, false);
        firstNameField.sendKeys(firstName);
        return  firstName;
    }


    public void enterPasswordFields(){
    oldPasswordField.sendKeys(PASSWORD);
        newPasswordField.sendKeys(PASSWORD);
        confirmPasswordField.sendKeys(PASSWORD);
    }

    public void submitInformation(){
        Controllers.button.click(saveInformationButtton);
    }

    public String getSuccessMessage(){
        return successInfoSavedMessage.getText();

    }
}
