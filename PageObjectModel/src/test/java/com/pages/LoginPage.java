package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
				}
	
	@FindBy(id ="txtUsername")
	WebElement userNameElement;
	
	@FindBy(id ="txtPassword")
	WebElement passwordElement;
	
	@FindBy(id ="btnLogin")
	WebElement loginButtonElement;
	
	
	
	public void enterusername(String user) {
		userNameElement.sendKeys(user);
	}
	
	
	public void enterpassword(String pass) {
		passwordElement.sendKeys(pass);
	}
	public void doLogin() {
		loginButtonElement.click();
	}
}
