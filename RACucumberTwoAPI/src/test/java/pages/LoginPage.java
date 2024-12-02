package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LoginPage {

	private static final String LOGIN_URL="https://rahulshettyacademy.com/api/ecom/auth/login";
	
	public String login(String username,String password) {
		Response response=RestAssured.given().header("Content-Type","application/json")
		.body("{ \"userEmail\": \"" + username + "\", \"userPassword\": \"" + password + "\" }")
		.post(LOGIN_URL)
		.then().extract().response();
		
		if(response.statusCode()==200) {
			return response.jsonPath().getString("token") ;
		}
		else {
			throw new RuntimeException("Login failed" + response.getBody().asString());
		}
	}
}
