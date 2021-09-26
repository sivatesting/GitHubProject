package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/java/Feature/Amazon.feature"},
		glue = {"steps"},
		tags = {"@scenarioTag1"},
		plugin = {
				"html:target/cucumber-reports/cucumbertestreport",
				"json:target/cucumber.json"			
		},
		dryRun = false,
		monochrome=true,
		strict = true
		
		
	)

@Test
public class RunnerTest {
 
}
