package com.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_20_WebTables2 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		findingWebTable();
	}

// get single row or single columns from Excel sheet
	public static void findingWebTable() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement table = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		List<WebElement> columns = driver.findElements(By.tagName("td"));
		for (int i = 0; i < rows.size(); i++) {
			for (int j = 0; j < columns.size(); j++) {
				if (i == 7 && j == 1) {
					WebElement cell = columns.get(j);
					WebElement link = cell.findElement(By.tagName("a"));
					link.click();
					break;
				}
			}

		}

	}
}
