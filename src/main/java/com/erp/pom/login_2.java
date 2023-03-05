package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_2 {
	@FindBy (xpath="//input[@placeholder='SoftWare Code']") private WebElement SoftwareCode;
	@FindBy (xpath="//input[@placeholder='Username']") private WebElement Username;
	@FindBy (xpath="//input[@placeholder='Password']") private WebElement Password;
	@FindBy (xpath="//input[@type='submit']") private WebElement StartButton;
	
	public login_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
   
	public void EnterSoftwareCode() {
		SoftwareCode.sendKeys("198");
		}
	public void EnterUsername() {
	 Username.sendKeys("admin");	
	}
	
	public void EnterPassword() {
		Password.sendKeys("123");
	}
	
	public void ClickOnStartButton() {
		StartButton.click();
	}
}
 