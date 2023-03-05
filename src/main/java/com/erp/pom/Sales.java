package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sales {
	@FindBy(xpath="(//a[@class='btn btn-default IconButton mobileview'])[2]") private WebElement Sales;
	@FindBy(xpath="(//input[@name='GRN'])[1]") private WebElement BillNo;
	@FindBy(xpath="//input[@name='SDsalesDate']") private WebElement Date;
	@FindBy(xpath="//select[@name='CashCredit']") private WebElement Transaction;
	@FindBy(xpath="//input[@name='CustomerName']") private WebElement Cust_Name;
	@FindBy(xpath="//input[@name='customerAddress']") private WebElement Address;
	@FindBy(xpath="//input[@name='CustMobileNo']") private WebElement MobileNo;
	@FindBy(xpath="//input[@name='BillID']") private WebElement EditBill;
	@FindBy(xpath="(//span[@class='slider round'])[2]") private WebElement WhatsappSlider;
	@FindBy(xpath="(//span[@class='slider round'])[4]") private WebElement EmployeeWhatsappSMS;
	@FindBy(xpath="//input[@name='SDItemName']") private WebElement ProductName;
	@FindBy(xpath="//input[@name='SDQuantity']") private WebElement Qty;
	@FindBy(xpath="//input[@name='SDRate']") private WebElement Rate;
	@FindBy(xpath="//input[@name='AddRow']") private WebElement AddRow;
	@FindBy(xpath="//button[@title='PRINT BILL']") private WebElement SaveButton;
	@FindBy(xpath="//a[@title='Refresh']") private WebElement Refresh;
	
	public Sales(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void ClickonSales() {
			Sales.click();
		}
		public void EnterBillNo() {
			BillNo.sendKeys("");
		}
		public void EnterDate() {
			Date.sendKeys("");
		}
		public void TransactionDropdown() {
			Transaction.click();
		}
		public void EnterCust_Name() {
			Cust_Name.sendKeys("");
		}
		public void EnterAddress() {
			Address.sendKeys("");
		}
		public void EnterMobileNo() {
			MobileNo.sendKeys("");
		}
		public void EnterEditBill() {
			EditBill.sendKeys("");
		}
		public void ClickonWhatsappSlider() {
			WhatsappSlider.click();
		}
		public void ClickonEmployeeWhatsappSMS() {
			EmployeeWhatsappSMS.click();
		}
		public void EnterProductName() {
			ProductName.sendKeys("");
		}
		public void EnterQty() {
			Qty.sendKeys("");
		}
		public void EnterRate() {
			Rate.sendKeys("");
		}
		public void ClickonAddRow() {
			AddRow.click();
		}
		public void ClickonSaveButton() {
			SaveButton.click();
		}
		public void ClickonRefresh() {
			Refresh.click();
		}
		
	


}
