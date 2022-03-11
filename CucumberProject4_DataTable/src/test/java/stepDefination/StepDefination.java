package stepDefination;

import java.util.List;

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

	@When("user enters credentials to login")
	public void user_enters_credentials_to_login(io.cucumber.datatable.DataTable usercredentials) {
		
		List<List<String>>	data =	usercredentials.asLists();

		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));

		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


}
