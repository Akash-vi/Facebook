package TestNGSuitesAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PomClasses.CreateNewAcctPage;
import PomClasses.ForgetPasswordPage;
import PomClasses.LoginOrSignUpPage;


public class ForgetPageSuiteTestAssert {
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private CreateNewAcctPage createNewAcctPage;
	private ForgetPasswordPage forgetPasswordPage;
	
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
		driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		forgetPasswordPage = new ForgetPasswordPage(driver);
		
	}
	
	@Test	(priority = 1)	
	public void title() {
		System.out.println("Test Page Header");
		String expectedTitle = "Find Your Account";
		String actualTitle = forgetPasswordPage.getTabTitle();
//		if(expectedTitle.equals(actualTitle)) {
//			System.out.println("Test 1 Title test case pass");
//		}
//		else {
//			System.out.println("Test 1 Title test case Fail");
//		}
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test	(priority = 2)
	public void tagName() {
		System.out.println("Test Forget Page tagname");
		String expectedPageTag = "Please enter your email address or mobile number to search for your account.";
		String actualPageTag = forgetPasswordPage.getForgetPageTag();
		System.out.println(actualPageTag);
//		if(expectedPageTag.equals(actualPageTag)) {
//			System.out.println("Test 2 Page Tag test case Pass");
//		}
//		else {
//			System.out.println("Test 2 Page Tag test case Fail");
//		}
		Assert.assertEquals(actualPageTag, expectedPageTag);
		
	}
	
	@Test	(priority = 3)
	public void username(){
		System.out.println("To verify Forget Page UserName Tab is Enabled");
//		if(forgetPasswordPage.isEnabledUserNameTab()== true) {
//			System.out.println("Test 3 UserName Tab is Enabled");
//		}
//		else {
//			System.out.println("Test 3 UserName Tab is Disabled");
//		}
		Assert.assertTrue(forgetPasswordPage.isEnabledUserNameTab());
		
	}
	@Test (priority = 4)
	public void userNameTag() throws InterruptedException  {
		System.out.println("Test UserNameTag");
		String expectedTag = "Email address or mobile number";
		Thread.sleep(500);
		String actualTag = forgetPasswordPage.getUserNameTag();
		
//		if(expectedTag.equals(actualTag)) {
//			System.out.println("Test 4 UserName Tag test case Pass");
//		}
//		else {
//			System.out.println("Test 4 UserName Tag test case Fail");
//		}
		Assert.assertEquals(actualTag, expectedTag);
		
	}
	@Test (priority = 5)
	public void isEnabledSearchButton() {
		System.out.println("Test Search Button");
//		if(forgetPasswordPage.isEnabledSearchButton()== true) {
//			System.out.println("Test 5 Search button is Enabled PASS");
//		}
//		else {
//			System.out.println("Test 5 Search button is Enabled Fail");
//		}
		Assert.assertTrue(forgetPasswordPage.isEnabledSearchButton());
		
	}
	@Test (priority = 6)
	public void SearchButtonTag() {
		System.out.println("Test Seacrch Button Tag");
		String expectedTag = "Search";
		String actualTag = forgetPasswordPage.getTextSearch();
		
//		if(expectedTag.equals(actualTag)) {
//			System.out.println("Test 6 Search Tag test case Pass");
//		}
//		else {
//			System.out.println("Test 6 Search Tag test case Fail");
//		}
		Assert.assertEquals(actualTag, expectedTag);
		
	}
	@Test	(priority = 7)
	public void clickOnSearchButton() {
		System.out.println("Test search Button");
		forgetPasswordPage.clickOnSearch();
//		if(forgetPasswordPage.isDisplayedError()== true) {
//			System.out.println("Test 7 error messaged displayed and enter UserName");
//		}
//		else {
//			System.out.println("Test 7 Error Handling Fail ");
//			}
		Assert.assertTrue(forgetPasswordPage.isDisplayedError(),"Error Handling Fail");
	}
	@Test	(priority = 8)
	public void isEnabledCancelButton()  {
		System.out.println("Test click Button Enabled");
//		if(forgetPasswordPage.isEnabledCancelkButton()== true) {
//			System.out.println("Test 8 cancel button is Enabled");
//		}
//		else {
//			System.out.println("Test 8 cancel button is Disabled");
//		}
		Assert.assertTrue(forgetPasswordPage.isEnabledCancelkButton());
		
	}
	@Test	(priority = 9)
	public void clickOnCancelButton(){
		System.out.println("Test cancel button");
		String expectedLink = "https://www.facebook.com/login.php";
		forgetPasswordPage.clickOnCancel();
		String actualLink = driver.getCurrentUrl();
//		if(expectedLink.equals(actualLink)) {
//			System.out.println("Test 9 cancel button PASS");
//		}
//		else {
//			System.out.println("Test 9 cancel button Fail");
//		}
		Assert.assertEquals(actualLink, expectedLink);
		driver.navigate().forward();
	}
	@Test	(priority = 10)
	public void webPageTitle() throws InterruptedException{
		System.out.println("Test webPageTitle");
		Thread.sleep(1200);
		String expectedTitle = "Forgotten Password | Can't Log In | Facebook";
		String actualTitle = driver.getTitle();
//		if(expectedTitle.equals(actualTitle)) {
//			System.out.println("Test 10 URL Test case PASS");
//		}
//		else {
//			System.out.println("Test 10 URL Test case Fail");
//		}
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@Test	(priority = 11)
	public void webPageURl(){
		System.out.println("webPageURl");
		String expectedURL = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
		String actualURL = driver.getCurrentUrl();
//		if(expectedURL.equals(actualURL)) {
//			System.out.println("Test 11 URL Test case PASS");
//		}
//		else {
//			System.out.println("Test 11 URL Test case Fail");
//		}
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
	
	
	
	@AfterMethod
	public void afterMethod() {
		
		
		
	}
	
	
	
	@AfterTest
	public void afterClass() {
		System.out.println("after class");
		
		driver.quit();
	}
	




}
