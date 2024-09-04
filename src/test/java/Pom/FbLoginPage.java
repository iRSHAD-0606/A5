package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FbLoginPage {

	//public static void main(String[] args) {
		
	// Declaration
		
		@FindBy(id="email")
		private WebElement emailTF;
		
		@FindBy(name="pass")
		private WebElement passwordTF;
		
		@FindBy(name="login")
		private WebElement loginBTN;
		
		@FindBy(linkText="Forgotten password?")
		private WebElement forgotPWDLink;
		
		@FindBy(xpath="//a[text()='Create new account']")
		private WebElement createAccountLink;
		
		// Initialization
		
		public FbLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		// Utilization
		
		public void setEmail(String email) {
			emailTF.sendKeys(email);
		}
		
		public void setPassword(String pwd)
		{
			passwordTF.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			loginBTN.click();
			
		}
		
		public void clickForgotPWD() {
			forgotPWDLink.click();
		}
		
		public void clickCreateAccount() {
			createAccountLink.click();
		}
	}


