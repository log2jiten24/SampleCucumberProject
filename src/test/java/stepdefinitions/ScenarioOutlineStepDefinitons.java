package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStepDefinitons {
	
	
	
	double billing_amount ;
	double TaxAmount ;
	double FinalAmount ;
	
	
	@Given("User is on the Application Page")
	public void user_is_on_the_application_page() {
	    
	}

	@When("User Clicks on the SignIn Button")
	public void User_SignInButton () {
	    
	}

	@Then("User is displayed with login Screen")
	public void user_is_displayed_with_login_screen() {
	    
	}

	@When("User Enters {string} in the Username field")
	public void user_enters_in_the_username_field(String string) {
	    
	}

	@When("User Enters {string} in the Password field")
	public void user_enters_in_the_password_field(String string) {
	    
	}

	@When("User Clicks on the Sign In Button")
	public void user_clicks_on_the_sign_in_button() {
	    
	}

	@Then("User gets Error Message while login")
	public void user_gets_error_message_while_login() {
	   
	}
	
	@Given("User is on the billing page")
	public void user_is_on_the_billing_page() {
	    
	}

	@When("User Enters Billing Amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
	
	this.billing_amount =Double.parseDouble(billingAmount);	
		
	}
	
	

	@When("User Enters Tax Amount {string}")
	public void user_enters_tax_amount(String TaxAmount ) {
		
	this.TaxAmount = Double.parseDouble(TaxAmount);	

	}
	
	

	@When("User Clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	 
	}

	@Then("User gets the Calculated Final Bill Amount {string}")
	public void user_gets_the_calculated_final_bill_amount(String Final_Amount) {
	
	this.FinalAmount = this.billing_amount + this.TaxAmount;
	System.out.println ("expected final amount :" + Double.parseDouble(Final_Amount));
	System.out.println ("actual final amount :" + FinalAmount) ;
	
	
	//add Assertion
	Assert.assertTrue(this.FinalAmount == Double.parseDouble(Final_Amount));
	}

	

}
