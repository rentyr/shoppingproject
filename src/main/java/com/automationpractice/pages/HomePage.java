package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchField;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement banner;
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signinButton;
	
	
	public  HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	public Boolean verifyBanner(){
		return banner.isDisplayed();
		
	}
	
	
	}
	

