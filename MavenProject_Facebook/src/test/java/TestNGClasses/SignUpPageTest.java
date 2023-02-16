package TestNGClasses;

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

public class SignUpPageTest {
	
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
		System.out.println("before method");
		driver.navigate().to("https://www.facebook.com");
		 loginOrSignUpPage = new LoginOrSignUpPage(driver);
		 loginOrSignUpPage.clickOnCreatNewAcct();
		 createNewAcctPage = new CreateNewAcctPage(driver);
		
	}
	
	@Test (priority =1)
	public void title() {
		System.out.println("Test");
		createNewAcctPage.clickOnCookiesPolicy();
		
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.quit();
	}


}
