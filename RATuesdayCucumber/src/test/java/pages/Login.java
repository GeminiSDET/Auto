package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Login {
	
	public String login(String email,String password) {

	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	Response response=RestAssured.given().header("Content-Type","application/json")
	.body("{\n"
			+ "    \"userEmail\": \"azarriju88@gmail.com\",\n"
			+ "    \"userPassword\": \"Azar~!@#4\"\n"
			+ "}")
	.post("api/ecom/auth/login");
	
	return response.jsonPath().getString("token");
	
	}
}
