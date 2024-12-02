package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By usernameField = By.id("");
	By passwordField = By.id("");
	By loginButton = By.id("");
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public void login (String username,String password) {
		driver.findElement(usernameField).sendKeys(null);
		driver.findElement(passwordField).sendKeys(null);
		driver.findElement(loginButton).click();
	}
	
	public void verifyHomePage() {
		
	}
}
