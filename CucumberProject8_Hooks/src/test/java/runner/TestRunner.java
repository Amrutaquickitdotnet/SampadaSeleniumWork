package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		features = "G:\\SampadaSelenium\\CucumberProject6_Reports\\src\\test\\java\\Features\\login.feature"
		,
		glue = {"G:\\SampadaSelenium\\CucumberProject8_Hooks\\src\\test\\java\\com\\hookTest\\HookTest2.java"}
	
		
		
		)

public class TestRunner {

}
