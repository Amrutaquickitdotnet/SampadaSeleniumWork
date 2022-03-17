package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
				}
	
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	
	By loginButton = By.id("btnLogin");
	
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void doLogin() {
		driver.findElement(loginButton).click();
	}
}
