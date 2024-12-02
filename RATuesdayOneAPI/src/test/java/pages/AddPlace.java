package pages;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class AddPlace {

	private String requestBody;
	private Response response;

	public AddPlace() {

		RestAssured.baseURI= "https://rahulshettyacademy.com";

	}
	
	public void createPayload(String name,String language,String address) {
		 requestBody = "{\n"
				+ "  \"location\": {\n"
				+ "    \"lat\": -38.383494,\n"
				+ "    \"lng\": 33.427362\n"
				+ "  },\n"
				+ "  \"accuracy\": 50,\n"
				+ "  \"name\": \"Azar house\",\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
				+ "  \"address\": \"Azar Original Address\",\n"
				+ "  \"types\": [\n"
				+ "    \"shoe park\",\n"
				+ "    \"shop\"\n"
				+ "  ],\n"
				+ "  \"website\": \"http://google.com\",\n"
				+ "  \"language\": \"French-IN\"\n"
				+ "}";
	}
	
	public void sendAddPlaceRequest() {
		response = given()
                .queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/maps/api/place/add/json");
		}
	public String getPlaceId() {
		return response.jsonPath().getString("place_id");
	}
	
	public String getResponseMessage() {
		return response.jsonPath().getString("status");
	}
	
	public int getStatusCode() {
		return response.getStatusCode();
	}
	
	
	
	
	
	
	
	
}
