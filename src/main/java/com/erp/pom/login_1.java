package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_1 {
//	Step 1 Declarations of variable globally (WebElements-data member)
	
	@FindBy (xpath="//input[@type='button']") private WebElement Start;
	
//  Step 2 Initialization globally data member

	public login_1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
// Step 3 Utilization (Methods Creation)
	
	public void Clickonstart() {
		Start.click();
	}

}
