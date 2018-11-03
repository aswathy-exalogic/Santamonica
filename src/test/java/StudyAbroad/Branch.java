package StudyAbroad;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.BranchPage;
import pageObjects.Menu;
import resources.base;

public class Branch extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	
	 @BeforeTest
	 public void initialize() throws IOException, InterruptedException
	 {

	 	 driver =initilizeDriver();
	 	 log.info("Driver is initialized");
	 	 driver.get(prop.getProperty("url"));
	 	 log.info("Navigated to validateEducation page");
	 	longinTest();
		log.info("LoggedIn successfully");
		Thread.sleep(2000);
		Menu mn=new Menu(driver);
	    log.info("Clicking on Setup");
	    mn.getsetup().click();
	    Thread.sleep(2000);
	    BranchPage Bp=new BranchPage(driver);
	    Bp.getBranchLink().click();
	    Thread.sleep(2000);
	 }
	 @Test(priority = 1, enabled=true)
		public void CreateBranch() throws IOException, InterruptedException
		{
	    
	    BranchPage Bp=new BranchPage(driver);
	    Bp.getBranchNew().click();
	    Thread.sleep(2000);
	    Bp.getBranchphotoupload().sendKeys("C:\\Users\\Aswathy\\Pictures\\Screenshots\\New folder\\T1.png");
	    Thread.sleep(2000);
	    Bp.getBranchName().sendKeys("testing");
	    Thread.sleep(2000);
	    Bp.getBranchtypedropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchtypeselect().click();
	    Thread.sleep(2000);
	    Bp.getBranchCode().sendKeys("AB123");
	    Thread.sleep(2000);
	    Bp.getBranchdescription().sendKeys("testing 1 decription");
	    Thread.sleep(2000);
	    Bp.getBranchcurrencydropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchCurrencyselect().click();
	    Thread.sleep(2000);
	    Bp.getBranchstartdate().click();
	    List<WebElement> dates=driver.findElements(By.className("dtp-select-day"));
	    int count =driver.findElements(By.className("dtp-select-day")).size();

	    for(int i=0;i<count;i++)
	    {
	    String text=driver.findElements(By.className("dtp-select-day")).get(i).getText();
	    if(text.equalsIgnoreCase("21"))
	    {
	    driver.findElements(By.className("dtp-select-day")).get(i).click();
	    Thread.sleep(2000);
	    Bp.getBranchdateok().click();
	    Thread.sleep(2000);
	    break;
	    }}
	    Bp.getBranchAddress().sendKeys("Address 1");
	    Thread.sleep(2000);
	    Bp.getBranchAddressdropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchAddressSelect().click();
	    Thread.sleep(2000);
	    Bp.getBranchCountrydropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchCountrySelect().click();
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(2000);
	    Bp.getBranchStatedropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchStateSelect().click();
	    Thread.sleep(2000);
	    Bp.getBranchDistrictdropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchDistrictSelect().click();
	    Thread.sleep(2000);
	    Bp.getBranchcitydropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchcityselect().click();
	    Thread.sleep(2000);
	    Bp.getBranchLandmark().sendKeys("Landmark 1");
	    Thread.sleep(2000);
	    Bp.getBranchpostoffice().sendKeys("Post1");
	    Thread.sleep(2000);
	    Bp.getBranchPincode().sendKeys("A1B1C1");
	    Thread.sleep(2000);
	    Bp.getBranchLatitude().sendKeys("13");
	    Thread.sleep(2000);
	    Bp.getBranchLogitutude().sendKeys("77");
	    Thread.sleep(2000);
	    Bp.getBranchTimezoneDropdown().click();
	    Thread.sleep(2000);
	    Bp.getBranchTimezoneselect().click();
	    Thread.sleep(2000);
	    Bp.getBranchcreate().click();
	    Thread.sleep(2000);
	      
}
	 @Test(priority = 2, enabled=true)
	 public void viewbranch() throws InterruptedException {
		 BranchPage Bp=new BranchPage(driver);
		   Bp.getBranchview().click(); 
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
		    driver.findElement(By.linkText("Branches"));
	 }
	 }
