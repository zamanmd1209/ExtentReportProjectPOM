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

import utils.ExtentReportGenerator;

public class myListeners implements ITestListener{
	
	//ExtentReports report  =ExtentReportGenerator.geExtentReport();
	
	public ExtentReports extent;// = new ExtentReports();
	
	public ExtentTest eTest;

	//ExtentTest eTest;
	
	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		//String testName= result.getName();
		//eTest=report.createTest(result.getName());
		eTest.log(Status.INFO, "Execution Started for.."+result.getTestName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName= result.getName();
		eTest.log(Status.PASS, testName+".. Got Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName= result.getName();
		eTest.log(Status.FAIL, testName+" got Failed");
		
		try {
			WebDriver driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eTest.addScreenCaptureFromPath(takeScreenShot());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
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
