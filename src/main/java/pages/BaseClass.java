//package pages;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseClass {
//	
//	public WebDriver driver;
//	
//	public static WebDriver sDriver;
//	 
//	 @BeforeSuite
//	 public void initialize() throws IOException{
//		 
//		 WebDriverManager.chromedriver().setup();
//		 
//		 //System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
//	 
//	 //System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
//	 driver = new ChromeDriver(); 
//	 //To maximize browser
//	                driver.manage().window().maximize();
//	         //Implicit wait
//	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	 //To open facebook
//	                //driver.get("https://www.facebook.com");
//	                
//	                driver.get("https://www.yahoo.com");
//	 
//	 }
//	 
//	 
//	 
//	 @AfterSuite
//	 //Test cleanup
//	 public void TeardownTest()
//	    {
////	        TestBase.driver.quit();
//		 
//		 driver.quit();
//	    }
//	 
//	
//
//}
