package stepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
		//List<Map<String, String>>data =	usercredentials.asMaps(String.class, String.class);
		/*
		 * driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
		 * 
		 * driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"))
		 * ;
		 */
	     for(Map<String, String> data :	usercredentials.asMaps(String.class, String.class)){
	    	 
	    WebElement username =	 driver.findElement(By.name("email"));
	    username .sendKeys(data.get("username"));
	    
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.linkText("Logout")).click();
	}
		
	}

	@When("click on login button")
	public void click_on_login_button() {
		
	}

	@Then("login done successfully")
	public void login_done_successfully() {
		System.out.println("Login Successfully done");
		driver.quit();
	}

}
