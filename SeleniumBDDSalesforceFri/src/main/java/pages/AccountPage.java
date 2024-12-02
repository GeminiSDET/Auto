package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

	@FindBy(xpath="//a[@title='Accounts']")
	private WebElement accountTab;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	private WebElement newButton;
	
	@FindBy(xpath="//input[@id='input-445']")
	private WebElement accountNameField;
	
	@FindBy(xpath="//button[@name='SaveEdit']")
	private WebElement saveButton;
	

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void createNewAccount(String AzarTest) {
		accountTab.click();
		newButton.click();
		accountNameField.sendKeys(AzarTest);
		saveButton.click();
		
	}
	
}
