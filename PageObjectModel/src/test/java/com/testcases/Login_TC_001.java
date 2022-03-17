package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

public class Login_TC_001 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		lp.enterusername("Admin");
		lp.enterpassword("admin123");
		lp.doLogin();
	}

}
