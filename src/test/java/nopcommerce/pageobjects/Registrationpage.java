package nopcommerce.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import freemarker.template.utility.Constants;
import noncommerce.utilities.Staticwait;
import noncommerce.utilities.Xlsx_write;
import nopcommerce.constant.Constantpage;

public class Registrationpage {
WebDriver driver;
Staticwait u = new Staticwait();
Xlsx_write x = new Xlsx_write();

//constructor
	public Registrationpage(WebDriver driver)
	{
		 this.driver=driver;
	}

//locators
	By registerin = By.xpath("(//a[normalize-space()='Register'])[1]");
	By gender = By.xpath("//input[@id='gender-female']");
	By firstname=By.xpath("//input[@id='FirstName']");
	By lastname = By.xpath("//input[@id='LastName']");
	By Email = By.xpath("//input[@id='Email']");
	By companydetails=By.xpath("//input[@id='Company']");
	By password = By.xpath("//input[@id='Password']");
	By confirmpassword =By.xpath("//input[@id='ConfirmPassword']");
	By registerout = By.xpath("//button[@id='register-button']");
	
//methods
	public void register()
	{
		driver.findElement(registerin).click();	
		Staticwait.staticShortWait();
	}
	public   void gender()
	 {
		driver.findElement(gender).click();
		Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement(gender).isSelected());
        System.out.println(driver.findElement(gender).isSelected());
	 }
	public   void firstname(String fsname) throws Exception
	{
		driver.findElement(firstname).sendKeys(x.getFirstname());
		Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement(firstname).isEnabled());
		System.out.println(driver.findElement(firstname).isEnabled());
	}
	public   void lastname(String lsname) throws Exception
	{
	   driver.findElement(lastname).sendKeys(x.getLastname());
	   Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement(lastname).isEnabled());
		System.out.println(driver.findElement(lastname).isEnabled());
	}

	public   void mail(String email) throws Exception
	{
		driver.findElement(Email).sendKeys(x.getEmail());
		Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement(Email).isEnabled());
        System.out.println(driver.findElement(Email).isEnabled());
	}
	
	public   void companydetails(String comdetails) throws Exception
	{
        driver.findElement(companydetails).sendKeys(x.getCompanyname());
        Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement(companydetails).isEnabled());
        System.out.println(driver.findElement(companydetails).isEnabled());
	}
	
	public   void newsletter()
	{
		driver.findElement(By.id("Newsletter")).click();	   
	}
	public   void password(String pwd) throws Exception
	{
        driver.findElement( password).sendKeys(x.getpassword());
        Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement( password).isEnabled());
        System.out.println(driver.findElement( password).isEnabled());
		}
	public   void confirmpassword(String confpwd) throws Exception
	{
	
		driver.findElement(confirmpassword).sendKeys(x.getconformpassword());
		Staticwait.staticShortWait();
		Assert.assertTrue(driver.findElement(confirmpassword).isEnabled());
		System.out.println(driver.findElement(confirmpassword).isEnabled());
	}
	public   void registerbutton()
	{
		driver.findElement(registerout).click();	
		
	}
	
}
