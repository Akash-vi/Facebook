package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAcctPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='_58mf']")
	private WebElement popPage;

	@FindBy(xpath = "//div[text()='Sign Up']")
	private WebElement popTitle;

	@FindBy(xpath = "(//div)[38]//div[2]")
	private WebElement popTitleTag;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement emailOrMobileNumber;

	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement newPassword;

	@FindBy(xpath = "((//div)[42]//div)[37]")
	private WebElement dobTabName;

	@FindBy(xpath = "//select[@id='day']")
	private WebElement dobDate;

	@FindBy(xpath = "//select[@id='month']")
	private WebElement dobMonth;

	@FindBy(xpath = "//select[@id='year']")
	private WebElement dobYear;

	@FindBy(xpath = "((//div)[42]//div)[47]")
	private WebElement genderTabName;

	@FindBy(xpath = "//input[@id='u_2_4_6R']")
	private WebElement femaleButton;

	@FindBy(xpath = "//input[@id='u_2_5_Al']")
	private WebElement maleButton;

	@FindBy(xpath = "//input[@id='u_2_6_Et']")
	private WebElement customButton;

	@FindBy(xpath = "(//div)[102]//button")
	private WebElement signUpButton;

	@FindBy(xpath = "(//a[text()='Terms'])[2]")
	private WebElement terms;

	@FindBy(xpath = "(//a[text()='Privacy Policy'])[2]")
	private WebElement privacyPolicy;

	@FindBy(xpath = "(//a[text()='Cookies Policy'])")
	private WebElement cookiesPolicy;

	@FindBy(xpath = "//img[@class='_8idr img']")
	private WebElement closeWindow;

	public CreateNewAcctPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public boolean isDisplayedFirstName() {
		return firstName.isDisplayed();
	}

	public boolean isEnabledFirstName() {
		return firstName.isEnabled();
	}

	public String sendFirstName(String user) {
		firstName.sendKeys(user);
		return user;
	}

	public String getTagFirstName() {
		return firstName.getAttribute("placeholder");
	}

	public boolean isDisplayedLastName() {
		return lastName.isDisplayed();
	}

	public boolean isEnabledLastName() {
		return lastName.isEnabled();
	}

	public String sendLastName(String user) {
		lastName.sendKeys(user);
		return user;
	}

	public String getTagLastName() {
		return lastName.getText();
	}

	public boolean isDisplayedEmailOrPhoneNumberTab() {
		return emailOrMobileNumber.isDisplayed();
	}

	public boolean isEnabledEmailOrPhoneNumberTab() {
		return emailOrMobileNumber.isEnabled();
	}

	public String sendEmailOrPhone(String user) {
		emailOrMobileNumber.sendKeys(user);
		return user;
	}

	public String getTagEmailOrPhone() {
		return emailOrMobileNumber.getText();
	}

	public boolean isDisplayedNewPassword() {
		return newPassword.isDisplayed();
	}

	public boolean isEnabledNewPassword() {
		return newPassword.isEnabled();
	}

	public String newPassword(String user) {
		newPassword.sendKeys(user);
		return user;
	}

	public boolean isDisplayedDobTabName() {
		return dobTabName.isDisplayed();
	}

	public boolean isEnabledDobTabName() {
		return dobTabName.isEnabled();
	}

	public String getDobTabName() {
		return dobTabName.getText();
	}
	
	public boolean isDisplayedDobDate() {
		return dobDate.isDisplayed();
	}

	public boolean isEnabledDobDate() {
		return dobDate.isEnabled();
	}

	
	public void selectDate() {
		dobDate.click();
		Select day = new Select(dobDate);
		day.selectByIndex(8);
	}
	
	public boolean isDisplayedDobMonth() {
		return dobMonth.isDisplayed();
	}

	public boolean isEnabledDobMonth() {
		return dobMonth.isEnabled();
	}

	public void selectMonth() {
		dobMonth.click();
		Select month = new Select(dobMonth);
		month.selectByIndex(10);
	}

	public boolean isDisplayedDobYear() {
		return dobYear.isDisplayed();
	}

	public boolean isEnabledDobYear() {
		return dobYear.isEnabled();
	}
	public void selectYear() {
		dobYear.click();
		Select year = new Select(dobYear);
		year.selectByVisibleText("1997");
	}
	
	public boolean isDisplayedGenderTab() {
		return genderTabName.isDisplayed();
	}

	public boolean isEnabledGenderTab() {
		return genderTabName.isEnabled();
	}

	public String getTabGender() {
		return genderTabName.getText();
	}
	
	public boolean isDisplayedFemaleButton() {
		return femaleButton.isDisplayed();
	}

	public boolean isEnabledFemaleButton() {
		return femaleButton.isEnabled();
	}

	public void selectFemale() {
		femaleButton.click();
	}
	
	public boolean isDisplayedMaleButton() {
		return maleButton.isDisplayed();
	}

	public boolean isEnabledMaleButton() {
		return maleButton.isEnabled();
	}

	public void selectMale() {
		maleButton.click();
	}
	
	public boolean isDisplayedCustomButton() {
		return customButton.isDisplayed();
	}

	public boolean isEnabledCustomButton() {
		return customButton.isEnabled();
	}

	public void selectCustom() {
		customButton.click();
	}
	
	public boolean isDisplayedSignUpButton() {
		return signUpButton.isDisplayed();
	}

	public boolean isEnabledSignUpButton() {
		return signUpButton.isEnabled();
	}

	public String getTagSignUp() {
		return signUpButton.getText();
	}

	public void closeWindow() {
		closeWindow.click();
	}

	public void clickOnTerms() {
		terms.click();
	}

	public void clickOnPrivacyPolicy() {
		privacyPolicy.click();
	}

	public void clickOnCookiesPolicy() {
		cookiesPolicy.click();
	}

}
