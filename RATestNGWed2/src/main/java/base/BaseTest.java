package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.RequestPayload;

public class BaseTest {

	public String baseUrl;
	
	public BaseTest() {
		baseUrl = "https://rahulshettyacademy.com/api/ecom";
		RestAssured.baseURI=baseUrl;
	}
	public Response sendPostRequest(String endpoint,Object payload) {
		return RestAssured
				.given()
				.header("Content-Type", "application/json")
				.body(RequestPayload.Payload())
				.post("api/ecom/auth/login")
				.then()
				.extract().response();
		
	}
}
