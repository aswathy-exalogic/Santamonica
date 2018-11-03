package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class SpecializationComponentPage {
public WebDriver driver;
	
	By SpecializationComponentLink=By.id("link-specialization-component");
	By NewSpecializationComponent=By.id("specialization_component_new");
	By SpecComponentedudropdown=By.xpath("//span[contains(text(),'Select an education')]");
	By SpecComponenteduselect=By.xpath("//li[contains(text(),'Prerequisite')]");
	By SpecComponentcoursedropdown=By.xpath("//span[contains(text(),'Select a course')]");
	By SpecComponentcourseselect=By.xpath("//li[contains(text(),'Eng. Proficiency ')]");
	By SpecComponentSpecidropdown=By.xpath("//span[@id='select2-specialization_component_specialization_id-container']");
	By SpecComponentSpeciselect=By.xpath("//li[contains(text(),'IELTS')]");
	By EnteringSpecializationComponentName=By.id("specialization_component_name");
	By CreateSpecializationcomponent=By.id("specialization_component_create");

	public SpecializationComponentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getSpecializationComponentLink()
	{
		return driver.findElement(SpecializationComponentLink);
	}

	public WebElement getNewSpecializationComponent() {
		return driver.findElement(NewSpecializationComponent);
	}
	
	public WebElement getSpecComponentedudropdown() {
		return driver.findElement(SpecComponentedudropdown);
	}
	
	public WebElement getSpecComponenteduselect(){
		return driver.findElement(SpecComponenteduselect);
	}
	
	public WebElement getSpecComponentcoursedropdown() {
		return driver.findElement(SpecComponentcoursedropdown);
	}
	
	public WebElement getSpecComponentcourseselect() {
		return driver.findElement(SpecComponentcourseselect);
	}
	
	public WebElement getSpecComponentSpecidropdown() {
		return driver.findElement(SpecComponentSpecidropdown);
	}
	
	public WebElement getSpecComponentSpeciselect() {
		return driver.findElement(SpecComponentSpeciselect);
	}
	
	public WebElement getEnteringSpecializationComponentName() {
		return driver.findElement(EnteringSpecializationComponentName);
	}
	
	public WebElement getCreateSpecializationcomponent() {
		return driver.findElement(CreateSpecializationcomponent);
	}
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
