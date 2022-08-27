package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms {

WebDriver ldriver;
    
    
    public Terms(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//a[@href=\"https://termsandconditions.pg.com/en-us/\"]")
     WebElement Terms;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
      public void terms()
     {
   	  Terms.click();
   	  
     }
      public void Close()
      {
    	  close.click();
    	  
      }
}
