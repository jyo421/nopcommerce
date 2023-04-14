package nopcommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import noncommerce.utilities.Staticwait;

public class Computertoggle {

WebDriver driver;
	


	
	
//locators
	
	By Computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
	By Desktop =  By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
	By Addtocart=By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
	By Shoppingcart=By.xpath("//a[normalize-space()='shopping cart']");
	By termeofservice=By.xpath("//input[@id='termsofservice']");
	By checkout=By.xpath("//button[@id='checkout']");
	By Computer1=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
	By Notebooks=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']");
	By addtocart1=By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
	By addto =By.xpath("//button[@id='add-to-cart-button-4']");
	By shooping=By.xpath("//a[normalize-space()='shopping cart']");
	By termsofservice1=By.xpath("//input[@id='termsofservice']");
	By checkout1=By.xpath("//button[@id='checkout']");
	By Computer2=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
	By Software=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']");
	By addtocart2= By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
	By shoopingcart=By.xpath("//a[normalize-space()='shopping cart']");
	By termsofservice3=By.xpath("//input[@id='termsofservice']");
	By checkout3=By.xpath("(//button[normalize-space()='Checkout'])[1]");	
	
	
//CONSTRUCTOR
public Computertoggle(WebDriver driver2) {
		this.driver=driver2;
	}
//METHODS
     public void computer() {
     	Actions a1 = new Actions(driver);
		WebElement mainMenu = driver.findElement(Computer);
		a1.moveToElement(mainMenu).build().perform();
		Staticwait.staticShortWait();
		}
	public void demo() {
		driver.findElement( Desktop).click();
		Staticwait.staticShortWait();
         }
	public void image() {
		driver.findElement(Addtocart).click();	
		Staticwait.staticShortWait();
		}
	public void addtocart() 
	{
		driver.findElement(Addtocart).click();	
		Staticwait.staticShortWait();
	     }
    public void shopping() 
    {
		driver.findElement(Shoppingcart).click();
		Staticwait.staticShortWait();
		driver.findElement(termeofservice).click();
		Staticwait.staticShortWait();
		driver.findElement(checkout).click();
		Staticwait.staticShortWait();
		}
	public void notebook() 
	{
			Actions a1 = new Actions(driver);
			WebElement mainMenu = driver.findElement(Computer1);
			a1.moveToElement(mainMenu).build().perform();
			Staticwait.staticShortWait();
			driver.findElement(Notebooks).click();
			Staticwait.staticShortWait();
		}
	public void applemac() 
	{
			driver.findElement( addtocart1).click();
			Staticwait.staticShortWait();
			
		}
	public void cart() {
			driver.findElement(addto).click();
			Staticwait.staticShortWait();
			}
	public void shopcart() {
			driver.findElement(shooping).click();
			Staticwait.staticShortWait();
			driver.findElement(termsofservice1).click();
			Staticwait.staticShortWait();
			driver.findElement(checkout1).click();
			}
	public void software() {
			Actions a2 = new Actions(driver);
			WebElement main = driver.findElement(Computer2);
			a2.moveToElement(main).build().perform();
			Staticwait.staticShortWait();
			driver.findElement(Software).click();
			Staticwait.staticShortWait();
		}
	public void soundforge() {
			}
	public void cartbutton() {
			driver.findElement(addtocart2).click();
			Staticwait.staticShortWait();
			}
	public void shopbutton() {
			driver.findElement(shoopingcart).click();
			Staticwait.staticShortWait();
			driver.findElement(termsofservice3).click();
			Staticwait.staticShortWait();
			driver.findElement(checkout3).click();
			}
	
}
	
	
	
