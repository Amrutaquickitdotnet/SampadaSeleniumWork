package com.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_19_WebTables {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		findingWebTable();
	}

// get single row or single columns from Excel sheet
	public static void findingWebTable() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://money.rediff.com/gainers");

		WebElement baseTable = driver.findElement(By.tagName("table"));
		List<WebElement> rows = baseTable.findElements(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr"));
		List<WebElement> columns = baseTable.findElements(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr/td"));
		// System.out.println("Companies list "+rows.size());
		/*
		 * for (int i = 0; i < rows.size(); i++) {
		 * 
		 * System.out.println(rows.get(i).getText() + columns.get(i).getText()); }
		 */
		// Find third row of table

		WebElement rowThree = driver.findElement((By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr[3]")));
		String rowThreeText = rowThree.getText();

		System.out.println(rowThreeText);
		// find 3rd row and 4th column
		WebElement data = driver.findElement(By.xpath("//*[@id = 'leftcontainer']/table/tbody/tr[3]/td[5]"));
		String thirdColumnData = data.getText();
		System.out.println(thirdColumnData);
	}
}
