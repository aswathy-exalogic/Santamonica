package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CoursePage;
import pageObjects.Menu;
import pageObjects.SpecializationComponentPage;
import resources.base;

public class specializationcomponent extends base{
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
		    mn.getAcademic().click();
		    Thread.sleep(2000);
	       SpecializationComponentPage spc=new SpecializationComponentPage(driver);
	       spc.getSpecializationComponentLink().click();
	       Thread.sleep(2000);
	}
	@Test	
		public void Createspecializationcomponent() throws IOException, InterruptedException
		{
       SpecializationComponentPage spc=new SpecializationComponentPage(driver);
       spc.getNewSpecializationComponent().click();
       Thread.sleep(2000);
       spc.getSpecComponentedudropdown().click();
       Thread.sleep(2000);
       spc.getSpecComponenteduselect().click();
       Thread.sleep(2000);
       spc.getSpecComponentcoursedropdown().click();
       Thread.sleep(2000);
       spc.getSpecComponentcourseselect().click();
       Thread.sleep(2000);
       spc.getSpecComponentSpecidropdown().click();
       Thread.sleep(2000);
       spc.getSpecComponentSpeciselect().click();
       Thread.sleep(2000);
       spc.getEnteringSpecializationComponentName().sendKeys("Testing1");
       Thread.sleep(2000);
       spc.getCreateSpecializationcomponent().click();
       Thread.sleep(2000);
       
}
}