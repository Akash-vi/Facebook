package TestNGClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TempleateTestNG {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("before method");
		
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

}
