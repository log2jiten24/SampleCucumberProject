package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/featurefiles/sample.feature"} ,
		glue = {"stepdefinitions", "cucumberhooks"} ,
		plugin = {"pretty", "json:target/MyReports/report.json" , "junit:target/MyReports/report.xml"},
		tags = "@Smoke or @Regression",
		monochrome = true,
		dryRun = false
		
		
		
		)



public class TestRunner {
	
	

}
