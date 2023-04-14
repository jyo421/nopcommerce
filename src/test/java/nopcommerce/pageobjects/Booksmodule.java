package nopcommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import noncommerce.utilities.Staticwait;

public class Booksmodule {

	public WebDriver driver;
	
//LOCATORS
	By Books = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
	By addtocart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
	By add=By.xpath("//a[normalize-space()='shopping cart']");
	

	public Booksmodule(WebDriver driver) {
		this.driver=driver;
	}

//METHODS
	public void book() {
		driver.findElement(Books).click();
		Staticwait.staticShortWait();
		driver.findElement(addtocart).click();
		Staticwait.staticShortWait();
		driver.findElement(add).click();
		Staticwait.staticShortWait();
		
	}
	
	
	
	
}
