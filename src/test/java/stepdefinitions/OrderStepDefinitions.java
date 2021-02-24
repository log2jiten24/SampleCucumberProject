package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDefinitions {
	
	
	@Given("a registered user exists and logins")
	public void a_registered_user_exists_and_logins() {
	    
		
	}

	@When("User Navigates to the Home Page")
	public void user_navigates_to_the_home_page() {
	   
	}

	@Then("^User Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String Username, String Password) {
		
	System.out.println ("Amazon username and Password :" + Username + " " + Password);	
	   
	}

	@Then("User Clicks on Login Button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("User Navigates to the Order page")
	public void user_navigates_to_the_order_page() {
	   
	}

	@When("User Clicks on Order Link")
	public void user_clicks_on_order_link() {
	 
	}

	@Then("User Clicks on Previous Order Details")
	public void user_clicks_on_previous_order_details() {
	    
	}

	@Then("User Clicks on Cancelled  Order Details")
	public void user_clicks_on_cancelled_order_details() {
	   
	}

	@Then("User Clicks on Open  Order Details")
	public void user_clicks_on_open_order_details() {
	    
	}


}
