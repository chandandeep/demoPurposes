package controls;

import org.openqa.selenium.WebElement;
import utils.CommonUtils;

/**
 * Created by Chandandeep Singh on 13-03-2019.
 */
public class Button extends ObjectControl {

    public Button(WebElement element) {
        super(element);
    }

   public void click(WebElement element){
       element.click();
   }

   public String getText(WebElement element){
       CommonUtils.waitTillElementDisplayed(element);
       return element.getText();
   }

}
