package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import tests.TestBase;
import utils.ExtentReporter;



public class ListenerClass implements ITestListener{
	
	ExtentReports extentReport= ExtentReporter.getExtentReport();

	ExtentTest extentTest;
	
	TestBase tBase= new TestBase();
	
	@Override
	public void onFinish(ITestContext result) {

		extentTest.addScreenCaptureFromPath(tBase.takeScreenShot());
		extentReport.flush();
		
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		extentTest.log(Status.FAIL, "Test Failed");
		
		extentTest.fail(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName= result.getName();
	
		//extentTest = extentReport.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

extentTest.log(Status.PASS, "Test Passed");
		
		
	}

	
	//ITestListener lisner;
}
