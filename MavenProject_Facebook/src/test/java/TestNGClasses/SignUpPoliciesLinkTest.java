package TestNGClasses;

import java.util.ArrayList;
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

public class SignUpPoliciesLinkTest {
	
	WebDriver driver;
	ArrayList<String> url;
	
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
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.clickOnCreatNewAcct();
	}
	
	@Test (priority =1)
	public void testTerm() throws InterruptedException {
		System.out.println("testTerm");
		CreateNewAcctPage createNewAcctPage = new CreateNewAcctPage(driver);
		createNewAcctPage.clickOnTerms();
		
		url = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(url.get(1));
		
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(1200);
		String actualTitle = driver.getTitle();
		String expectedUrl = "https://www.facebook.com/legal/terms/update";
		String expectedTitle = "Facebook";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Test 1 terms URL Pass");
		}
		else {
			System.out.println("Test 1 terms URL Fail");
		}

		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test 1 terms Title Pass");
		}
		else {
			System.out.println("Test 1 terms Title Fail");
		}
		
	}
	
	@Test (priority =2)
	public void testPrivacyPolicy() throws InterruptedException {
		System.out.println("testPrivacyPolicy");
		CreateNewAcctPage createNewAcctPage = new CreateNewAcctPage(driver);
		createNewAcctPage.clickOnPrivacyPolicy();
		
		url = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(url.get(1));
		
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(1200);
		String actualTitle = driver.getTitle();
		String expectedUrl = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String expectedTitle = "Meta Privacy Policy – How Meta collects and uses user data | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Test 2 PrivacyPolicy URL Pass");
		}
		else {
			System.out.println("Test 2 PrivacyPolicy URL Fail");
		}
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test 2 Privacy Polciy Title Pass");
		}
		else {
			System.out.println("Test 2 Privacy Policy Title Fail");
		}
		System.out.println(actualTitle);
	}
	
	@Test (priority =3)
	public void testCookiesPolicy() throws InterruptedException {
		System.out.println("testCookiesPolicy");
		CreateNewAcctPage createNewAcctPage = new CreateNewAcctPage(driver);
		createNewAcctPage.clickOnCookiesPolicy();
		
		url = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(url.get(1));
		
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(1200);
		String actualTitle = driver.getTitle();
		String expectedUrl = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
		String expectedTitle = "Meta Cookies Policy | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Test 3 CookiesPolicy URL Pass");
		}
		else {
			System.out.println("Test 3 CookiesPolicy URL Fail");
		}
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test 4 CookiesPolicy Title Pass");
		}
		else {
			System.out.println("Test 4   CookiesPolicy Title Fail");
		}
		System.out.println(actualTitle);
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		driver.close();
		url = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(url.get(0));
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
		driver.quit();
		
	}

}
