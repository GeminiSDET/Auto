package runner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefinations",
		plugin = {"preety", "html:target/cucumber-reports.html"}
		)


public class TestRunner {

}
