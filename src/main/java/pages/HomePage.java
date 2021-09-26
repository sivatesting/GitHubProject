package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}	
	
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	private WebElement txtSearchProduct;
	
	@FindBy(how=How.ID,using="nav-search-submit-button")
	private WebElement iconSearch;
	
	
	
	public HomePage searchProducts(String product) {
		//WebElement eleUserName = locateElement("username");
		
		txtSearchProduct.sendKeys(product);
		iconSearch.click();
		return this;
	}
	
	

	
	

}
