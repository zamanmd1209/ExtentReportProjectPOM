package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGenerator {
	
	public static ExtentReports geExtentReport() {
		
		ExtentReports report= new ExtentReports();
		//ExtentSparkReporter spark= new ExtentSparkReporter("./ExtentReportss/reports.xml");
		
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./ExtentReports" + "/ReportsOn-" + getCurrentDateTime() + ".html");
		
		report.attachReporter(spark);
		
		return report;
	}
	
	public static String getCurrentDateTime() {

		Date date = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy_hh.mm.ss.aa");

		String dateTime = dateFormat.format(date);

		return dateTime;

		// System.out.println("New date Time is: " + dateTime);

	}

}
