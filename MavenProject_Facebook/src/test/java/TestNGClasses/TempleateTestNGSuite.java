package TestNGClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TempleateTestNGSuite {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Before method");
		
	}
	
	@Test (priority =1)
	public void title() {
		System.out.println("Test");
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
		
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	
	}
	

}
