package reusable;

import java.io.File;
import java.io.IOException;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper
{
	public static String screenShot(WebDriver driver) 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String scPath=System.getProperty("user.dir")+"/screenshots/nav"+  ".png";
		try
		{
			FileHandler.copy(src, new File(scPath));
			
			System.out.println("Screenshot captured");
		}
		catch (IOException e)
		{
			System.out.println("Not captured");
			
		}
		return scPath;
		
	}
	
	
	
}
