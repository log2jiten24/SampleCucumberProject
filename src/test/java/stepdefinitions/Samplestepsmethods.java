package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaimplementation.Product;
import javaimplementation.Search;
import junit.framework.Assert;

public class Samplestepsmethods {
	
	Product product ;
	Search search ;
	
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    
	System.out.println ("step 1 : search page on amazon")	;
	}

	@When("I search a product name {string} and price {int}")
	public void i_search_a_product_name_and_price(String productname, Integer price) {
		
    System.out.println ("step 2 : search product on amazon :" 
    
   + productname + "price name: " + price)	;	
    
    product = new Product(productname , price);
	  
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productname) {
	 
     System.out.println ("step 3 : product name displayed");	
	
     search = new Search();
     
     String name_product = search.displayProduct(product);
     System.out.println ("Name of the product list is : " + name_product);
     
     Assert.assertEquals(product.getProductname(), name_product);
     
    }
	
}