package pages;

import java.util.HashMap;

import base.BaseTest;
import io.restassured.response.Response;

public class LoginPage extends BaseTest {
	public Response login (String email,String password) {
		
		HashMap<String,String> payload= new HashMap<String, String>();
		payload.put("userEmail", email);
		payload.put("userPassword", password);

		return sendPostRequest("/auth/login",payload);
		
	}

	
}
