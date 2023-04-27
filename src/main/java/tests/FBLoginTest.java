//package tests;
//
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import pages.FbLoginPage2;
//
//
//
//public class FBLoginTest extends TestBase{
//	 
//	 @Test
//	 public void init() throws Exception{
//	 
//	 //driver.get("https://www.facebook.com");
//	 //FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
//	 
//	 FbLoginPage2 loginpage = new FbLoginPage2(driver);
//	 loginpage.setEmail("siyamzaman@gmail.com");
//	 loginpage.setPassword("12kkkii");
//	 loginpage.clickOnLoginButton();
//	 
//	 FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
//	 homepage.clickOnProfileDropdown();
//	 homepage.verifyLoggedInUserNameText();
//	 homepage.clickOnLogoutLink(); 
//	 }
//	 
//	}
//	//Step 4: Creating testng.xml file
//	
//
//
