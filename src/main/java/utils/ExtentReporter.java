package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	public static ExtentReports getExtentReport() {
		
		String extentReportFilePath= System.getProperty("user.dir"+"\\Reports\\extentReport.html");
		
		ExtentReports extentReport = new ExtentReports();
		
		ExtentSparkReporter sparkReporters= new ExtentSparkReporter(extentReportFilePath);
		
		sparkReporters.config().setReportName("Yahoo Page Test");
		
		extentReport.attachReporter(sparkReporters);
		
		extentReport.setSystemInfo("OS:", "Windows 10");
		
		extentReport.setSystemInfo("Tester:", "Md Zaman");
		
		return extentReport;
		
	}

}
