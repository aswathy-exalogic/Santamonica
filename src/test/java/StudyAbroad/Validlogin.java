package StudyAbroad;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class Validlogin extends base {
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initilizeDriver();
	}
	

}
