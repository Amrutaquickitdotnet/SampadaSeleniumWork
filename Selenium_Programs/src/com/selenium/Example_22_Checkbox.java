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

public class Example_22_Checkbox {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		login();
		selectedcheckbox();
	}

// get single row or single columns from Excel sheet
	public static void login() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
		}
	//*[@id="ohrmList_chkSelectAll"]
	
	public static void selectedcheckbox() {
		
	WebElement e  =	driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']"));
	e.click();
	if (e.isSelected()) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.click();
	}else {
		System.out.println("Checkbox is disabled");
	}
	
	}


}
