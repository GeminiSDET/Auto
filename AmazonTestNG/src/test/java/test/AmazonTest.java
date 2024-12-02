package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Cart;
import Pages.Checkout;
import Pages.Home;
import Pages.Login;

public class AmazonTest extends BaseTest {

	@Test(priority = 1)
	public void testAmazonWorkflow() throws IOException {

		Login loginPage = new Login(driver);
		Home homePage = new Home(driver);
		Cart cartPage = new Cart(driver);
		Checkout checkoutPage = new Checkout(driver);
		
		
		//Step 1: Login
		loginPage.login("azarriju@gmail.com", "Azar~!@#4");
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
		
		//Step 2: Search and validate
		homePage.searchItem("Skybags");
		Assert.assertTrue(driver.getPageSource().contains("results"));
		
		//Step 3: Add to Cart
		cartPage.addToCart();
		cartPage.navigateToCart();
		Assert.assertTrue(cartPage.validateCartItems());
		
		//Step 4: Scroll Validations
		
		
		//Step 5: Screenshot
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot.png"));
		
		//Step 6: Proceed to Buy and select address
		checkoutPage.proceedToBuy();
		checkoutPage.selectSecondAddress();
		Assert.assertTrue(driver.getPageSource().contains("Deliver to this address"));
			
	}
}
