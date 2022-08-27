package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass
{
	public static WebDriver launch(WebDriver driver,String browser,String URL)
	{
		if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			
		}
		else if(browser.equals("FireFox"))
		{
			System.out.println("FireFox");
		}
		else if(browser.equals("IE"))
		{
			System.out.println("IE");
		}
		else
		{
			System.out.println("No brower is available");
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
	public static void quit(WebDriver driver)
	{
		driver.quit();
	}
}
