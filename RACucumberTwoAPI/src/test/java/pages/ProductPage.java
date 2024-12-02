package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ProductPage {

	private static final String ADD_PRODUCT_URL="https://rahulshettyacademy.com/api/ecom/product/add-product";
	private String token;
	
	public ProductPage(String token) {
		this.token=token;
	}
	
	public String addProduct(String name, String category, String price, String stock) {
		Response response=RestAssured.given().header("Authorization",token)
		.header("Content-Type","application/json")
		.body("{ " +
                "\"productName\": \"" + name + "\", " +
                "\"productCategory\": \"" + category + "\", " +
                "\"productPrice\": \"" + price + "\", " +
                "\"productStock\": \"" + stock + "\" " +
                "}")
		.post(ADD_PRODUCT_URL)
		.then().extract().response();
		
		if(response.statusCode()==200) {
			return response.jsonPath().getString("productID");
		} else {
			throw new RuntimeException("Product Addition failed" + response.getBody().asString());
		}
	}
}
