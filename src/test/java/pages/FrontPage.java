package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utility.CommonMethods;

public class FrontPage extends CommonMethods{
      public FrontPage() {
    	  PageFactory.initElements(PageDriver.getCurrentDriver(), this);
      }
      
      @FindBys({
    	  @FindBy(xpath = "//a[text()='Best Price Guaranteed']"),
    	  @FindBy(xpath = "//a[contains(text(),'Best Price Guaranteed')]")
      })
      WebElement best;
      
      @FindBy(xpath = "//body/section[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
      WebElement cancel;
      
      @FindBy(xpath = "//a[contains(text(),'Returns Policy')]")
      WebElement policy;
      
      @FindBy(xpath = "//a[contains(text(),'Fashion')]")
      WebElement fashion;
      
      public void front() throws InterruptedException {
    	  try {
    		  if(best.isDisplayed()) {
    			  best.click();
    			  timeout();
    		  }
    	  }
    	  catch(Exception e){
    		  System.out.println("Something went wrong");
    	  }
    	  
    	  try {
    		  if(cancel.isDisplayed()) {
    			  cancel.click();
    			  timeout();
    		  }
    	  }
    	  catch(Exception e){
    		  System.out.println("Something went wrong");
    	  }
    	  
    	  try {
    		  if(policy.isDisplayed()) {
    			  policy.click();
    			  timeout();
    		  }
    	  }
    	  catch(Exception e){
    		  System.out.println("Something went wrong");
    	  }
    	  
    	  try {
    		  if(fashion.isDisplayed()) {
    			  fashion.click();
    			  timeout();
    		  }
    	  }
    	  catch(Exception e){
    		  System.out.println("Something went wrong");
    	  }
    	  
  		PageDriver.getCurrentDriver().navigate().back();
  		timeout();
  		PageDriver.getCurrentDriver().navigate().back();
  		timeout();
  		PageDriver.getCurrentDriver().navigate().back();
  		timeout();
      }
}
