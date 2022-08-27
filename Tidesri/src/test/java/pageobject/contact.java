package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact {

WebDriver ldriver;
    
    
    public contact(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//a[@href=\"/en-us/contact-us\"]")
     WebElement contactus;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
      public void Contactus()
     {
   	  contactus.click();
   	  
     }
      public void Close()
      {
    	  close.click();
    	  
      }
      
     
}
