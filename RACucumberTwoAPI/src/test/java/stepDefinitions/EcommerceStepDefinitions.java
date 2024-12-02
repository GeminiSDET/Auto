package stepDefinitions;

import io.cucumber.java.en.Given;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductPage;
/*
 * 1. https://rahulshettyacademy.com/api/ecom/auth/login
2. https://rahulshettyacademy.com/api/ecom/product/add-product

Write a Rest Assured simple Cucumber framework using POM using Java including JUnit for Assertion 
Include Test Runner 
Execute the complete end to end scenerios
 */
public class EcommerceStepDefinitions {
	
	private String authToken;
	private String productID;

	@Given("I log in with valid credentials")
	public void i_log_in_with_valid_credentials() {
	   LoginPage loginPage =new LoginPage();
	   authToken=loginPage.login("azarriju88@gmail.com", "Azar~!@#4");
	 assertNotNull("Login failed:Token is invalied",authToken);
	}
	@When("I add a new product")
	public void i_add_a_new_product() {
		ProductPage productPage =new ProductPage(authToken);
		productPage.addProduct("Laptop", "Electronics", "1500", "5");
       assertNotNull("Product addition failed: Product ID is null", productID);

	}
	@Then("the product should be added successfully")
	public void the_product_should_be_added_successfully() {
       assertNotNull("Product addition validation failed", productID);
 
	}
}
