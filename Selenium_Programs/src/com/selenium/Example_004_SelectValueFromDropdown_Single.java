package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_004_SelectValueFromDropdown_Single {
	static WebDriver driver;

	public static void main(String[] args) {
		dropDownValue();
	}

	public static void dropDownValue() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.orangehrm.com/hris-hr-software-demo/");
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name ='Country']"));
		Select select = new Select(countryDropdown);

		select.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		select.selectByValue("India");
		
		select.selectByVisibleText("Japan");
		
		// getOptions()
		//getFirstSelectedOptions()
		//getSelectedoptions()
		
		

	}

}
