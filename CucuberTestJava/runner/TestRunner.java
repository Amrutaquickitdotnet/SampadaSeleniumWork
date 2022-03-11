package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features="C:\\Users\\Amol\\eclipse-workspace\\selenium\\CucumberProject\\src\\test\\java\\Features\\additionNumber"
		features= "C:\\Users\\Amol\\eclipse-workspace\\selenium\\CucumberProject\\src\\test\\java\\Features\\Test.feature"
        
		//glue={"stepDefination"}
	
		)
public class TestRunner {

}
