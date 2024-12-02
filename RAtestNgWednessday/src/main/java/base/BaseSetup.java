package base;

import io.restassured.RestAssured;

public class BaseSetup {
//Initializes Rest Assured baseURI
	
	public BaseSetup() {
		RestAssured.baseURI="https://rahulshettyacademy.com";
	}
}
