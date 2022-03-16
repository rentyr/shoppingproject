package com.automationpractise.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.HomePage;

 
public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}

@BeforeTest
public void setUp() {
	initialization();
	homePage = new HomePage();	
	driver.get(prop.getProperty("url"));


}

@Test
public void titleTest() {	
String homepageTitle= homePage.verifyHomePageTitle();
Assert.assertEquals(homepageTitle, "My Store"); 
}

@Test
public void bannerTest() {
	Boolean flag =homePage.verifyBanner();
	Assert.assertTrue(flag, "banner is found");

}

@AfterTest
public void tearDown(){
	driver.quit();
}
}






