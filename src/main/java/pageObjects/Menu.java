package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
public WebDriver driver;
	
By Setup=By.linkText("Setup");
By Academic=By.linkText("Academics");

	public Menu(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getsetup()
	{
		return driver.findElement(Setup);
	}

	public WebElement getAcademic() {
		return driver.findElement(Academic);
	}
	}
	

