package tests;

import org.junit.Assert;
import org.junit.Test;

import base.BaseSetup;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.APIEndpoints;
import utilities.RequestPayloads;

public class AddPlaceTest extends BaseSetup{
//Test cases for the API
	
	@Test(priority = 1)
	public void testAddPlaceStatusCode() {
		Response response=RestAssured.given()
				.header("Content-Type","application/json")
		.body(RequestPayloads.getAddPlacePlayload())
		.when()
		.post(APIEndpoints.ADD_PLACE);
		
		response.then().log().all();
		Assert.assertEquals("Status Code is not as expected ",200, response.getStatusCode());
		
		
		@Test(priority = 2)
		public void testAddPlaceResponseBody() {
			RestAssured.given()
			.header("Content-Type","application/json")
			.body(RequestPayloads.getAddPlacePlayload())
			.when()
			.post(APIEndpoints.ADD_PLACE);
			
			response.then().log().all();
			Assert.assertEquals("Status is not OK!", "OK", response.jsonPath().getString("status"));
			Assert.assertEquals("Scope is not APP!", "APP", response.jsonPath().getString("scope"));

		}
	}
}
