package StepDefinations;

import io.cucumber.java.en.When;
import pages.AccountPage;
import utils.WebDriver;

public class AccountSteps {

	AccountPage accountPage=new AccountPage(WebDriver.getDriver());
	
	@When("User creates a new account record with name {string}")
	public void user_creates_a_new_account_record_with_name(String AzarTest) {
	    accountPage.createNewAccount(AzarTest);
	}
}
