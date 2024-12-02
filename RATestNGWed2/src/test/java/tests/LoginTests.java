package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import io.restassured.response.Response;
import pages.LoginPage;

public class LoginTests {

	LoginPage loginPage = new LoginPage();
	
	@Test
	public void testSuccessfulLogin() {
		Response response=loginPage.login("azarriju88@gmail.com", "Azar~!@#4");
		AssertJUnit.assertEquals(200, response.getStatusCode());
		String token=response.jsonPath().getString("token");
		AssertJUnit.assertNotNull("Token is not null for sucess login",token);
	}
	
	@Test
	public void testInvaildLogin() {
		Response response=loginPage.login("invalidusername@gmail.com", "wrongpassword");
		AssertJUnit.assertEquals(401, response.statusCode());
		String errorMessage=response.jsonPath().getString("message");
		AssertJUnit.assertEquals("Invaild credentials", errorMessage);
	}
}
