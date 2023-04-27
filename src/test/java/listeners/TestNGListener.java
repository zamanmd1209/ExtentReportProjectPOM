package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import tests.TestBase;
import utils.ExtentReporter;



public class TestNGListener implements ITestListener{
	
	//ExtentReports extentReport= ExtentReporter.getExtentReport();

	//ExtentTest extentTest;
	
	//TestBase tBase= new TestBase();
	
	@Override
	public void onFinish(ITestContext result) {

		//extentTest.addScreenCaptureFromPath(tBase.takeScreenShot());
		//extentReport.flush();
		
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
		
		System.out.println("TestCase failed for .."+result.getName());
		
		//extentTest.log(Status.FAIL, "Test Failed");
		
		//extentTest.fail(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase Skipped"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase Execution Started for .."+result.getName());
		
		//String testName= result.getName();
	
		//extentTest = extentReport.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase passed and Success for .. "+result.getName());

		//extentTest.log(Status.PASS, "Test Passed");
		
		
	}

	
	//ITestListener lisner;
}
