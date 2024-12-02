import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/azarahmed/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/dom_obj_table.asp");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1400)");
		
        System.out.println(driver.findElement(By.xpath("//td[normalize-space()='align']")).getText());
        System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Sets or returns the alignment of a table according')]")).getText());

		
		

		
		
		
		
		driver.quit();
	}

}


/*import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class ScreenScroll {

    public static void main(String[] args) {
        // 1. Set up the WebDriver
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Navigate to the page
            driver.get("https://www.w3schools.com/jsref/dom_obj_table.asp");

            // 3. Scroll down to the "Table Object Methods" table
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement tableMethodsHeader = driver.findElement(By.xpath("//h2[text()='Table Object Methods']"));
            js.executeScript("arguments[0].scrollIntoView(true);", tableMethodsHeader);

            // Optional: Wait for the scrolling to complete
            Thread.sleep(2000);

            // 4. Print the text of the "Table Object Methods" header
            System.out.println("Header: " + tableMethodsHeader.getText());

            // 5. Verify the first 3 options under the "Table Object Methods" table
            List<WebElement> rows = driver.findElements(By.xpath("//h2[text()='Table Object Methods']/following-sibling::table/tbody/tr"));

            // Loop through the first 3 rows and print them
            for (int i = 0; i < 3; i++) {
                WebElement row = rows.get(i);
                System.out.println("Method " + (i+1) + ": " + row.getText());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 6. Close the browser
            driver.quit();
        }
    }
}
*/