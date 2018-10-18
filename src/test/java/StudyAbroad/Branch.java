package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Menu;
import resources.base;

public class Branch extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @BeforeTest
	 public void initialize() throws IOException
	 {

	 	 driver =initilizeDriver();
	 	 log.info("Driver is initialized");
	 	 driver.get(prop.getProperty("url"));
	 	 log.info("Navigated to validateEducation page");
	 }
	 @Test	
		public void CreateEducation() throws IOException, InterruptedException
		{
		longinTest();
		log.info("LoggedIn successfully");
		Thread.sleep(2000);
		
	    Menu mn=new Menu(driver);
	    log.info("Clicking on Setup");
	    mn.getsetup().click();
	    Thread.sleep(2000);
}
	 }
