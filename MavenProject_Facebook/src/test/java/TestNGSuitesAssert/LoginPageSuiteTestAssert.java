package TestNGSuitesAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PomClasses.CreateNewAcctPage;
import PomClasses.LoginOrSignUpPage;


public class LoginPageSuiteTestAssert {
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private CreateNewAcctPage createNewAcctPage;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void beforeClass(String browserName) {
		System.out.println("before Test");
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Akash\\Carrier\\Velocity\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\Akash\\Carrier\\Velocity\\Software\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		if(browserName.equals("MicroSoftEdge")) {
			System.setProperty("webdriver.edge.driver", "G:\\Akash\\Carrier\\Velocity\\Software\\msedgedriver.exe");
			driver = new EdgeDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("before method");
		driver.navigate().to("https://www.facebook.com");
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
	}
	@Test	(priority = 12)
	public void title() {
		System.out.println("Test PageTitle");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
//		if (expectedTitle.equals(actualTitle)) {
//			System.out.println("TestCase 1 : Title test case pass");
//		}
//		else {
//			System.out.println("TestCase 1 : Tile test case fail");
//		}
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test	(priority = 13)
	public void url(){
		System.out.println("Test URL");
		String expectedMainURL = "https://www.facebook.com/";
		String actualMainURL = driver.getCurrentUrl();
//		if(expectedMainURL.equals(actualMainURL)) {
//			System.out.println("TestCase 2 : MAIN URL test case Pass");
//		}
//		else {
//			System.out.println("TestCase 2 : MAIN URL test case Fail");
//		}
		Assert.assertEquals(actualMainURL, expectedMainURL);
	}
	
	@Test	(priority = 14)
	public void tagName() {
		System.out.println("Test Tag Name");
		String expectedTagLine = "Facebook helps you connect "
				+ "and share with the people in your life.";
		String actualTagLine = loginOrSignUpPage.getTagName();
//		if(expectedTagLine.equals(actualTagLine)) {
//			System.out.println("TestCase 3 : Main Page TAG Line PASS");
//		}
//		else {
//			System.out.println("TestCase 3 : Main Page TAG Line FAIL");
//		}
		Assert.assertEquals(actualTagLine, expectedTagLine);
	}
	@Test	(priority = 15)
	public void userNameTab() throws InterruptedException {
		System.out.println("Test Tag Name");
		String expectedUserNameTag = "Email address or phone number";
		String actualUserNameTag =loginOrSignUpPage.getUserNameTag();
//		if(expectedUserNameTag.equals(actualUserNameTag)) {
//			System.out.println("TestCase 4 : userNameTag PASS");
//		}
//		else {
//			System.out.println("TestCase 4 : userNameTag PASS");
//		}
		Assert.assertEquals(actualUserNameTag, expectedUserNameTag);
		
//		loginOrSignUpPage.isEnabledUserName();
//		Thread.sleep(1200);
//		System.out.println("user name tab clickable");
		Assert.assertTrue(loginOrSignUpPage.isEnabledUserName());
	}
	@Test (priority = 16)
	public void passwordTab() throws InterruptedException {
		System.out.println("Test Tag Name");
		String expectedPasswordTag = "Password";
		String actualPasswordTag = loginOrSignUpPage.getPasswordTag(); 
//		if(expectedPasswordTag.equals(loginOrSignUpPage.getPasswordTag())) {
//			System.out.println("TestCase 5 : Password Tag PASS");
//		}
//		else {
//			System.out.println("TestCase 5 : Passoword Tag Fail");
//		}
		Assert.assertEquals(actualPasswordTag, expectedPasswordTag);
		
//		loginOrSignUpPage.sendPassword();
//		Thread.sleep(1200);
//		System.out.println("TestCase 5 : Password Tab clickAble");
		Assert.assertTrue(loginOrSignUpPage.isEnabledPassword());
		
	}
	@Test	(priority = 17)
	public void loginButton() throws InterruptedException {
		System.out.println("Test Login Button");
		String expectedTag = "Log in";
		String actualTag = loginOrSignUpPage.getLoginButtonTag();
//		if(expectedTag.equals(loginOrSignUpPage.getLoginButtonTag())){
//			System.out.println("TestCase 6 : Login tag Pass");
//		}
//		else {
//			System.out.println("TestCase 6 : Login tag FAIL");
//		}
		Assert.assertEquals(actualTag, expectedTag);
		
//		loginOrSignUpPage.clickOnLoginButton();
//		loginOrSignUpPage.clickOnCreatNewAcct();
//		createNewAcctPage = new CreateNewAcctPage(driver);
//		createNewAcctPage.closeWindow();
		Assert.assertTrue(loginOrSignUpPage.isEnabledLogIn());
	}
	
	@Test	(priority = 18)
	public void createNewAcct() throws InterruptedException {
		System.out.println("Test create new account Button");
		String expectedTag = "Create new account";
		String actualTag =loginOrSignUpPage.getCreatNewAcctTag();
//		if(expectedTag.equals(loginOrSignUpPage.getCreatNewAcctTag())) {
//			System.out.println("TestCase 7 : Test Create New Account Tag PASS");
//		}
//		else {
//			System.out.println("TestCase 7 : Test Create New Account Tag FAIL");
//		}
		Assert.assertEquals(actualTag, expectedTag);
		
//		loginOrSignUpPage.clickOnCreatNewAcct();
//		Thread.sleep(1200);
//		System.out.println("Create new account pop PASS");
//		createNewAcctPage.closeWindow();
		Assert.assertTrue(loginOrSignUpPage.isEnabledCreateNewAcc());
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
		
		driver.quit();
	}
	



}
