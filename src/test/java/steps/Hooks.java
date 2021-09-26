package steps;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Base;

public class Hooks {
	Base base ;
		
	@Before
	public void before(Scenario sc) {
	base = new Base();
	 base.startup();
	
	}
	
	@After
	public void after(Scenario sc) {
		base.end();
	}
	
	
	
	
	
	
	
	
	
}
