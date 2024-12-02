package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

	private WebDriver driver;
	
	private By item= By.partialLinkText("Skybags");
	
	public Search(WebDriver driver) {
		this.driver=driver;
	}

	public void selectItem() {
		driver.findElement(item).click();
	}
}
