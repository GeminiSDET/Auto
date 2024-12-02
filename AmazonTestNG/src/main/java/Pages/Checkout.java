package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

	private WebDriver driver;
	
	private By proceedToBuyButton=By.cssSelector("input[value='Proceed to checkout']");
	private By secondAddress=By.xpath("//input[@type='radio'] [contains(@checked,'checked')]");
	
	public Checkout (WebDriver driver){
		
	}
	
	public void proceedToBuy() {
		driver.findElement(proceedToBuyButton).click();
	}

	public void selectSecondAddress() {
		driver.findElement(secondAddress).click();
	}
}