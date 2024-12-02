package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	private WebDriver driver;
	
	private By searchBox=By.id("twotabsearchtextbox");
	private By searchSuggestion=By.xpath("//div[@aria-label='skybags bags']");
	
	public Home (WebDriver driver) {
		this.driver =driver;
	}

	public void searchItem(String item) {
		driver.findElement(searchBox).sendKeys("Skybags");
		driver.findElement(searchSuggestion).click();
	}
}
