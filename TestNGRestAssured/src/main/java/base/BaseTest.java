package base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

	protected static String baseUrl = "https://rahulshettyacademy.com/api/ecom";
	protected static String token;
	protected static userId;
	protected RequestSpecification request;
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI=baseUrl;
		request=RestAssured.given();
		request.header("Content-Type","application/json");
	}
	
	public void setAuthToken(String authToken) {
		request.header("Authorization","authToken");
	}
}
