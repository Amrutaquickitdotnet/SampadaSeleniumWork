package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_007_Radio_Button {
	static WebDriver driver;

	public static void main(String[] args) {
		fetchRadioButtonValue();
	}

	public static void fetchRadioButtonValue() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement signUpButton = driver.findElement(By.linkText("Create New Account"));
		signUpButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value = '2']"));
		maleRadioBtn.click();
	}

}
