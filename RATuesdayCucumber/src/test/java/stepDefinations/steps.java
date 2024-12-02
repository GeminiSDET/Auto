package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import pages.Login;


public class steps {

	private String token;
	
	
	@Given("the user logs in with {string} and {string}")
	public void the_user_logs_in_with_and(String email, String password) {
	    Login loginPage=new Login();
	    token=loginPage.login(email, password);
	    assertNotNull(token,"Login failed,token is null");
	}
	@When("the user adds a product with name {string}, category {string}, price {string}")
	public void the_user_adds_a_product_with_name_category_price(String name, String category, String price) {
	    Product productPage=new Product(token);
        productPage.addProduct(name, category, price);
	}
	@Then("the product is successfully added")
	public void the_product_is_successfully_added() {
	   Product productPage=new Product(token);
	   assertTrue(productPage.isProductAdded(),"Product addition failed");
	}
	@Then("the product details are verified")
	public void the_product_details_are_verified() {
		Product productPage = new Product(token);
        assertTrue(productPage.verifyProductDetails(), "Product details verification failed");

	}
}
