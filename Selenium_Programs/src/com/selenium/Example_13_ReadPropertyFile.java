package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Example_13_ReadPropertyFile {
	static WebDriver driver;
	 static FileInputStream fs;
	 static Properties prop;

	public static void main(String[] args) {
		readData();
	}
	
	public static void readData() {
		
		String path = "G:\\SampadaSelenium\\OR\\data.properties";// declared path of properties file
		
		try {
			 fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 prop = new Properties();// Object of properties 
		 
		 try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.setProperty("webdriver.chrome.driver",
					"G:\\SampadaSelenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.navigate().to(prop.getProperty("url"));
			

			driver.findElement(By.xpath(prop.getProperty("usernamelocator"))).sendKeys(prop.getProperty("usernamelocatorvalue"));
			
			driver.findElement(By.xpath(prop.getProperty("passwordlocator"))).sendKeys(prop.getProperty("passwordlocatorvalue"));
			
			driver.findElement(By.xpath(prop.getProperty("loginBtnpath"))).click();
		
		
		
	}

	
	

	

	
}
