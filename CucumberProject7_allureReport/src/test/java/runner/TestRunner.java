package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		features = "G:\\SampadaSelenium\\CucumberProject6_Reports\\src\\test\\java\\Features\\login.feature"
		,
		glue = {"stepDefination"}
		//plugin = {"pretty","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
		
		
		)

public class TestRunner {

}
