package base;

import io.restassured.RestAssured;

public class BaseClass {

	public BaseClass() {
		RestAssured.baseURI="https://api.restful-api.dev";
	}
}
