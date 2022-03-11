package com.selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_18_manageWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		windowHandles();
	}
// get single row or single columns from Excel sheet
	public static void windowHandles() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.kotak.com/en/home.html");
		
		WebElement loginBtn =driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		
		loginBtn.click();
		
		System.out.println("Current parent window is "+ driver.getWindowHandle());
		
		Set<String>handles =	driver.getWindowHandles();
		
		for(String handle:handles) {
			System.out.println(handle);
			
		}
	}
	
}

