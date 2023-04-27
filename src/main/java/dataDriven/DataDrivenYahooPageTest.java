package dataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import pages.YahooHomePage;
import tests.TestBase;

public class DataDrivenYahooPageTest extends TestBase{
	
//	@DataProvider
//	public void 
	
	
	 @Test(priority=1)
	 public void getAllTabDetailsOnTabItemByTextOnHomePageTest() throws InterruptedException {
	 
//System.out.println(" page title is : ");
		 
		 YahooHomePage yPage= new YahooHomePage(driver);
		 
		 //yPage.navigateToPage("https://www.yahoo.com/");
		 //getPageTitle();
		 
		 //getCurrentUrl();
		 
		 yPage.getTheListOfItemOnleftTabByText();
		 //test.addScreenCaptureFromPath(takeScreenShot(driver));
		 
		 //getMthodName();
		 //yPage.clickOnleftTabByText("Life");
		 
//		 yPage.getTheListOfItemOnleftTabByTextAndClickOnIt("Finance");
//		 
//		 getPageTitle();
//		 getCurrentUrl();
//		 test.addScreenCaptureFromPath(takeScreenShot());
	 }
	 
	 @Test(priority=2)
	 public void clickOnTabItemByTextOnHomePageTest() throws InterruptedException {
	 
//System.out.println(" page title is : "+driver.getTitle());
		
		navigateToPage("https://www.yahoo.com");
		 
		 YahooHomePage yPage= new YahooHomePage(driver);
		 
		 //yPage.navigateToPage("https://www.yahoo.com/");
		// getPageTitle();
		 
		// getCurrentUrl();
		 
		 //yPage.getTheListOfItemOnleftTabByText();
		// test.addScreenCaptureFromPath(takeScreenShot());
		 //yPage.clickOnleftTabByText("Life");
		 
		 yPage.getTheListOfItemOnleftTabByTextAndClickOnIt("Finance");
		 
		// System.out.println(" page title is : "+driver.getTitle());
		 //getPageTitle();
		// getCurrentUrl();
		 
		// System.out.println("Mthodname is : "+getMthodName(result));
		 
		 //test.addScreenCaptureFromPath(takeScreenShot());
	 }
	}

	


