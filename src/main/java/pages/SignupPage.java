package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumLib;


public class SignupPage {
	
	
WebDriver driver;
	SeleniumLib selLib;
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
		selLib = new SeleniumLib(driver);
	}	
	
	@FindBy(how = How.XPATH, using ="//input[@name='username']")
	private WebElement txtEmail;
	
	@FindBy(how = How.XPATH, using ="//input[@name='organization']")
	private WebElement txtOrgganization;
	
	@FindBy(how = How.XPATH, using ="//select[@name='developerType']")
	private WebElement dropdownDeveloperType;
	
	@FindBy(how = How.XPATH, using ="//input[@name='password']")
	private WebElement txtPassword;
	
	@FindBy(how = How.XPATH, using ="//button[starts-with(@class,'')")
	
	
	private WebElement btnSignup;

		
	public SignupPage enterEmailID() {
		
		txtEmail.sendKeys("siva.gkrishnan.testing@gmail.com");
		return this;
		
			
	}
	
	
public SignupPage enterOrganizationType() {
		
	txtOrgganization.sendKeys("ABC Software Company");
		return  this;
		
			
	}
	

public SignupPage selectDeveloperType() {
	WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(dropdownDeveloperType));
	Select developerType = new Select(dropdownDeveloperType);
		developerType.selectByVisibleText("External developer");
		return this;
		
			
	}

public SignupPage enterPassword() {
	
	txtPassword.sendKeys("Testing@123");
	
	txtPassword.sendKeys(Keys.TAB);
		return  this;
		
			
	}



public void clickSignup() throws Exception {
	

	
	Thread.sleep(4000);
	btnSignup.click();
		
			
	}





}
