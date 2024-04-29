package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.FrontPage;

public class FrontPageTest extends BaseDriver{
	   @BeforeClass
	   public void openUrl() {
		   PageDriver.getCurrentDriver().manage().window().maximize(); 
	       PageDriver.getCurrentDriver().get(url);
}
	   @Test(priority = 2)
	   public void FrontPage() throws InterruptedException, IOException {
		   FrontPage th = new FrontPage();
		   th.front();
	   }
}
