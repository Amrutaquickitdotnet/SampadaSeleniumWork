package com.selenium;

import java.io.File;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_21_TakeaScreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		captureScreenshot();
	}

// get single row or single columns from Excel sheet
	public static void captureScreenshot() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
		
	//1. Discuss which thing you need to capture 
		//2. Save CaptureScreen in desired directory
		//3. View Screenshot 
		
				
		File srcFile =		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileHandler.copy(srcFile, new File("G:\\SampadaSelenium\\Screenshot\\login.jpg"));
		}


}
