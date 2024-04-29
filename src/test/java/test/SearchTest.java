package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.SearchPage;

public class SearchTest extends BaseDriver{
	   @BeforeClass
	   public void openUrl() {
		   PageDriver.getCurrentDriver().manage().window().maximize(); 
	       PageDriver.getCurrentDriver().get(url);
}
	   @Test(priority=1)
	   public void SearchPage() throws InterruptedException, IOException {
		   SearchPage search = new SearchPage();
		   search.check();
	   }
}
