package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewItem {
	@FindBy(xpath="(//a[@class='btn btn-default IconButton mobileview'])[4]") private WebElement AddNewItem;
	@FindBy(xpath="//input[@placeholder='Enter Item Name']") private WebElement ProductName;
	@FindBy(xpath="//select[@name='BrandId']") private WebElement Category;
	@FindBy(xpath="//input[@name='Unit']") private WebElement Unit;
	@FindBy(xpath="//input[@name='ItemRate']") private WebElement PurchaseRate;
	@FindBy(xpath="//input[@name='creditRate']") private WebElement CreditCost;
	@FindBy(xpath="//input[@name='hsncode']") private WebElement HSNCode;
	@FindBy(xpath="//select[@name='vatpercentage']") private WebElement GST;
	@FindBy(xpath="//input[@name='SaleRate']") private WebElement SaleRate;
	@FindBy(xpath="(//input[@type='submit'])[3]") private WebElement Save;
	@FindBy(xpath="(//input[@type='reset'])") private WebElement Cancel;
	
	public AddNewItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddNewItemButton() {
		AddNewItem.click();
	}
	public void EnterProductName() {
		ProductName.sendKeys("");
	}
	public void CategoryDropdown() {
		Category.click();
	}
	public void EnterUnit() {
		Unit.sendKeys("");
	}
	public void EnterPurchaseRate() {
		PurchaseRate.sendKeys("");
	}
	public void EnterCreditCost() {
		CreditCost.sendKeys("");
	}
	public void EnterHSNCode() {
		HSNCode.sendKeys("");
	}
	public void GSTDropdown() {
		GST.click();
	}
	public void EnterSaleRate() {
		SaleRate.sendKeys("");
	}
	public void SaveButton() {
		Save.click();
	}
	public void CancelButton() {
		Cancel.click();
	}




}
