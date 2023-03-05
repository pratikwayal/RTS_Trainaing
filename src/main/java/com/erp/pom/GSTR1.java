package com.erp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GSTR1 {
	@FindBy(xpath="(//a[@class='btn btn-default IconButton mobileview'])[3]") private WebElement GSTButton;
	@FindBy(xpath="//input[@name='fromDate']") private WebElement FromDate;
	@FindBy(xpath="//input[@name='toDate']") private WebElement ToDate;
	@FindBy(xpath="//select[@name='Page']") private WebElement Report;
	@FindBy(xpath="//button[@name='DownloadQ']") private WebElement SingleDownload;
	@FindBy(xpath="//button[@name='Download']") private WebElement DownloadGSTR1Old;
	@FindBy(xpath="//button[@id='Downloadallgstr1']") private WebElement DownloadGSTR1New;
	@FindBy(xpath="//button[@class='btn btn-default ']") private WebElement Close;
	
	public GSTR1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonGSTButton() {
		GSTButton.click();
	}
	public void EnterFromDate() {
		FromDate.sendKeys("");
	}
	public void EnterToDate() {
		ToDate.sendKeys("");
	}
	public void ClickonReportDropdown() {
		Report.click();
	}
	public void ClickonSingleDownload() {
		SingleDownload.click();
	}
	public void ClickonDownloadGSTR1OldButton() {
		DownloadGSTR1Old.click();
	}
	public void ClickonDownloadGSTR1NewButton() {
		DownloadGSTR1New.click();
	}
	public void ClickonCloseButton() {
		Close.click();
	}



}
