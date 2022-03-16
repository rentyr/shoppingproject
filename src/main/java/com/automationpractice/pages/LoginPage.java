package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath ="//input[@id='passwd']")
	WebElement passwordField;
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement emailField;
	
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
}
