package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	public WebDriver driver;

	@Given("a user is landing on phptravel home page")
	public void a_user_is_landing_on_phptravel_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.phptravels.net/login");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {

		driver.findElement(By.name("email")).sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);

	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("login done successfully")
	public void login_done_successfully() {
		System.out.println("Login Successfully done");
		driver.quit();
	}

}
