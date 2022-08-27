package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PandGbrand {

WebDriver ldriver;
    
    
    public PandGbrand(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//img[@alt='P&G icon']")
     WebElement pandg;
     
      public void PandG()
     {
   	  pandg.click();
     }
}
