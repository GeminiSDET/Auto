package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver {

	private static ChromeDriver driver;
	
	public static ChromeDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver	;
	}
	public static void quitDriver() {
		if(driver==null) {
			driver.quit();
			driver=null;
		}
	}
}
