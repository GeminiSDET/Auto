package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

	private WebDriver driver;
	
	private By addToCartButton=By.xpath("//button[@id='a-autoid-2-announce']");
	private By cartIcon=By.className("nav-cart-icon");
	private By cartItems= By.cssSelector(".sc-list-item");
	
	public Cart(WebDriver driver) {
		
	}
	
	public void addToCart() {
		driver.findElement(addToCartButton).click();
	}
	
	public void navigateToCart() {
		driver.findElement(cartIcon).click();
	}
	
	public boolean validateCartItems() {
		return driver.findElements(cartItems).size()>0;
	}
}
