package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashborad {
	
	@FindBy(xpath="(//i[@class='fa fa-refresh'])[1]") private WebElement Refresh;
	@FindBy(xpath="(//a[@class='text-left'])[1]") private WebElement Item;
	@FindBy(xpath="(//a[@class='text-left'])[2]") private WebElement Purchase;
	@FindBy(xpath="(//a[@class='text-left'])[3]") private WebElement Sales;
	@FindBy(xpath="(//a[@class='text-left'])[4]") private WebElement Accounting;
	@FindBy(xpath="(//a[@class='text-left'])[5]") private WebElement Stocking;
	@FindBy(xpath="(//a[@class='text-left'])[6]") private WebElement GST;
	@FindBy(xpath="(//a[@class='text-left'])[7]") private WebElement Settings;
	@FindBy (linkText = "Purchase") private WebElement Purchase2;
	@FindBy(xpath="(//a[@onclick=\"ChangeIdd();\"])[6]") private WebElement Purchase3;
	@FindBy (xpath= "(//button[@class='missingBtn hidethNav'])[5]") private WebElement SO;
	
 
	public Dashborad (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void RefreshButton() {
		Refresh.click();
	}
	
	public void Itemdropdown() {
		Item.click();
	}
	public void PurchaseDropdown() {
		Purchase.click();
	}
	public void Salesdropdown() {
		Sales.click();
	}
	public void Accountingdropdown() {
		Accounting.click();
	}
	public void Stockingdropdown() {
		Stocking.click();
	}
	public void GSTdropdown() {
		GST.click();
	}
	public void Settings() {
		Settings.click();
	}
   public void purchasetwo() {
	   Purchase2.click();
   }
	public void purchasethree() {
		Purchase3.click();
	}
	public void SalesOrder() {
		SO.click();
	}
}
