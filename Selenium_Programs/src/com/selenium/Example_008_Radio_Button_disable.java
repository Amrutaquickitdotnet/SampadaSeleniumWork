package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_008_Radio_Button_disable {
	static WebDriver driver;

	public static void main(String[] args) {
		fetchRadioButtonValue();
	}

	public static void fetchRadioButtonValue() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate()
				.to("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/4923760/jewish/Register-Online.htm");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)");

		WebElement creditCardRadio = driver.findElement(By.id("input_10_creditCard"));

		boolean selectState = creditCardRadio.isDisplayed();

		if (selectState == true) {
			creditCardRadio.click();

			// isenabled => check button state disabled or enable => True / False
			// isselected => Actually will select result
			// isDisplayed => First check if button exist boolean , then evaluate

		}

	}
}
