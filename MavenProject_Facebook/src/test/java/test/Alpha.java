package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomClasses.LoginOrSignUpPage;


public class Alpha {
	
	@BeforeTest
	public void beforeClass() {
		System.out.println("before Test");
		
		 
	}

	
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("before method");
		
		
	}
	
	@Test
	public void title() {
		System.out.println("AlphaTest1");
		
		
	}
	
	@Test
	public void url(){
		System.out.println("AlphaTest2");
		
	}
	@Test
	public void tagName() {
		System.out.println("AlphaTest3");
		
	}
	@Test
	public void userNameTab(){
		System.out.println("AlphaTest4");
		
	}
	@Test
	public void passwordTab()  {
		System.out.println("AlphaTest5");
		
	}
	@Test
	public void loginButton()  {
		System.out.println("AlphaTest6");
		
	}
	@Test
	public void createNewAcct()  {
		System.out.println("AlphaTest7");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
		
	}
}
