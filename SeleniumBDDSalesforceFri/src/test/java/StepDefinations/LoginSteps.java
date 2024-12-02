package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.WebDriver;

public class LoginSteps {


	LoginPage loginPage=new LoginPage(WebDriver.getDriver());
	
	
	@Given("User navigates to Salesforce Login Page")
	public void user_navigates_to_salesforce_login_page() {
	    WebDriver.getDriver().get("https://login.salesforce.com");
	}
	@When("User logs in with valid credentials")
	public void user_logs_in_with_valid_credentials() {
	    loginPage.login("azarriju88-vd7d@force.com", "Azar~!@#4");
	}
	
}
