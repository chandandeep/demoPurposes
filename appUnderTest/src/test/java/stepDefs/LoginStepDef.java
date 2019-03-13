package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class LoginStepDef extends CommonStepDef {

    public LoginPage loginPage;

    public LoginStepDef() {
        loginPage = new LoginPage(getWebDriver());
    }


    @Given("^Click on Sign in on index page$")
    public void click_on_Sign_in_on_index_page() {
        navigateToUrl();
        loginPage.clickOnSignIn();
    }

    @When("^Enter username as \"([^\"]*)\"$")
    public void enter_username_as(String arg1)  {
        loginPage.enterEmail(arg1);
    }

    @When("^Enter password as \"([^\"]*)\"$")
    public void enter_password_as(String arg1)  {
        loginPage.enterPasssword(arg1);
    }

    @Then("^User should be logged in$")
    public void user_should_be_logged_in() {
        loginPage.clickSignInButton();
    }

    @Given("^User logged in to the application$")
    public void user_logged_in_to_the_application()  {
        navigateToUrl();
        loginPage.clickOnSignIn();
        enter_username_as("a@a.com");
        enter_password_as("12345");
        user_should_be_logged_in();
    }

}
