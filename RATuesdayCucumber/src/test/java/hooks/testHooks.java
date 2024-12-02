package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class testHooks {

	@Before
	public void setup() {
		System.out.println("Setting up test Enviroment");
	}
	
	@After
	public void teardown() {
		System.out.println("Cleaning up after test");
	}
}
