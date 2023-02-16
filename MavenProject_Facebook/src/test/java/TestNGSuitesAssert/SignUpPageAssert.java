package TestNGSuitesAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomClasses.CreateNewAcctPage;
import PomClasses.LoginOrSignUpPage;
import browser.Browser;

public class SignUpPageAssert {
	
	
	private WebDriver driver;
	private CreateNewAcctPage createNewAcctPage;
	private LoginOrSignUpPage loginOrSignUpPage;

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browserName) {
		System.out.println("Before Test : Browser Opened");
		
		if (browserName.equals("Chrome")) {
			driver = Browser.openChromeBrowser();
		}
		
		if (browserName.equals("Firefox")) {
			Browser.openFirefoxBrowser();
		}
		
		if (browserName.equals("MicroSoftEdge")) {
			Browser.openMicroSoftEdgeBrowser();
		}
		
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
		createNewAcctPage = new CreateNewAcctPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
		driver.get("https://www.facebook.com");
		loginOrSignUpPage.clickOnCreatNewAcct();

	}

	@Test(priority = 1)
	public void validateFirstNameTab() {
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(createNewAcctPage.isDisplayedFirstName(),"Not Displayed");
		soft.assertTrue(createNewAcctPage.isEnabledFirstName(),"Not Enabled");
		
		soft.assertEquals(createNewAcctPage.getTagFirstName(), "First name", "validation failed");
		createNewAcctPage.sendFirstName("Akash");
		
		
		
		soft.assertAll();
	}
	
	

	@AfterMethod
	public void afterMethod() {
	

	}


	@AfterTest
	public void aftertest() {
		driver.quit();
	}


}
