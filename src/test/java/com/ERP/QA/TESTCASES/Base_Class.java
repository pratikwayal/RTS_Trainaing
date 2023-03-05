package com.ERP.QA.TESTCASES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import Utilities.Read_config;

public class Base_Class {
	
	static Read_config read = new Read_config();  
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	public String url = read.getURL();
	public String expectedTitle = read.getexpectedId();
	public String expctedsalesorderurl = read.getExpOrderURL();

	@BeforeClass 
	public void setup(String browser) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", read.getChromepath());
		driver = new ChromeDriver(opt);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	

	@AfterClass
	public void quit() {
		driver.quit();
	}



}
