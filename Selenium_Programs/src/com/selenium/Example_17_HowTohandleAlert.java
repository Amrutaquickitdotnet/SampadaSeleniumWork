package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_17_HowTohandleAlert {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		handleAlert();
	}

// get single row or single columns from Excel sheet
	public static void handleAlert() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());

		// 2 methods Alert interface
		// 1.Accept() 2. Dismiss()
		// a.accept();
		a.dismiss();
	}

}
