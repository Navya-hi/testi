package stepdefinations;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Bounce;
import pageobject.PandGbrand;
import pageobject.Terms;
import pageobject.Whatsnew;
import pageobject.contact;
import pageobject.coupons;
import pageobject.liquids;
import pageobject.odoremoval;
import pageobject.searchbar;
import pageobject.simply;
import reusable.Helper;
import utilites.Configure;
import utilites.Excel;


public class steps {
	
	Configure configure = new Configure(); 
	public String baseURL= configure.getURL();
	public  String chrome=configure.getbrowser();
	 ExtentReports extent = new ExtentReports();
	 ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	
	public WebDriver driver;
	public static Logger logger;
	public ExtentReports report;
	public Excel excel;
	
	
	

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	   
		 extent.attachReporter(spark);
		 excel = new Excel();
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    logger = Logger.getLogger("tidesri");
	    PropertyConfigurator.configure("Log4j.properties");
	    
	    
	    
	}

	@When("User opens URL")
	public void user_opens_url() {
		 ExtentTest test = extent.createTest("open the URL");
		   test.log(Status.PASS, "user opend the website");
	    driver.get(baseURL);
	    driver.manage().window().maximize();
	    logger.info("URL is success");
	}

	@When("Click on Contact Us")
	public void click_on_contact_us() throws InterruptedException {
	  contact cs =new contact(driver);
	   cs.Contactus();
	   Thread.sleep(9000);
	   cs.Close();
	   logger.info("clicked on contactus");
	   Helper.screenShot(driver);
	}
	@When("Click on P&G")
	public void click_on_p_g() {
	   PandGbrand pg = new PandGbrand(driver);
	   pg.PandG();
	   logger.info("Sucessfully clicked on p&g");
	   Helper.screenShot(driver);
	   
    }
	@When("Click on Bounce")
	public void click_on_bounce() {
	    Bounce bs=new Bounce(driver);
	    bs.Bounc();
	    logger.info("Sucessfully clicked on bounce");
	    Helper.screenShot(driver);
	    
	}
	@When("Click on CouponsAndRewards")
	public void click_on_coupons_and_rewards() throws InterruptedException {
	    coupons cr=new coupons(driver);
	    cr.Coupons();
	    Thread.sleep(9000);
	    cr.Close();
	    logger.info("Coupons and rewards are opened");
	    Helper.screenShot(driver);
	}
	@When("Click on What’s New")
	public void click_on_what_s_new() throws InterruptedException {
	    Whatsnew wn=new Whatsnew(driver);
	    wn.whatnew();
	    Thread.sleep(5000);
	    wn.Close();
	    logger.info("succesfully open what's new ");
	    Helper.screenShot(driver);
	}
	@When("Click on Search")
	public void click_on_search() throws InterruptedException {
	   searchbar sb=new searchbar(driver);
	   sb.Search();
	   logger.info("succesfully entered the search ");
	   Thread.sleep(5000);
	    sb.Close();
	    logger.info("succesfully entered the close ");
	    
	    sb.Search();
	   sb.Enter(excel.getStringData(0, 0, 0));
	   logger.info("succesfully entered the data ");
	    Helper.screenShot(driver);
	   
	}
	@When("Click on Odorremoval")
	public void click_on_odorremoval() throws InterruptedException {
	    odoremoval od = new odoremoval(driver);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    od.Odor();
	    Thread.sleep(5000);
	    od.Close();
	    logger.info("clicking succesfull ");
	    Helper.screenShot(driver);
	    
	}
	@When("Click on Tidesimply")
	public void click_on_tidesimply() throws InterruptedException {
	   simply sp =new simply(driver);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   sp.Simple();
	   Thread.sleep(5000);
	    sp.Close();
	    logger.info("clicking succesfull for tidesimply ");
	    Helper.screenShot(driver);
	   
	}
	@When("Click on TermsandConditions")
	public void click_on_termsand_conditions() throws InterruptedException {
	   Terms ts=new Terms(driver);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   ts.terms();
	   Thread.sleep(5000);
	    ts.Close();
	    logger.info("terms and conditions are opened ");
	    Helper.screenShot(driver);
	    
	}
	@When("Click on liquids")
	public void click_on_liquids() throws InterruptedException {
	    liquids ls=new liquids(driver);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    ls.Liquids();
	    Thread.sleep(5000);
	    ls.Close();
	    logger.info("clicked on liquides");
	    Helper.screenShot(driver);
	    
	}


	@When("close browser")
	public void close_browser() {
	   driver.close();
		
	}

}
