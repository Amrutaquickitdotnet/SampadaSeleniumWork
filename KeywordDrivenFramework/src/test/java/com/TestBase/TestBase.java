package com.TestBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	ChromeDriver driver;

	public void init_driver() {
		driver = new ChromeDriver();
	}

	public void execute(String testSteps, String locatorType, String selector, String action, String value) {
		WebElement element;

		switch (action.toLowerCase()) {
		case "openBrowser":
			System.out.println("I want to open chrome browser");
			init_driver();
			driver.manage().window().maximize();

			break;
		case "enterUrl":
			driver.get(value);
			break;
			
		case "sendKeys":
		element =	getElement(locatorType, selector);
		element.clear();
		element.sendKeys(value);
			break;
		case "sleep":
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			break;
		case "click":
		element =	getElement(locatorType, selector);
			element.click();
			break;
		default:
			break;
		}

	}

	public WebElement getElement(String locatorType, String selector) {
		WebElement element = null;
		switch (locatorType) {

		case "id":
           driver.findElement(By.id(selector));
			break;
		case "name":
			 driver.findElement(By.name(selector));
			break;
		case "xpath":
			 driver.findElement(By.xpath(selector));
			break;
		case "linkText":
			 driver.findElement(By.linkText(selector));
			break;
		case "cssSelector":
			 driver.findElement(By.cssSelector(selector));
			break;
		case "tagname":
			 driver.findElement(By.tagName(selector));
			break;
		case "partiallinkText":
			 driver.findElement(By.partialLinkText(selector));
			break;

		case "className":
			 driver.findElement(By.className(selector));
			break;
		default:
			break;
		}
		return element;

	}

}
