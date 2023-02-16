package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	//Variable -- private -WebElement
	
		@FindBy (xpath="//input[@id='email']")
		private WebElement userName;
		
		@FindBy (xpath="//input[@id='pass']")
		private WebElement password;
		
		@FindBy (xpath="//button[text()='Log in']")
		private WebElement loginButton;
		
		@FindBy (xpath="//a[text()='Forgotten password?']")
		private WebElement forgetButton;
		
		@FindBy (xpath="//a[text()='Create new account']")
		private WebElement creatNewAcct;
		
		@FindBy (xpath="//h2[@class='_8eso']")
		private WebElement tagLine;
		
		//Constructor -- public, - WebEelement initialization (FindBy)
		public LoginOrSignUpPage(WebDriver driver) {
//			PageFactory.initElements(driver, this);
			PageFactory.initElements(driver, this);
		}
		
		//Methods -- public -- WebElement Actions
		
		public void sendUserName() {
			userName.sendKeys("akashkumarvisg@gmail.com");
		} 
		
		public String getUserNameTag() {
			String attribute = userName.getAttribute("placeholder");
			return attribute;
		}
		
		public String getTagName() {
			String tagName = tagLine.getText();
			return tagName;
		}
		
		
		public void sendPassword() {
			password.sendKeys("asestantakash");
		}
		public String getPasswordTag() {
			String actualPasswordTag = password.getAttribute("placeholder");
			return actualPasswordTag;
		}
		
		public void clickOnLoginButton() {
			loginButton.click();
		}
		public String getLoginButtonTag() {
//			String attribute =loginButton.getAttribute("");
//			return attribute;
			//or
			return loginButton.getText();
		}
		
		public void clickOnForgetButton() {
			forgetButton.click();
		}
		public String getForgetButtonTag() {
			return forgetButton.getText();
		}
		
		
		public void clickOnCreatNewAcct() {
			creatNewAcct.click();
		}
		
		public String getCreatNewAcctTag() {
			return creatNewAcct.getText();
		}
		
		public boolean isEnabledUserName() {
			return userName.isEnabled();
		}
		
		public boolean isEnabledPassword() {
			return password.isEnabled();
		}
		
		public boolean isEnabledLogIn() {
			return loginButton.isEnabled();
		}
		
		public boolean isEnabledCreateNewAcc() {
			return creatNewAcct.isEnabled();
		}
		
	

}
