package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_009 {
	static WebDriver driver;

	public static void main(String[] args) {
		fetchRadioButtonValue();
	}

	public static void fetchRadioButtonValue() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("http://demo.automationtesting.in/Register.html");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	WebElement address = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
	address.sendKeys("11 Test Road");
	}

}
