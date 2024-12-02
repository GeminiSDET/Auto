package pages;

import base.BaseClass;
import io.restassured.response.Response;
import pojo.ObjectRequest;
import static io.restassured.RestAssured.given;

public class ObjectPage extends BaseClass{


	public Response createObject(ObjectRequest objectRequest){
		return given().header("Content-Type", "application/json")
				.body(objectRequest)
				.when()
				.post("/objects");
		
	}
	
}
