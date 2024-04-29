package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utility.CommonMethods;

public class SearchPage extends CommonMethods{
     public SearchPage() {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
     }
     
     @FindBy(xpath = "//input[@id='q']")
     WebElement search;
     
     @FindBy(xpath = "//button[contains(text(),'SEARCH')]")
     WebElement entersearch;
     
     public void check() throws InterruptedException, IOException{
    	 try {
    		 if(search.isDisplayed()) {
    			 search.sendKeys("saree");
    			 timeout();
    		 }
    	 }
    	 catch(Exception e) {
    		 System.out.println("Something went Wrong");
    	 }
    	 
    	 try {
    		 if(entersearch.isDisplayed()) {
    			 entersearch.click();
    			 timeout();
    		 }
    	 }
    	 catch(Exception e) {
    		 System.out.println("Something went Wrong");
    	 }
 		PageDriver.getCurrentDriver().navigate().back();
 		timeout();
     }
}
