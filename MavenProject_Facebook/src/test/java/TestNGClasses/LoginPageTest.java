package TestNGClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.CreateNewAcctPage;
import PomClasses.LoginOrSignUpPage;
import utils.Utility;

public class LoginPageTest {
	
	WebDriver driver;
	LoginOrSignUpPage loginOrSignUpPage;
	CreateNewAcctPage createNewAcctPage;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
		System.setProperty("webdriver.chrome.driver", "G:\\Akash\\Carrier\\Velocity\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("before method");
		driver.navigate().to("https://www.facebook.com");
		 loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
	}
	
	@Test (priority =1)
	public void title() throws IOException  {
		System.out.println("Test PageTitle");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("TestCase 1 : Title test case pass");
		}
		else {
			System.out.println("TestCase 1 : Tile test case fail");
		}
		System.out.println(Utility.getExcelData(1,0));
		
		
	}
	@Test (priority =2)
	public void url(){
		System.out.println("Test URL");
		String expectedMainURL = "https://www.facebook.com/";
		String actualMainURL = driver.getCurrentUrl();
		if(expectedMainURL.equals(actualMainURL)) {
			System.out.println("TestCase 2 : MAIN URL test case Pass");
		}
		else {
			System.out.println("TestCase 2 : MAIN URL test case Fail");
		}
	}
	
	@Test (priority =3)
	public void tagName() {
		System.out.println("Test Tag Name");
		String expectedTagLine = "Facebook helps you connect "
				+ "and share with the people in your life.";
		String actualTagLine = loginOrSignUpPage.getTagName();
		if(expectedTagLine.equals(actualTagLine)) {
			System.out.println("TestCase 3 : Main Page TAG Line PASS");
		}
		else {
			System.out.println("TestCase 3 : Main Page TAG Line FAIL");
		}
	}
	
	@Test (priority =4)
	public void userNameTab() throws InterruptedException {
		System.out.println("Test Tag Name");
		String expectedUserNameTag = "Email address or phone number";
		String actualUserNameTag =loginOrSignUpPage.getUserNameTag();
		if(expectedUserNameTag.equals(actualUserNameTag)) {
			System.out.println("TestCase 4 : userNameTag PASS");
		}
		else {
			System.out.println("TestCase 4 : userNameTag PASS");
		}
		if(loginOrSignUpPage.isEnabledUserName()==true) {
			System.out.println("Testcase 4: UserName is Enabled");
		}
		else {
			System.out.println("Testcase 4: UserName is disabled");
		}
		loginOrSignUpPage.sendUserName();
		Thread.sleep(1200);
		System.out.println("user name tab clickable");
	}
	
	@Test (priority =5)
	public void passwordTab() throws InterruptedException {
		System.out.println("Test Tag Name");
		String expectedPasswordTag = "Password";
		if(expectedPasswordTag.equals(loginOrSignUpPage.getPasswordTag())) {
			System.out.println("TestCase 5 : Password Tag PASS");
		}
		else {
			System.out.println("TestCase 5 : Passoword Tag Fail");
		}
		if(loginOrSignUpPage.isEnabledPassword()==true) {
			System.out.println("Testcase 5: Password is Enabled");
		}
		else {
			System.out.println("Testcase 5: Password is disabled");
		}
		
		loginOrSignUpPage.sendPassword();
		Thread.sleep(1200);
		System.out.println("TestCase 5 : Password Tab clickAble");
	}
	
	@Test (priority =6)
	public void loginButton() throws InterruptedException {
		System.out.println("Test Login Button");
		String expectedTag = "Log in";
		if(expectedTag.equals(loginOrSignUpPage.getLoginButtonTag())){
			System.out.println("TestCase 6 : Login tag Pass");
		}
		else {
			System.out.println("TestCase 6 : Login tag FAIL");
		}
		if(loginOrSignUpPage.isEnabledLogIn()==true) {
			System.out.println("Testcase 6: Login is Enabled");
		}
		else {
			System.out.println("Testcase 6: Login is disabled");
		}
//		loginOrSignUpPage.clickOnLoginButton();
		loginOrSignUpPage.clickOnCreatNewAcct();
		createNewAcctPage = new CreateNewAcctPage(driver);
		createNewAcctPage.closeWindow();
	}
	@Test (priority =7)
	public void createNewAcct() throws InterruptedException {
		System.out.println("Test create new account Button");
		String expectedTag = "Create new account";
		if(expectedTag.equals(loginOrSignUpPage.getCreatNewAcctTag())) {
			System.out.println("TestCase 7 : Test Create New Account Tag PASS");
		}
		else {
			System.out.println("TestCase 7 : Test Create New Account Tag FAIL");
		}
		if(loginOrSignUpPage.isEnabledCreateNewAcc()==true) {
			System.out.println("Testcase 7: CreateNewAcc is Enabled");
		}
		else {
			System.out.println("Testcase 7: CreateNewAcc is disabled");
		}
		
		loginOrSignUpPage.clickOnCreatNewAcct();
		Thread.sleep(1200);
		System.out.println("Create new account pop PASS");
		createNewAcctPage.closeWindow();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
		driver.quit();
		createNewAcctPage = null;
		driver = null;
		loginOrSignUpPage =null;
		
		System.gc();
		
	}


}
