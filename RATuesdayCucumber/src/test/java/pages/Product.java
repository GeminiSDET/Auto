package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Product {


	public String token;
	public String productId;
	public void addProduct(String name,String category,String price) {
		this.token=token;
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
				Response response=RestAssured.given()
				.header("Content-Type","application/json")
				.header("Authorization",token)
				.body("{\"name\":\"" + name + "\", \"category\":\"" + category + "\", \"price\":\"" + price + "\"}")
				.post("/api/ecom/product/add-product");
				
				productId=response.jsonPath().getString("productId");
	}
	public boolean isProductAdded() {
		return productId !=null;
	}
	public boolean verifyProductDetails() {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		Response response=RestAssured.given().header("Authorization",token)
		.get("/api/ecom/product/" + productId);

		return response.statusCode()==200;
	}
	
	
}
