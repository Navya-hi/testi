package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class odoremoval {

WebDriver ldriver;
    
    
    public odoremoval(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//*[@id=\"site-footer\"]/div[2]/div/div[1]/div/div[3]/div/div[2]/div[2]/a/span")
     WebElement odoremoval;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
      public void Odor()
     {
   	  odoremoval.click();
   	  
     }
      public void Close()
      {
    	  close.click();
    	  
      }
      
     
}
