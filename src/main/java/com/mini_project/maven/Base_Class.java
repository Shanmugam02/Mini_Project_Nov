package com.mini_project.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static  WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		return driver;
	}
    public static void clickOnElement(WebElement element) {
    	element.click();
    }
    public static void inputValueElement(WebElement element, String value) {
    	element.sendKeys(value);
    }
    public static void getURL(String url) {
    	driver.get(url);
    }
   // public static void close() {
    //	driver.close();
    //}
    //public static void quit() {
    //	driver.quit();
    //}
}
