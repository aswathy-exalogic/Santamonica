package StudyAbroad;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
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
	Thread.sleep(2000);
    Menu mn=new Menu(driver);
    mn.getsetup().click();
    Thread.sleep(2000);
    mn.getAcademic().click();
    Thread.sleep(2000);
   EducationPage ed=new EducationPage(driver);
   ed.getEducation().click();
   Thread.sleep(2000);
   ed.getnewEducation().click();
   Thread.sleep(2000);
   ed.getEnterEducation().sendKeys("Testing1");
   Thread.sleep(2000);
   ed.getClickcreateeducation().click();
  Thread.sleep(2000);
 log.info("Successfully created education");
		 log.info("Test Completed");
}
@Test
public void editeducation() throws InterruptedException {
	 EducationPage ed=new EducationPage(driver);
	 ed.getEditEducation().click();
	 Thread.sleep(2000);
	 ed.getEditEduName().clear();
	 Thread.sleep(2000);
	 ed.getEditEduName().sendKeys("Testing2");
	 Thread.sleep(2000);
	 ed.getClickupdateedu().click();
}

@Test(dependsOnMethods= {"editeducation"},alwaysRun=true)
public void deleteeducation() throws InterruptedException {
	 EducationPage ed=new EducationPage(driver);
	 Thread.sleep(2000);
	 ed.getClickdeleteedu().click();
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
}

//@AfterTest
//public void teardown()
//{
//	
//	driver.close();
//	//driver=null;
//	
//}
}

