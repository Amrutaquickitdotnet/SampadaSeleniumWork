package com.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_001 {
	static WebDriver driver;
// launch  a chrome browser through automation 
	// method means preparation of any task to achieve

	// can static method access non static methods=> No
	// can non static method access by static methods=> No
	// Can static variables access non static methods => No

	public static void main(String[] args) {
		launchBrowser();
	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		// maximize the window
				driver.manage().window().maximize();
		// driver.get("https://www.google.com/");

		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();

		

	}

}
