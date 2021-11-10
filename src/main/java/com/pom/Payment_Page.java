package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {

public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement Payment_Page;
	
	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	private WebElement Confirm_Order;
	
	public Payment_Page(WebDriver driver6) {
		this.driver = driver6;
		
		PageFactory.initElements(driver, this);
}

	public WebElement getPayment_Page() {
		// TODO Auto-generated method stub
		return Payment_Page;
	}

	public WebElement Confirm_Order() {
		// TODO Auto-generated method stub
		return Confirm_Order;
	}
}
