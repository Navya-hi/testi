package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchbar {

WebDriver ldriver;
    
    
    public searchbar(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
     }
     @FindBy(xpath="//input[@type='search']")
     WebElement search;
     @FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
     WebElement close;
     
     
      public void Search()
     {
   	  search.click();
   	  
     }
      public void Close()
      {
    	  close.click();
    	  
      }
      public void Enter(String Data)
      {
    	  search.sendKeys(Data+Keys.ENTER);
    	  
      }
      
}
