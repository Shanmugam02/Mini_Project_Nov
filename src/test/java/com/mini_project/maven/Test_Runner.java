package com.mini_project.maven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.pom.Add_Cart;
import com.pom.Address_Update;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment_Page;
import com.pom.Women_Dress;

public class Test_Runner extends Base_Class{
	
    public static WebDriver driver = Base_Class.getBrowser("chrome");
    public static Home_Page hp = new Home_Page(driver);
    public static Login_Page Login = new Login_Page(driver);
    public static Women_Dress Dress = new Women_Dress(driver);
    public static Add_Cart Add_Cart = new Add_Cart(driver);
    public static Address_Update Address = new Address_Update(driver);
    public static Payment_Page Payment = new Payment_Page(driver);
    
    public static void main(String[] args) {
		
        getURL("http://automationpractice.com/index.php");
        
        
        clickOnElement(hp.getsignin_Btn());
        
        inputValueElement(Login.getEmail(),"black0207@gmail.com");
        inputValueElement(Login.getPassword(),"Colors@0207");
        clickOnElement(Login.getSignin_Btn());
        
        clickOnElement(Dress.getWomen_Dress());
        clickOnElement(Dress.getCasual_Dress());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)","");
        
        clickOnElement(Add_Cart.getAdd_Cart());
        clickOnElement(Add_Cart.getProceed_Checkout());
        js.executeScript("window.scrollBy(0,600)","");
        clickOnElement(Add_Cart.getProceed_Checkout1());
        
        clickOnElement(Address.getAddress_Update());
        js.executeScript("window.scrollBy(0,600)","");
        clickOnElement(Address.getAgree());
        clickOnElement(Address.getProceed_Checkout());
        
        js.executeScript("window.scrollBy(0,600)","");
        clickOnElement(Payment.getPayment_Page());
        js.executeScript("window.scrollBy(0,600)","");
        clickOnElement(Payment.Confirm_Order());
        
        
        
        
        
        
        
        
        
    }    
}
