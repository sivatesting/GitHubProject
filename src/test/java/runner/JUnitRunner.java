package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith (Cucumber.class) 
@CucumberOptions(features = {"./src/test/java/Feature/Banifco.feature"}, glue = {"steps"}, 
 
		 plugin = {
					"html:target/cucumber-reports/cucumbertestreport",
					"json:target/cucumber.json"	,
					"junit:target/cucumber-reports/Cucumber.xml",
					"pretty"
				
			},
		 tags = {"@GetStarted"},
				 monochrome=true,
		 dryRun=false)

public class JUnitRunner { 
	 
	 
}
