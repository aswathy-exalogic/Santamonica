package StudyAbroad;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.util.Asserts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.EducationPage;
import pageObjects.Menu;
import resources.base;

public class Education extends base{
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
    
    log.info("Clicking on Academic");
    mn.getAcademic().click();
    Thread.sleep(2000);
    
   EducationPage ed=new EducationPage(driver);
   log.info("Clicking on Education");
   ed.getEducation().click();
  Thread.sleep(2000);
  
  log.info("Clicking on Education new");
   ed.getnewEducation().click();
   Thread.sleep(2000);
   
   log.info("Entering the education");
   ed.getEnterEducation().sendKeys("Testing1");
   Thread.sleep(2000);
   
   log.info("Clicking on createEducationbutton");
   ed.getClickcreateeducation().click();
  Thread.sleep(2000);
 log.info("Successfully created education");
		
		 WebElement msg1=ed.getEduCreatedSuccessfulmg();
		   String text1=msg1.getText();
		    System.out.println(text1);
		String expectedText1 = "Education created successfully";
	    assertEquals(text1,expectedText1);
	    log.info("Education created Successfully , toaster message is shown");
		Thread.sleep(2000);	 
		
		
}

@Test
public void editeducation() throws InterruptedException {
	 EducationPage ed=new EducationPage(driver);
	 log.info("Clicking on Edit Education button");
	 ed.getEditEducation().click();
	 Thread.sleep(2000);
	 ed.getEditEduName().clear();
	 Thread.sleep(2000);
	 log.info("updating the Education field");
	 ed.getEditEduName().sendKeys("Testing2");
	 Thread.sleep(2000);
	 log.info("Clicking on updateEducation button");
	 ed.getClickupdateedu().click();
	 
	 
	 
	  WebElement msg2=ed.getClickupdateedu();
	   String text2=msg2.getText();
	    System.out.println(text2);
	//String expectedText2 = "Education updated successfully";
	    String expectedText2 = "Update";
   assertEquals(text2,expectedText2);
   log.info("Education updated Successfully ,Toaster msg is shown");
	Thread.sleep(2000);
}



@Test(dependsOnMethods= {"editeducation"},alwaysRun=true)
public void deleteeducation() throws InterruptedException {
	 EducationPage ed=new EducationPage(driver);
	 Thread.sleep(2000);
	 log.info("Clicking on delete education button");
	 ed.getClickdeleteedu().click();
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
	 WebElement msg3=ed.getEdudeletedSuccessfulmsg();
	   String text3=msg3.getText();
	    System.out.println(text3);
	String expectedText3 = "Education deleted successfully";
  assertEquals(text3,expectedText3);
  log.info("Education deleted Successfully ,toaster msg is shown");
	Thread.sleep(2000);
	}

@AfterTest
public void teardown()
{
	
	driver.close();
	driver=null;
	
}
}

