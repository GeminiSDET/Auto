package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	private WebDriver driver;
	
	private By usernameField = By.id("ap_email");
	private By continueButton= By.id("continue");
	private By passwordField=By.id("ap_password");
	private By signInButton=By.id("signInSubmit");
	
	public Login(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void login (String username,String password) {
		driver.findElement(usernameField).sendKeys("azarriju@gmail.com");
		driver.findElement(continueButton).click();
		driver.findElement(passwordField).sendKeys("Azar~!@#4");
		driver.findElement(signInButton).click();
	}
}
