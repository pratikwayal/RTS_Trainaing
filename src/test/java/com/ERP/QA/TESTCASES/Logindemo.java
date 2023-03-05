package com.ERP.QA.TESTCASES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.erp.pom.login_1;
import com.erp.pom.login_2;

public class Logindemo {
	
	@Test
	public void verifyLoginWithValidCredentials () throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://revaprime.softwaresolution.org.in/");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.xpath("//input[@placeholder='SoftWare Code']")).sendKeys("198");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Start']")).click();
		driver.findElement(By.xpath("(//button[@class='missingBtn hidethNav'])[5]")).click();
//		login_1 log = new login_1(driver);
//		log.Clickonstart();
//		
//		login_2 log2 = new login_2(driver);
//		log2.EnterSoftwareCode();
//		log2.EnterUsername();
//		log2.EnterPassword();
//		log2.ClickOnStartButton();
//		
		driver.quit();
		
	}
	
	

}
