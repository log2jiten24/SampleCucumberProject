package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Standard_StepDefinitions {
	
	@Given("User navigates to the Amazon Login Page")
	public void user_navigates_to_the_amazon_login_page() {
	    
	}

	@Given("Sign in Button is present on the Amazon Login Page")
	public void sign_in_button_is_present_on_the_amazon_login_page() {
	    
	}

	@When("User Clicks on the Amazon Login Button")
	public void user_clicks_on_the_amazon_login_button() {
	   
	}

	@Then("User is Displayed on the Login  Page")
	public void user_is_displayed_on_the_login_page() {
	    
	}

	@When("User enters {string} at the Username field")
	public void user_enters_at_the_username_field(String string) {
	   
	}

	@When("User enters {string} in the Password Field")
	public void user_enters_in_the_password_field(String string) {
	   
	}

	@When("User Clicks on the SignIn Button from the Amazon LoginPage")
	public void user_clicks_on_the_sign_in_button_from_the_amazon_login_page() {
	   
	}

	@Then("User Navigates to the Dashbard Page")
	public void user_navigates_to_the_dashbard_page() {
	    
	}

	@Then("User verifies the Title of the Page as {string}")
	public void user_verifies_the_title_of_the_page_as(String string) {
	   
	}

	@Then("Order Button is not Present on the Dashboard Page")
	public void order_button_is_not_present_on_the_dashboard_page() {
	
	}
	
	@Given("User is on the Amazon Page")
	public void user_is_on_the_amazon_page() {
	    
	}

	@When("User Scrolls down the Footer of the Page")
	public void user_scrolls_down_the_footer_of_the_page() {
	    
	}

	@Then("User Gets all the Country Links")
	public void user_gets_all_the_country_links(io.cucumber.datatable.DataTable dataTable) {
	   
		
		List<List<String>> countrylist = 	dataTable.asLists();
		
		 for (List<String > elements : countrylist) {
			 
				System.out.println ("Elements present inside list :" + elements ) ;	 
			 }
		
	}

	@Then("User gets all Amazon Services Links")
	public void user_gets_all_amazon_services_links(io.cucumber.datatable.DataTable dataTable) {
	   
		List<List<String>> ServicesLink  = 	dataTable.asLists();
		
		 for (List<String > Webservices : ServicesLink) {
			 
				System.out.println ("Elements present inside list :" + Webservices ) ;	 
			 }
	}

	@Then("User gets all the Privacy Links")
	public void user_gets_all_the_privacy_links(io.cucumber.datatable.DataTable dataTable) {
	    
		List<List<String>> PrivacyLink  = 	dataTable.asLists();
		
		 for (List<String > Privacyservices : PrivacyLink) {
			 
				System.out.println ("Elements present inside list :" + Privacyservices ) ;	 
			 }
	}



}
