package stepdefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverFactory;

public class AmazonStepDefinitions {

	WebDriver driver=WebDriverFactory.getDriver();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	@Given ("I open the Amazon login page")
	public void iOpenAmazonLoginPage() {
		driver.get("https://www.amazon.in/ap/signin?...");
	}
	
	@When ("I enter username {string} and password {string}")
	public void iEnterUsernameAndPassword() {
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();
	}
	
	@Then ("Then I should see the Home Screen")
	public void iShouldSeeHomeScreen() {
		wait.until(ExpectedConditions.titleContains(""));
	}
	
	@When ("When I search for {string}")
	public void iSearchFor() {
		driver.findElement(By.id("")).sendKeys("");
	}
	
	@Then ("I validate the search results")
	public void iValidateSearchResults() {
		assert driver.findElements(By.cssSelector("")).size()>0;
	}
	
	
	
	
	
	
	
	
	
	
	
    @When("I take a screenshot")
    public void iTakeScreenshot() {
    	try {
    		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(screenshot, new File("target/screenshot/screenshot.png"));
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }

	
	
	
	
	
	
	
	
	

}
