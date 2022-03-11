package com.selenium;

import java.io.File;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_23_FirstTwoCheckbox {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		login();
		Thread.sleep(5000);
		lastTwoChekbox();
	}


	public static void login() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1800)");
		
		}
	//*[@id="ohrmList_chkSelectAll"]
	
	public static void lastTwoChekbox() {
		
	List<WebElement> checkboxes  =	driver.findElements(By.xpath("//*[@id ='resultTable']/tbody//input"));
	
	int totalcheckboxes =checkboxes.size();
	System.out.println(totalcheckboxes);
	for(int i= totalcheckboxes-4; i<totalcheckboxes; i++) {
		checkboxes.get(i).click();
	}
	
	}
}
