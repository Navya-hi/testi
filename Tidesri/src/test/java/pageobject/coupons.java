package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coupons {

WebDriver ldriver;
    
    
    public coupons(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//a[@href=\"/en-us/coupons-and-rewards\"]")
     WebElement coupons;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
      public void Coupons()
     {
   	  coupons.click();
     }
      public void Close()
      {
    	  close.click();
    	  
      }
}
