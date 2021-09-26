package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumLib;

public class LoginPage {
	
	WebDriver driver;
	SeleniumLib selLib;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
		selLib = new SeleniumLib(driver);
	}
	
	
	@FindBy(how=How.ID,using="nav-link-accountList-nav-line-1")
	public WebElement signIn;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	public WebElement txtMailAddress;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_password']")
	public WebElement txtPassword;
	
	
	@FindBy(how=How.ID,using="signInSubmit")
	public WebElement btnsignIn;
	
		
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	public WebElement btnContinue;
	
	
	
	//@Given ("Enter the email Address")
	public LoginPage enterEmailAddress() {
	
		//signIn.click();
		selLib.click(signIn);
		txtMailAddress.sendKeys("sirkalisiva@gmail.com");
		btnContinue.click();
		
		return this;
	}
	
	
	public LoginPage enterPassword() {
		
		
		txtPassword.sendKeys("Online@2020");
		
		
		return this;
	}
	
	
	public HomePage clickSign() {
		
		
		btnsignIn.click();
		
		return new HomePage(driver);
		
	}
	
	
	
	
	
	
	
	}
