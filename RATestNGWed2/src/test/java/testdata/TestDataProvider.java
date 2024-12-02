package testdata;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name="loginData")
	public Object[][] getLoginData(){
		return new Object[][] {
			{"azarriju88@gmail.com","Azar~!@#4",200},
			{"invaliduser@example.com","wrongpassword",401}
		};
	}	
	
}
