package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class liquids {

WebDriver ldriver;
    
    
    public liquids(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(linkText="Liquid")
     WebElement liquids;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
      public void Liquids()
     {
   	  liquids.click();
   	  
     }
      public void Close()
      {
    	  close.click();
    	  
      }

}
