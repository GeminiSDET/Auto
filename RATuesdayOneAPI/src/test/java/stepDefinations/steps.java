package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddPlace;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;




public class steps {

	private String placeId;
	private String responseMessage;
	private int statusCode; 
	
	@Given("the user provides valid payload with name {string}, language {string}, address {string}")
	public void the_user_provides_valid_payload_with_name_language_address(String name, String language, String address) {
	   AddPlace addPlacePage=new AddPlace();
	   addPlacePage.createPayload(name, language, address);
	}
	@When("the request to add a place is sent")
	public void the_request_to_add_a_place_is_sent() {
	    AddPlace addPlacePage =new AddPlace();
	    addPlacePage.sendAddPlaceRequest();
	    placeId=addPlacePage.getPlaceId();
	    responseMessage=addPlacePage.getResponseMessage();
	    statusCode=addPlacePage.getStatusCode();
	    
	}
	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(int expectedStatusCode) {
	    assertEquals("expectedStatusCode", statusCode,"Status code mismatch");
	}
	@Then("the response should contain place_id")
	public void the_response_should_contain_place_id() {
	    assertNotNull(placeId,"place ID is null");
	}
	@Then("the response should have the message {string}")
	public void the_response_should_have_the_message(String expectedMessage) {
	    assertEquals(expectedMessage,responseMessage, "Response message mismatch");
	}
}
