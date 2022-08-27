package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configure {
Properties pro;
	
	public Configure()
	{
		 File src = new File("./configuration/config.properties");
	      try {
			FileInputStream ser = new FileInputStream(src);
			pro = new Properties();
			pro.load(ser);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to get msg"+e.getMessage());
		}
	
	}
	
	public String getURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getbrowser()
	{
		String ser = pro.getProperty("chrome");
		return ser;
	}
	
	
}
