package steps;

//import io.cucumber.java.en.Given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.BenficoStartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utils.Base;


public class Steps {
	
	HomePage homePage;
	SignupPage signupPage;

	
	@Given("Login into amazon site")
	public void loginAmazonSite() {
			LoginPage login = new LoginPage(Base.driver);
			
			login.enterEmailAddress();
			login.enterPassword();
			homePage=login.clickSign();
		
	}
	
	@Given("Get input from User to search products (.*)")
	public void searchProducts(String product) {
			
		homePage.searchProducts(product);
		
	}
	
	@Given("Prvoide Signup User Details")
	public void signup() throws Exception {
		
			BenficoStartPage sign = new BenficoStartPage(Base.driver);
			signupPage =	sign.clickStart();
			signupPage.enterEmailID();
			signupPage.enterOrganizationType();
			signupPage.selectDeveloperType();
			signupPage.enterPassword();
			signupPage.clickSignup();
			
			
		
	}
	
	
	@Then("Validate signup is completed successfully")
	public void validateSignup() {
			
		//assertEquals(false, false);
	}
	
	    
	
	
	
	
	}



