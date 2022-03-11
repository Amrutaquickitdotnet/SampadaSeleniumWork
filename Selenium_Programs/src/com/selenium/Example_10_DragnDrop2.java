package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Example_10_DragnDrop2 {
	static WebDriver driver;

	public static void main(String[] args) {
		dragnDrop();
	}

	public static void dragnDrop() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://javascript.info/article/mouse-drag-and-drop/ball4/");

	WebElement dropFrom = driver.findElement(By.xpath("//*[@id='ball']"));
	
	WebElement dropTo = driver.findElement(By.xpath("//*[@id='gate']"));
	
	
	
	// click and Holding dragFrom Element and moving it to DropTo Element
	
Actions actions = new Actions(driver);
      Action dragAndDropAction   = 
    		  actions.clickAndHold(dropFrom).moveToElement(dropTo).release(dropTo).build();
      
      dragAndDropAction.perform();
	}

}
