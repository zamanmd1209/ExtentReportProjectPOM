package tests;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	//ExtentReports extent = new ExtentReports();
	
	//ExtentTest test;
	
	public WebDriver driver;
	
	
	
	//public WebDriverWait wait;// =new WebDriverWait(driver,20);

	
	//@BeforeMethod
	@BeforeTest
	//@BeforeSuite
	public void initialize() throws IOException {
		
		//String methodname = new Object() {
		//}.getClass().getEnclosingMethod().getName();
		//ExtentSparkReporter spark = new ExtentSparkReporter(
		//		"./ExtentReports" + "/ReportsOn-" + getCurrentDateTime() + ".html");
		 //test= extent.createTest("Execution Report of: "+methodname);
		
		//spark.config().setTheme(Theme.DARK);
		//spark.config().setDocumentTitle(" Extent Test Report For Smoke Test");
				
		//extent.attachReporter(spark);

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options= new ChromeOptions();

		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		//options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		

		

		//test = extent.createTest(methodname);

	}

	public void navigateToPage(String pageUrl) {

		driver.get(pageUrl);

	}

	public void getCurrentUrl() {

		System.out.println("Current Url is: " + driver.getCurrentUrl());

	}

	public void getPageTitle() {

		System.out.println("Page Title is: " + driver.getTitle());

	}

	public static String getCurrentDateTime() {

		Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy_hh.mm.ss.aa");

		String dateTime = dateFormat.format(date);

		return dateTime;

		// System.out.println("New date Time is: " + dateTime);

	}

	public String takeScreenShot() {

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destinationFilePath = new File("./ScreenShots" + "/" + getCurrentDateTime() + ".png");

		//String absolutePathlocation=destinationFilePath.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, destinationFilePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String absolutePathLocation = destinationFilePath.getAbsolutePath();

		return absolutePathLocation;

	}

		//@AfterMethod
		//@AfterTest
		//@AfterSuite
		public void addScreenShot() {
			// TestBase.driver.quit();

			//test.addScreenCaptureFromPath(takeScreenShot());
			//extent.flush();

			//driver.quit();
			driver.close();
		}

	//@AfterMethod
	@AfterTest
	//@AfterSuite
	public void TeardownTest() {
		// TestBase.driver.quit();

		//test.addScreenCaptureFromPath(takeScreenShot());
		//extent.flush();

		//driver.quit();
		driver.close();
	}

}
