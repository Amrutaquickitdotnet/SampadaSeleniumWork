package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_006_SelectValueFromDropdown_getoptions {
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
		WebElement country = driver.findElement(By.xpath("//select[@name ='Country']"));
		
		Select sel = new Select(country);
		List<WebElement> countryList =	sel.getOptions();
		/*
		 * for(int i=0; i<countryList.size(); i++) {
		 * System.out.println(countryList.get(i).getText()); }
		 */
	WebElement defaultSelection =	sel.getFirstSelectedOption();
	System.out.println(defaultSelection.getText());
	/*	List<WebElement> countryList =	 driver.findElements(By.xpath("//select[@name ='Country']"));
		
		System.out.println("Length of countries are :"+ countryList.size());
		for(WebElement countryDataList:countryList) {
			System.out.println(countryDataList.getText());
		}
	*/
		// getOptions()
		//getFirstSelectedOptions()
		//getAllSelectedoptions()
		
		

	}

}
