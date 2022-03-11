package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\SampadaSelenium\\CucumberProject3_DataDrivenTesting_Examples\\src\\test\\java\\Features\\login.feature"
		,
		glue = {"stepDefination"}
		
		
		
		)

public class TestRunner {

}
