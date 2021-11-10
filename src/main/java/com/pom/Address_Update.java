package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Update {

public WebDriver driver;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement Address_Update;
	
	@FindBy(id = "cgv")
	private WebElement Agree;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement Proceed_Checkout;
	
	public Address_Update(WebDriver driver5) {
		this.driver = driver5;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress_Update() {
		// TODO Auto-generated method stub
		return Address_Update;
	}

	public WebElement getAgree() {
		// TODO Auto-generated method stub
		return Agree;
	}

	public WebElement getProceed_Checkout() {
		// TODO Auto-generated method stub
		return Proceed_Checkout;
	}
}
