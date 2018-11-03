package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BranchPage {
	public WebDriver driver;
//Creating the branch
	By BranchLink=By.linkText("Branch");
	By BranchNew=By.id("branch_new");
	By Branchphotoupload=By.xpath("//div[@id='branch_photo_upload']/div/input");
	By BranchName=By.id("branch_name");
	By Branchtypedropdown=By.xpath("//span[contains(text(),'Select a type')]");
	By Branchtypeselect=By.xpath("//li[contains(text(),'Associated branch')]");
	By BranchCode=By.id("branch_code" );
	By Branchdescription=By.id("branch_description");
	By Branchcurrencydropdown=By.xpath("//span[contains(text(),'Select a currency')]");
	By BranchCurrencyselect=By.xpath("//li[contains(text(),'Indian Rupee')]");
	By Branchstartdate=By.id("branch_start_date");
	By Branchdateok=By.xpath("//div/div[2]/button[@class='dtp-btn-ok btn btn-success']");
	By BranchAddress=By.id("branch_address_attributes_address");
	By BranchAddressdropdown=By.xpath("//span[contains(text(),'Select an address type')]");
	By BranchAddressSelect=By.xpath("//li[contains(text(),'Permanent')]");
	By BranchCountrydropdown=By.xpath("//span[contains(text(),'Select a country')]");
	By BranchCountrySelect=By.xpath("//li[contains(text(),'Canada')]");
	By BranchStatedropdown=By.xpath("//span[contains(text(),'Select a state')]");
	By BranchStateSelect=By.xpath("//li[contains(text(),'Ontario ')]");
	By BranchDistrictdropdown=By.xpath("//span[contains(text(),'Select a district')]");
	By BranchDistrictSelect=By.xpath("//li[contains(text(),'Ontario')]");
	By Branchcitydropdown=By.xpath("//span[contains(text(),'Select a city')]");
	By Branchcityselect=By.xpath("//li[contains(text(),'Hamilton')]");
	By BranchLandmark=By.id("branch_address_attributes_landmark");
	By Branchpostoffice=By.id("branch_address_attributes_post_office");
	By BranchPincode=By.id("branch_address_attributes_pincode");
	By BranchLatitude=By.id("branch_address_attributes_latitude");
	By BranchLogitutude=By.id("branch_address_attributes_longitude");
	By BranchTimezoneDropdown=By.xpath("//span[contains(text(),'Select a timezone')]");
	By BranchTimezoneselect=By.xpath("//li[contains(text(),'(GMT-05:00) Central Time (US and Canada)')]");
	By Branchcreate=By.id("branch_create");
	
	//Viewing the branch
	By Branchview=By.xpath("//table[@id='DataTables_Table_0']//tr[contains(., 'testing')]/td[6]/a[1]");
	
	public BranchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getBranchLink()
	{
		return driver.findElement(BranchLink);
	}
	
	public WebElement getBranchNew()
	{
		return driver.findElement(BranchNew);
	}
	
	public WebElement getBranchphotoupload()
	{
		return driver.findElement(Branchphotoupload);
	}
	
	public WebElement getBranchName()
	{
		return driver.findElement(BranchName);
	}
	
	public WebElement getBranchtypedropdown()
	{
		return driver.findElement(Branchtypedropdown);
	}
	
	public WebElement getBranchtypeselect()
	{
		return driver.findElement(Branchtypeselect);
	}
	

	public WebElement getBranchCode()
	{
		return driver.findElement(BranchCode);
	}
	
	public WebElement getBranchdescription()
	{
		return driver.findElement(Branchdescription);
	}
	
	public WebElement getBranchcurrencydropdown()
	{
		return driver.findElement(Branchcurrencydropdown);
	}
	
	public WebElement getBranchCurrencyselect()
	{
		return driver.findElement(BranchCurrencyselect);
	}
	
	public WebElement getBranchstartdate()
	{
		return driver.findElement(Branchstartdate);
	}
	
	public WebElement getBranchdateok()
	{
		return driver.findElement(Branchdateok);
	}
	
	public WebElement getBranchAddress()
	{
		return driver.findElement(BranchAddress);
	}
	
	public WebElement getBranchAddressdropdown()
	{
		return driver.findElement(BranchAddressdropdown);
	}
	
	public WebElement getBranchAddressSelect()
	{
		return driver.findElement(BranchAddressSelect);
	}
	
	public WebElement getBranchCountrydropdown()
	{
		return driver.findElement(BranchCountrydropdown);
	}
	public WebElement getBranchCountrySelect()
	{
		return driver.findElement(BranchCountrySelect);
	}
	
	public WebElement getBranchStatedropdown()
	{
		return driver.findElement(BranchStatedropdown);
	}
	
	public WebElement getBranchStateSelect()
	{
		return driver.findElement(BranchStateSelect);
	}
	
	public WebElement getBranchDistrictdropdown()
	{
		return driver.findElement(BranchDistrictdropdown);
	}
	
	public WebElement getBranchDistrictSelect()
	{
		return driver.findElement(BranchDistrictSelect);
	}
	
	public WebElement getBranchcitydropdown()
	{
		return driver.findElement(Branchcitydropdown);
	}
	
	public WebElement getBranchcityselect()
	{
		return driver.findElement(Branchcityselect);
	}
	
	public WebElement getBranchLandmark()
	{
		return driver.findElement(BranchLandmark);
	}
	public WebElement getBranchpostoffice()
	{
		return driver.findElement(Branchpostoffice);
	}
	
	public WebElement getBranchPincode()
	{
		return driver.findElement(BranchPincode);
	}
	public WebElement getBranchLatitude()
	{
		return driver.findElement(BranchLatitude);
	}
	public WebElement getBranchLogitutude()
	{
		return driver.findElement(BranchLogitutude);
	}
	public WebElement getBranchTimezoneDropdown()
	{
		return driver.findElement(BranchTimezoneDropdown);
	}
	
	public WebElement getBranchTimezoneselect()
	{
		return driver.findElement(BranchTimezoneselect);
	}
	public WebElement getBranchcreate()
	{
		return driver.findElement(Branchcreate);
	}
	public WebElement getBranchview()
	{
		return driver.findElement(Branchview);
	}
	
}
