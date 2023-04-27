package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class YahooHomePage2 
//extends TestBase 
{
	
	public WebDriver driver;
	
	//public WebDriverWait wait;
	
	
	ExtentTest test;
	
	//WebDriverLibrary wbLib= new WebDriverLibrary(); 
	 
   // public YahooHomePage(WebDriver driver){ 
    	public YahooHomePage2(WebDriver driver){ 
      
    	
    	PageFactory.initElements(driver, this);
    	
    
    }

    //Using FindBy for locating elements
@FindBy(xpath="//div[text()='Account Settings']") 
WebElement profileDropdown;

@FindBy(xpath="//text()[.='Log Out']/ancestor::span[1]") 

WebElement logoutLink;

@FindBy(xpath="//a[contains(@id,'root_')]") 
WebElement loggedInUserNameText;

@FindBy(xpath="//a[contains(@id,'root_')]") 
List<WebElement> allTabOnleftHomePageByText;

    


public List<WebElement> getAllTabOnleftHomePageByText() {
	return allTabOnleftHomePageByText;
}

public void clickOnleftTabByText(String tabTextToClick) throws InterruptedException{
	
	//Thread.sleep(10000);
	
	for(WebElement ele:getAllTabOnleftHomePageByText()) {
		
		if(ele.getText().contains(tabTextToClick)) {
			
			ele.click();
			
			break;
		}
		
	}

}

public void getTheListOfItemOnleftTabByText(){
	
	//wait =new WebDriverWait(driver,20);
	
	
	//wait.pollingEvery(2, TimeUnit.SECONDS);
	
	//wait.until(ExpectedConditions.elementToBeSelected(getAllTabOnleftHomePageByText().get(0)));
	
	List<String> allTabTextasArray= new ArrayList<String>();
	
	for(WebElement ele:getAllTabOnleftHomePageByText()) {
		
	
		
		allTabTextasArray.add(ele.getText());
		
		
		
		//System.out.println(allTabTextasArray+" #### as Array.. ##### "); 
		//put syso here to print 1+2+3+4 style
	}
	
	System.out.println(allTabTextasArray+" #### as Array.. ##### ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		//test.addScreenCaptureFromPath(takeScreenShot());
		}
	
	
	
	
	
public void getTheListOfItemOnleftTabByTextAndClickOnIt(String menuItemToClick){
	
	
	
	//List<WebElement> allTabElement=getAllTabOnleftHomePageByText();
	
	//List<String> allTabTextasArray= new ArrayList<String>();
	//this.driver=driver;
	//wbLib.waitForListOfWebElemnt(driver,allTabOnleftHomePageByText);
	//wbLib.waitForWebElemnt(driver,allTabElement.get(0));
	
	for(WebElement ele:getAllTabOnleftHomePageByText()) {
		//allTabTextasArray.add(ele.getText());
		
		//System.out.println("List of Tab Item: "+ allTabTextasArray);
		
	}
	
	//for(WebElement ele:allTabElement) {
		
		for(WebElement ele:getAllTabOnleftHomePageByText()) {		
		
		
		if(ele.getText().contains(menuItemToClick)) {
			
			//allTabTextasArray.add(ele.getText());
			
			ele.click();
			
			break;
		}
		//System.out.println(allTabTextasArray+" #### as Array.. ##### "); put syso here to print 1+2+3+4 style
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		}
	
	//System.out.println(allTabTextasArray+" #### as Array.. ##### ");
	
	// test.addScreenCaptureFromPath(TestBase.takeScreenShot());
		
	}
	
	

// Defining all the user actions (Methods) that can be performed in the Facebook home page

    // This method to click on Profile Dropdown
public void navigateToPage(String pageUrl){
driver.get(pageUrl);
}


public void clickOnProfileDropdown(){
profileDropdown.click();
}
// This method to click on Logout link
public void clickOnLogoutLink(){
logoutLink.click();
}
// This method to verify LoggedIn Username Text
public String verifyLoggedInUserNameText(){
String userName = loggedInUserNameText.getText();
return userName;
}




}


