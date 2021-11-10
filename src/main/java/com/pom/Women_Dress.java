package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Dress {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women_Dress;

   
	@FindBy(xpath = "//a[@title='Casual Dresses")
	private WebElement Casual_Dress;
	
	public Women_Dress(WebDriver driver3) {
		this.driver = driver3;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen_Dress() {
		// TODO Auto-generated method stub
		return Women_Dress;
	}

	public WebElement getCasual_Dress() {
		// TODO Auto-generated method stub
		return Casual_Dress;
	}
	
	
    
}
    

