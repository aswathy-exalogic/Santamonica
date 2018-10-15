package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class EducationPage extends base  {
public WebDriver driver;
	By Education=By.linkText("Education");
	By EducationNew=By.id("education_new");
	By EnterEducation=By.id("education_name");
	By Clickcreateeducation=By.id("education_create");
	By Editeducation=By.xpath("//table[@id='DataTables_Table_1']//tr[contains(., 'Testing1')]/td[2]/a[1]");
	By EditEduName=By.id("education_name");
	By Clickupdateedu=By.id("education_update");
	By Clickdeleteedu=By.xpath("//table[@id='DataTables_Table_2']//tr[contains(., 'Testing2')]/td[2]/a[2]");

	public EducationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getEducation() {
		return driver.findElement(Education);
	}
	
	public WebElement getnewEducation() {
		return driver.findElement(EducationNew);
	}
	
	public WebElement getEnterEducation() {
		return driver.findElement(EnterEducation);
	}
	public WebElement getClickcreateeducation() {
		return driver.findElement(Clickcreateeducation);
	}
	public WebElement getEditEducation() {
		return driver.findElement(Editeducation);
	}
	public WebElement getEditEduName() {
		return driver.findElement(EditEduName);
	}
	public WebElement getClickupdateedu() {
	return driver.findElement(Clickupdateedu);}
	
	public WebElement getClickdeleteedu() {
		return driver.findElement(Clickdeleteedu);
	
}}
	
