package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BenficoStartPage {
	
	
WebDriver driver;
	
	public BenficoStartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}	
	
	@FindBy(how = How.XPATH, using ="//a[text()='Get Started']")
	private WebElement btnStarted;
	
	public SignupPage clickStart() {
		
		btnStarted.click();
		
				
		
		return new SignupPage(driver);
		
	}
	
	

}
