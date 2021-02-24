package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSearchStepDefinitions {

	@Given("User wants to select car through Uber as {string} type from uber application")
	public void user_wants_to_select_car_through_uber_as_type_from_uber_app(String cartype) {

		System.out.println("Step 1 : " + cartype);
	}

	@When("User Select cartype as {string} and pickup start point {string} and drop location {string}")
	public void user_select_cartype_as_and_pickup_start_point_and_drop_location(String cartype, String pickuploc,
			String droplocation) {

		System.out.println("Step 2 :" + cartype + " " + pickuploc + " " + droplocation);
	}

	@Then("Driver starts the Journey")
	public void driver_starts_the_journey() {

		System.out.println("Step 3 : ");

	}

	@Then("Driver ends the Journey")
	public void driver_ends_the_journey() {

		System.out.println("Step 4 ");

	}
	
	//Usage of Regular Expressions 
	@Then("^User changes the start point to \"([^\"]*)\" and pays extra charge (\\d+) INR$")
	public void user_changes_the_start_point_to_and_pays_extra_charge_inr(String string, Integer int1) {
	    
	System.out.println ("Step 5 :" + "change location :" + string + " " + int1);
	}
	
	@Then("^User changes the end point to (.*) and pays extra charge ([0-9]+) INR$")
	public void user_changes_the_end_point_to_and_pays_extra_charge_inr(String droploc, Integer pricechanged) {
	
	System.out.println ("Step 6 :" + "change location :" + droploc + " " + pricechanged);
	}
	

	@Then("User pays {int} INR")
	public void user_pays_inr(Integer price) {

		System.out.println("Step 5 : " + price);

	}
	
	

}
