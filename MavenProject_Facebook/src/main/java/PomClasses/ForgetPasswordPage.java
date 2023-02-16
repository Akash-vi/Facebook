package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {

	@FindBy (xpath="(//input[@name='email'])[2]")
	private WebElement userName;
	
	@FindBy (xpath="(//h2[text()='Find Your Account'])[2]")
	private WebElement header;
	
	@FindBy (xpath="//button[text()='Search']")
	private WebElement search;
	
	@FindBy (xpath="//a[text()='Cancel']")
	private WebElement cancel;
	
	@FindBy (xpath="//div[@class='_9nq2 marginBottom16px']")
	private WebElement pageTag;
	
	@FindBy (xpath="//div[@class='pam uiBoxRed']")
	private WebElement errorMessage;
	
	public ForgetPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getTabTitle() {
		return header.getText();
	}
	
	public boolean isEnabledUserNameTab() {
		return userName.isEnabled();
		
	}

	public void sendUserName(String user) {
		userName.sendKeys(user);
	}
	
	public String getUserNameTag() {
		
		return userName.getAttribute("placeholder");
	}
	
	public String getForgetPageTag() {
		String text =pageTag.getText();
		return text;
	}
	
	public boolean isEnabledSearchButton() {
		return search.isEnabled();
	}
	
	public String getTextSearch() {
		return search.getText();
	}
	public void clickOnSearch() {
		search.click();
	}
	
	public void clickOnCancel() {
		cancel.click();
	}

	public boolean isEnabledCancelkButton() {
		return cancel.isEnabled();
		
	}
	
	public boolean isDisplayedError() {
		return errorMessage.isDisplayed();
		
	}
	
	

	
}
