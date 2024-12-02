package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(id="username")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="Login")
	private WebElement LoginButton;
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}
	
	public void login(String username,String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		LoginButton.click();
	}
}
