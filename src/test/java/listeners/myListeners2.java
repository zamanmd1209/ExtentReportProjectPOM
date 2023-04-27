package listeners;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.ExtentReportGenerator;

public class myListeners2 implements ITestListener{
	
	public WebDriver driver;
	
	ExtentReports extent= new ExtentReports();
	
	ExtentSparkReporter spark = new ExtentSparkReporter(
			"./ExtentReportstt" + "/ReportsOn-" + getCurrentDateTime() + ".html");
	
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Regression Test Report");
		
		extent.setSystemInfo("Version", "1.00");
		extent.setSystemInfo("Win Version", "Windows 10");
		extent.setSystemInfo("Test Executed By", "Md Zaman");
		extent.attachReporter(spark);
		
		 test= extent.createTest("Test Execution for.. "+result.getName());
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, result.getName()+"..got Passed");
		
		//test.addScreenCaptureFromBase64String(takeScreenShot());
//		String testName= result.getName();
//		eTest.log(Status.PASS, testName+".. Got Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, result.getName()+"..got Failed");
		//test.addScreenCaptureFromBase64String(takeScreenShot());

		
		
		
//		String testName= result.getName();
//		eTest.log(Status.FAIL, testName+" got Failed");
//		
//		try {
//			WebDriver driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchFieldException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		eTest.addScreenCaptureFromPath(takeScreenShot());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName()+"..got Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {

		test= extent.createTest("Reggression Test ...");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	public String takeScreenShot() {

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destinationFilePath = new File("./ScreenShotsdd" + "/ScreenShotOn-" + getCurrentDateTime() + ".png");

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
	
	public static String getCurrentDateTime() {

		Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy_hh.mm.ss.aa");

		String dateTime = dateFormat.format(date);

		return dateTime;

		// System.out.println("New date Time is: " + dateTime);

	}

}
