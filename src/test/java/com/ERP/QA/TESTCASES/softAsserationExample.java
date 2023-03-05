package com.ERP.QA.TESTCASES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAsserationExample {
	
	WebDriver driver;
	  
	  @BeforeMethod
	  public void setUp() {
//	    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    driver = new ChromeDriver();
	  }
	  
	  @Test
	  public void testExample() {
	    driver.get("https://www.google.com");
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("Selenium");
	    
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(searchBox.getAttribute("value"), "Selenium", "Search box text does not match expected value");
	    softAssert.assertTrue(searchBox.isDisplayed(), "Search box is not displayed");
	    softAssert.assertAll();
	  }
	  
	  @AfterMethod
	  public void tearDown() {
	    driver.quit();
	  }

}
