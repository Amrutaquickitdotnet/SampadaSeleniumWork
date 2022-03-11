package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_002_WebElement {
	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		login();
	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://phptravels.net/api/supplier");

	}

	public static void login() {
		/*
		 * WebElement username = driver.findElement(By.id("txtUsername"));
		 * username.sendKeys("Admin");
		 */
		
		driver.findElement(By.name("email")).sendKeys("supplier@phptravels.com");
		
		driver.findElement(By.name("password")).sendKeys("demosupplier");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
