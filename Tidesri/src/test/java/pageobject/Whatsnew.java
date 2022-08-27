package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whatsnew {

WebDriver ldriver;
    
    
    public Whatsnew(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//a[@href=\"/en-us/latest-news\"]")
     WebElement what;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
      public void whatnew()
     {
   	  what.click();
     }
      public void Close()
      {
    	  close.click();
    	  
      }
}
