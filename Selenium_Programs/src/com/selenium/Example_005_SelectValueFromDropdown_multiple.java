package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_005_SelectValueFromDropdown_multiple {
	static WebDriver driver;

	public static void main(String[] args) {
		dropDownValue();
		multiselect();
		deSelection();
	}

	public static void dropDownValue() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("G:\\SampadaSelenium\\html\\cars.html");

		// isMultiple=> boolean

		WebElement multiSelect = driver.findElement(By.id("cars"));
		Select osel = new Select(multiSelect);

		if (osel.isMultiple()) {

	System.out.println("Select by index position:");
	   osel.selectByIndex(2);
	   System.out.println("Select by value position:");
			osel.selectByValue("volvo");
			System.out.println("Select by visible position:");
			osel.selectByVisibleText("Maruti");
		}

	}

	

	public static void multiselect() {
		WebElement multiSelect = driver.findElement(By.id("cars"));
		Select osel = new Select(multiSelect);
		
		List<WebElement>allOptions = osel.getAllSelectedOptions();
		for(WebElement options:allOptions) {
			System.out.println("Selected options in the list are :"+options.getText());
		}
		}
	
		
		public static void deSelection() {
			WebElement multiSelect = driver.findElement(By.id("cars"));
			Select osel = new Select(multiSelect);
			/*
			 * osel.deselectByVisibleText("Maruti");
			 * System.out.println("deSelect by visibleText position:");
			 * osel.deselectByValue("volvo");
			 * System.out.println("deselect by value position:"); osel.deselectByIndex(2);
			 */
			osel.deselectAll();
					
	}
	
	
}
