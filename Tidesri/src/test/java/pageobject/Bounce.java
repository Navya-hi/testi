package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bounce {

WebDriver ldriver;
    
    
    public Bounce(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//img[@alt='Bounce icon']")
     WebElement bounce;
     
      public void Bounc()
     {
   	  bounce.click();
     }
}
