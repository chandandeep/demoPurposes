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

    @FindBY(id="block_top_menu")
    public WebElement topNavigationBar;

    @FindBy(css="a[title='Add to cart']")
     public WebElement addtoCartInitial;	



    @FindBy(css="a[title='Proceed to checkout']")
     public WebElement proceedToCheckOutPopUp;	

    
    @FindBy(css="p[class*='cart_navigation'] a[title='Proceed to checkout']")
     public WebElement proceedToCheckOutSummary;	

	@FindBy(css="button[name='processAddress']")
     public WebElement proceedToCheckOutAddress;

	@FindBy(id='cgv')
	public WebElement agreeCheckBox;

   @FindBy(css="button[name='processCarrier']")
	public WebElement proceedToShipping;

   @FindBy(id="total_price")
	public WebElement totalPrice;

	@FindBy(class="bankwire")
	public WebElement bankWirePayment;
	
	@FindBy(class="cheque")
	public WebElement chequePayment;
	
	@FindBy(css="p[class*='cart_navigation'] button[type='submit']")
	public WebElement confirmOnPaymentButton;

	@FindBy(css="div[class='box'] br")	
	public List<WebElement> boxTextList;
 
   public static String totalPriceValue;

    public static String firstName = null;
	
	public static List<String> textInBox;

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

	



	//This is to divide into other pages

	public void clickTabOnNavigation(String category){
	
		List<String> list =  topNavigationBar.findElements(By.tagName("li"));

	for(int i=0; i<= list.size(); i++){
		if(list[i].getText = category){
		list[i].click();
	}
		}
	
	}	
	

public void initialAddToCart(){
        Controllers.button.click(addtoCartInitial);
    }

public void proceedOnPopUp(){
        Controllers.button.click(proceedToCheckOutPopUp);
    }

public void proceedOnSummary(){
        Controllers.button.click(proceedToCheckOutSummary);
    }

public void proceedOnAddress(){
        Controllers.button.click(proceedToCheckOutAddress);
    }
public void checkAgreeCheckBox(){
	agreeCheckBox.click();	

}

public void proceedOnShipping(){
        Controllers.button.click(proceedToShipping);
    }

public String getTotalPrice(){
	totalPriceValue = totalPrice.getText()
	return totalPriceValue; 
}

public void payAmount(String paymentMethod){
	if(method=="bankwire"){
	Controllers.button.click(bankWirePayment);
	}
	else{
	Controllers.button.click(chequePayment);	
}

public void confirmOnPayment(){
	Controllers.button.click(confirmOnPaymentButton);
}


public static List<String> getDataFromBox(){
		int size = boxTextList.size();
		
		for(int i = 0; i<=size; i++){
			textInBox.add(boxTextList.get(i).getText())
		}
	
	return textInBox;
	
	}

}
