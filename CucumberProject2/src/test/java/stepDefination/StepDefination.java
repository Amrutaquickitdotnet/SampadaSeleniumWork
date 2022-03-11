package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	public WebDriver driver;

	@Given("I have visited orangehrm url")
	public void i_have_visited_orangehrm_url() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.phptravels.net/login");
	}

	@When("user will enter {string} and {string}")
	public void user_will_enter_and(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("login successfully done")
	public void login_successfully_done() {
		System.out.println("Login Successfully done");
	}

}
