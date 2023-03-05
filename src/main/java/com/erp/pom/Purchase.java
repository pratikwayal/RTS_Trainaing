package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase {
	@FindBy(xpath="//input[@name='BillNo']") private WebElement RefBillNo;
	@FindBy(xpath="//select[@id='CashCredit']") private WebElement Transaction;
	@FindBy(xpath="//input[@id='supplierName']") private WebElement Supplier;
	@FindBy(xpath="//input[@id='customerAddress']") private WebElement Address;
	@FindBy(xpath="//input[@id='CustMobileNo']") private WebElement MobileNo;
	@FindBy(xpath="//input[@id='BillDtls']") private WebElement EditBill;
	@FindBy(xpath="//input[@id='SDItemName']") private WebElement ItemName;
	@FindBy(xpath="//input[@id='SDQuantity']") private WebElement Qty;
	@FindBy(xpath="//input[@id='SDRate']") private WebElement Rate;
	@FindBy(xpath="//input[@id='AddRow']") private WebElement AddRow;
	
	
	public Purchase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void RefBillNoTextfield() {
		RefBillNo.sendKeys("");
	}
	public void TransactionDropdown() {
		Transaction.click();
	}
	public void SupplierTextfield() {
		Supplier.sendKeys("");
	}
	public void AddressTextfield() {
		Address.sendKeys("");
	}
	public void MobileNoTextfield() {
		MobileNo.sendKeys("");
	}
	public void EditBillTextfield() {
		EditBill.click();
	}
	public void ItemNameTextfield() {
		ItemName.sendKeys("");
	}
	public void QtyTextfield() {
		Qty.sendKeys("");
	}
	public void RateTextfield() {
		Rate.sendKeys("");
	}
	public void AddRowButton() {
		AddRow.click();
	}


}
