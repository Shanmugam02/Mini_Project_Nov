package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {

public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
	private WebElement Add_Cart;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement Proceed_Checkout;
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement Proceed_Checkout1;
	
	public Add_Cart(WebDriver driver4) {
		this.driver = driver4;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd_Cart() {
		// TODO Auto-generated method stub
		return Add_Cart;
	}

	public WebElement getProceed_Checkout() {
		// TODO Auto-generated method stub
		return Proceed_Checkout;
	}

	public WebElement getProceed_Checkout1() {
		// TODO Auto-generated method stub
		return Proceed_Checkout1;
	}

	
}
