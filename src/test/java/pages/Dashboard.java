package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utility.CommonMethods;


public class Dashboard extends CommonMethods{
     
	public Dashboard() {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this); 
     }
     
     @FindBy(xpath = "//span[contains(text(),\"Women's & Girls' Fashion\")]")
     WebElement fashion1;
              
     @FindBy(xpath = "//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[1]/li[2]/a[1]/span[1]")
     WebElement fashion2;
     
     @FindBy(xpath = "//span[contains(text(),'Abayas & Long Dresses')]")
     WebElement fashion3;
     
     @FindBy(xpath = "//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/div[1]/img[1]")
     WebElement fashion4;

     @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
     WebElement cart;
     
     @FindBy(xpath = "//input[@placeholder='Please enter your Phone Number or Email']")
     WebElement sendnum;
     
     @FindBy(xpath = "//input[@placeholder='Please enter your password']")
     WebElement sendpass;
     
     @FindBy(xpath = "//button[text()='LOGIN']")
     WebElement login;
     
     @FindBy(xpath = "//button[contains(text(),'GO TO CART')]")
     WebElement gotocart;
     
     @FindBy(css = ".next-btn.next-btn-primary.next-btn-large.checkout-order-total-button.automation-checkout-order-total-button-button")
     WebElement pay;
     
     public void fashion() throws InterruptedException, IOException {
    
    	Actions hover = new Actions(PageDriver.getCurrentDriver());
    	try {
    		if(fashion1.isDisplayed()) {
    			fashion1.click();
    			hover.moveToElement(fashion1).perform();
    			timeout();
    		} 
    	 }
    	catch(Exception e) {
    		System.out.println("Something wrong");
    	 }
	    try {
		if(fashion2.isDisplayed()) {
			//fashion2.click();
			hover.moveToElement(fashion2).perform();
			timeout();
		     } 
	      }
	    catch(Exception e) {
	      System.out.println("Something wrong");	
	    }
	    try {
		if(fashion3.isDisplayed()) {
			fashion3.click();
			//hover.moveToElement(fashion3).perform();
			timeout();

		     } 
	     }
	    catch(Exception e) {
	    	System.out.println("Something Wrong");
	 }
	    try {
		if(fashion4.isDisplayed()) {
			fashion4.click();
			timeout();
		}
	    }
	    catch(Exception e) {
          System.out.println("Something wrong");
	 }
	    try {
		if(cart.isDisplayed()) {
			cart.click();
			timeout();
	     }
	    }
	    catch(Exception e) {
	    	System.out.println("Something Wrong");
	 } 
	    
	    try {
	    	//driver.switchTo().frame(driver.findElement(By.className("login-iframe"))); 
	    	PageDriver.getCurrentDriver().switchTo().frame(PageDriver.getCurrentDriver().findElement(By.className("login-iframe")));
			    if(sendnum.isDisplayed()) {
			    sendnum.sendKeys("01644417057");
				Thread.sleep(1000);
			    }
	    }
	    catch(Exception e) {
	    	System.out.println("Something Wrong");
	    }
	        
	    try {
			    if(sendpass.isDisplayed()) {
			    sendpass.sendKeys("saima34");
				Thread.sleep(1000);
			    }
	    }
	    catch(Exception e) {
	    	System.out.println("Something Wrong");
	    }
	    
	    try {
		    if(login.isDisplayed()) {
		    login.click();
			Thread.sleep(2000);
		    }
    }
        catch(Exception e) {
    	   System.out.println("Something Wrong");
    }
	    PageDriver.getCurrentDriver().switchTo().parentFrame();
	    
	    try {
		if(gotocart.isDisplayed()) {
			gotocart.click();
			timeout();
	     }
	    }
	    catch(Exception e) {
	    	System.out.println("Something Went Wrong");
	    }
	    try {
	    	if(pay.isDisplayed()) {
	    		pay.click();
	    		Thread.sleep(5000);
	    	}
	    }
	    catch(Exception e){
	    	System.out.println("Something Went Wrong");
	    }
		PageDriver.getCurrentDriver().navigate().back();
		timeout();
		PageDriver.getCurrentDriver().navigate().back();
		timeout();
		PageDriver.getCurrentDriver().navigate().back();
		timeout();
		PageDriver.getCurrentDriver().navigate().back();
		timeout();
	 } 
   }
