package cucumberhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {
	
	
	
	@Before("@Smoke")
	public void setup_launchBrowswer(Scenario sc) {
	
	System.out.println ("Launch Chrome Browser ");
	//to print the scenario name 
	System.out.println("Scenario name : " + sc.getName());
	
	//write exception scenario 
	//int i = 9/0;
	}
	
	@After("@Smoke")
	public void teardown () {
	
	System.out.println ("Close the Browser ");	
		
	}
	
	
//	@Before(order = 1)
//	public void setup_launchBrowswer(Scenario sc) {
//	
//	System.out.println ("Launch Chrome Browser ");
//	//to print the scenario name 
//	System.out.println("Scenario name : " + sc.getName());
//	}
//	
//	@Before(order = 2)
//	public void launch_application() {
//		
//	System.out.println ("launch the URL : ");	
//	}
//	
//	
//	@After(order = 1)
//	public void teardown () {
//	
//	System.out.println ("Close the Browser ");	
//		
//	}
//	
//	@After(order = 2)
//	public void closeApplication () {
//		
//	System.out.println ("Close the Application ");	
//	}
//	
//	@BeforeStep
//	public void takesScreenshot () {
//		
//	System.out.println ("takes Screenshot before each step");	
//	}
//
//	@AfterStep
//	public void refreshPage() {
//		
//	System.out.println ("Page is refreshed :");	
//	}
	
	
}
