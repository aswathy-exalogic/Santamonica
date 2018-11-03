package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class SpecializationPage {
public WebDriver driver;
	
	By SpecializationLink=By.id("link-specialization");
	By NewSpecialization=By.id("specialization_new");
	
	By Specializationedudropdown=By.xpath("//span[contains(text(),'Select an education')]");
	By Specializationeduselect=By.xpath("//li[contains(text(),'Bachelor')]");
	
	By Specializationesearch=By.className("select2-search__field");
	
	By Specializationcoursedropdown=By.xpath("//span[contains(text(),'Select a course')]");
	By Specializationcourseselect=By.xpath("//li[contains(text(),'BE')]");
	
			
	By EnteringSpecializationName=By.id("specialization_name");
	
	By SpecValidfrom=By.xpath("//span[contains(text(),'Select a valid from')]");
	By SpecValidfromselect=By.xpath("//li[contains(text(),'Date of exam')]");
			
	By SpeciValidityMonths=By.xpath("//input[@id='specialization_validity']");
	
	By SpeciCalculationtype=By.xpath("//span[contains(text(),'Select calculation type')]");
	By SpeciCalculationtypeselect=By.xpath("//li[contains(text(),'Average')]");
			
	By SpecResulttype=By.xpath("//span[contains(text(),'Select a result type')]");
	By SpecResulttypeSelect=By.xpath("//li[contains(text(),'Percentage')]");
	
			
	By SpecProficiency=By.xpath("//span[@class='switch']/label/span");
	
	By ClickCreateSpecialization=By.id("specialization_create");

	public SpecializationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getSpecializationLink()
	{
		return driver.findElement(SpecializationLink);
	}

	public WebElement getSpecializationNew() {
		return driver.findElement(NewSpecialization);
	}
	
	public WebElement getSpecializationedudropdown() {
		return driver.findElement(Specializationedudropdown);
	}
	
	public WebElement getSpecializationeduselect() {
		return driver.findElement(Specializationeduselect);
	}
	
	public WebElement getSpecializationesearch() {
		return driver.findElement(Specializationesearch);
	}
	
	public WebElement getSpecializationcoursedropdown() {
		return driver.findElement(Specializationcoursedropdown);
	}
	
	public WebElement getSpecializationcourseselect() {
		return driver.findElement(Specializationcourseselect);
	}
	
	public WebElement getEnteringSpecializationName() {
		return driver.findElement(EnteringSpecializationName);
	}
	
	public WebElement getSpecValidfrom() {
		return driver.findElement(SpecValidfrom);
	}
	
	public WebElement getSpecValidfromselect() {
		return driver.findElement(SpecValidfromselect);
	}
	
	public WebElement getSpeciValidityMonths() {
		return driver.findElement(SpeciValidityMonths);
	}
	
	public WebElement getSpeciCalculationtype() {
		return driver.findElement(SpeciCalculationtype);
	}
	
	public WebElement getSpeciCalculationtypeselect() {
		return driver.findElement(SpeciCalculationtypeselect);
	}
	
	public WebElement getSpecResulttype() {
		return driver.findElement(SpecResulttype);
	}
	  
	public WebElement getSpecResulttypeSelect() {
		return driver.findElement(SpecResulttypeSelect);
	}
	
	public WebElement getSpecProficiency(){
		return driver.findElement(SpecProficiency);
	}
	
	public WebElement getClickCreateSpecialization() {
		return driver.findElement(ClickCreateSpecialization);
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
