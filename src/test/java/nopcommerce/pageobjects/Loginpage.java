package nopcommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.netty.util.Constant;
import noncommerce.utilities.Staticwait;
import noncommerce.utilities.Xlsx_write;
import nopcommerce.constant.Constantpage;

public class Loginpage {
 public WebDriver driver;
  Xlsx_write x = new Xlsx_write();

 //constructor
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

//LOCATORS
	By login = By.xpath("//a[normalize-space()='Log in']");
	By exmail = By.xpath("//input[@id='Email']");
	By expassword = By.xpath("//input[@id='Password']");
	By logout = By.xpath("//button[normalize-space()='Log in']");
	
//METHODS	
	public void login()
     {
		
     driver.findElement(login).click();	
     Staticwait.staticShortWait();
     }
	
	public void existingmail(String exiemail) throws Exception
	 {
		driver.findElement(exmail).sendKeys(x.getpreemail());	
		Staticwait.staticShortWait();
	 }
	
	public void existingpassword(String exipassword) throws Exception
	 {
		driver.findElement(expassword).sendKeys(x.getprepassword());
		Staticwait.staticShortWait();
	 }
	
	public   void loggedin()
	 {
		driver.findElement(logout).click();	   
	 }
}
