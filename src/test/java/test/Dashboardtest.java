package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Dashboard;


public class Dashboardtest extends BaseDriver{
     
	   @BeforeClass
	   public void openUrl() {
		   PageDriver.getCurrentDriver().manage().window().maximize(); 
	       PageDriver.getCurrentDriver().get(url);
}
	   @Test(priority = 0)
	   public void Dashboard() throws InterruptedException, IOException {
		   Dashboard th = new Dashboard();
		   th.fashion();
	   }
}
