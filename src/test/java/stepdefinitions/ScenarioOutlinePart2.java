package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioOutlinePart2 {
	
	
	@Given("User Navigates to the Dashboard esign Page")
	public void user_navigates_to_the_logoin_dashboard_page() {
	 
	}

	@When("^User logins Credentails \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_credentails_and(String Username, String Password) {
		
	System.out.println ("Username and Password details :" + Username + " " + Password );	
	    
	}

	@When("User Clicks on the Login Button")
	public void user_clicks_on_the_login_button() {
		
	System.out.println ("Step 3 : Login Button");    
	}

	@When("User Navigates to the Dashboard Page")
	public void user_navigates_to_the_dashboard_page() {
	
	System.out.println ("User Navigates to the Dashboard Page :");	
	    
	}

	@Given("User clicks on the Workflow button for CSH Tenant")
	public void user_clicks_on_the_workflow_button_for_csh_tenant() {
		
    System.out.println ("User navigates to the CSH Tenant Workflow ");	
	   
	}

	@When("User Enters Borrower Details {string} and {string}")
	public void user_enters_borrower_details_and(String firstname, String lastname) {
	
	System.out.println ("User enters the Firstname and LastName + " + firstname + " " + lastname);	
	}

	@When("User Enters details {string} and {string}")
	public void user_enters_details_and(String EmailID , String MobileNumber ) {
		
	System.out.println ("User enters Email ID and Mobile Number :"  + EmailID + " " + MobileNumber);	
	    
	}

	@When("User Clicks on the Create Button")
	public void user_clicks_on_the_create_button() {
	
	System.out.println ("User clicks on the Create Button ");	
	}

	@Given("User clicks on the Workflow button for BOM Servicing  Tenant")
	public void user_clicks_on_the_workflow_button_for_bom_servicing_tenant() {
	
	System.out.println ("User Clciks on the BOM Servicing Tenant Workflow ");	
	}

}
