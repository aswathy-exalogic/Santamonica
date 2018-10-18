package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CoursePage;
import pageObjects.Menu;
import resources.base;

public class Course extends base{
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
		public void CreateCourse() throws IOException, InterruptedException
		{
		longinTest();
		log.info("LoggedIn successfully");
		Thread.sleep(2000);
		
	    Menu mn=new Menu(driver);
	    log.info("Clicking on Setup");
	    mn.getsetup().click();
	    Thread.sleep(2000);
	    mn.getAcademic().click();
	    Thread.sleep(2000);
       CoursePage cp=new CoursePage(driver);
       cp.getCourseLink().click();
       Thread.sleep(2000);
       cp.getCourseNew().click();
       Thread.sleep(2000);
       Select s=new Select(cp.getSelectedudropdown());
       s.selectByValue("1");
       Thread.sleep(2000);
       cp.getEnteringCourseName().sendKeys("Testing1");
       Thread.sleep(2000);
       cp.getProficiency().click();
       Thread.sleep(2000);
       cp.getClickoncourse().click();
       Thread.sleep(2000);
}
}