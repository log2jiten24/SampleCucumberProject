package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationStepDefinitions {
	
	
	@Given("User is on Registration home dashboard page")
	public void user_is_on_registration_home_dashboard_page() {
		
	System.out.println (" User Navigates to the User Dashboard and Registration Page ") ; 	
	   
	}

	@When("User enters following details for creating package")
	public void user_enters_following_details_for_creating_package(DataTable dataTable) {
		
	 List < List <String>> userlist =  dataTable.asLists(String.class);
	 
	 for (List<String > elements : userlist) {
		 
		System.out.println ("Elements present inside list :" + elements ) ;
		
		
		 
	 }
	 
		 
	
	}

	@Then("User Package and Registration is successfull")
	public void user_package_and_registration_is_successfull() {
	   
	}
	
	@When("User enters following details for creating package having different set of columns")
	public void user_enters_following_details_for_creating_package_having_different_set_of_columns(DataTable dataTable) {
		
		List<Map<String , String >> userlists = dataTable.asMaps(String.class, String.class) ;
		
		System.out.println (userlists) ;
		
		//it will return first name from the 0th row 
		System.out.println ("firstname from 0th row :" + userlists.get(0).get("FirstName"));
		//it will return first name from the 1st row
		System.out.println ("firstname from 1st  row :"+ userlists.get(1).get("FirstName"));
		//it will return first name from the 2nd row 
		System.out.println ("firstname from 2nd row :" + userlists.get(2).get("FirstName"));
		
		for (Map<String , String> elementmap : userlists) {
			
			//to print each row from the Map 
		System.out.println ("first naame details :" + elementmap.get("FirstName"));
		System.out.println ("last name details :"   + elementmap.get("LastName")) ;
		System.out.println ("Email ID  details :"   + elementmap.get("Email ID")) ;
		System.out.println ("Mobile Number  details:"+ elementmap.get("MobileNum")) ;
		System.out.println ("City  details :"       + elementmap.get("City")) ;
		
		}
	    
	}
	

}
