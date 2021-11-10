package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin_Btn;
	
	public Home_Page(WebDriver driver1) {
	       this.driver = driver1;
	       PageFactory.initElements(driver, this);
}
	
	public WebElement getsignin_Btn() {
		
		return signin_Btn;
	}

}
