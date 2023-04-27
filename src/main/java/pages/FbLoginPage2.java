//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//public class FbLoginPage2 {
//	
//	 WebDriver driver;
//	 
//     public FbLoginPage2(WebDriver driver){ 
//              //this.driver=driver; 
//    	 PageFactory.initElements(driver, this);
//     }
//
////Using FindBy for locating elements
//@FindBy(id="email") WebElement emailTextBox;
//@FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
//@FindBy(how=How.XPATH, using="//input[@type='submit'][@id='u_0_2']") WebElement signinButton;
//
//     // Defining all the user actions (Methods) that can be performed in the Facebook home page
//
//     // This method is to set Email in the email text box
//public void setEmail(String strEmail){
//emailTextBox.sendKeys(strEmail);
//}
//// This method is to set Password in the password text box
//public void setPassword(String strPassword){
//passwordTextBox.sendKeys(strPassword);
//}
//// This method is to click on Login Button
//public void clickOnLoginButton(){
//signinButton.click();
//} 
//}
//
//
