package noncommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlightsthetittle {

	public static WebDriver driver;
	
	static By registerin = By.xpath("(//a[normalize-space()='Register'])[1]");
	By login = By.xpath("//a[normalize-space()='Log in']");
	By Computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"); 
	By Desktop =  By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
	
	public Highlightsthetittle(WebDriver driver2) {
		this.driver=driver2;
	}
//HIGHLIGHT THE REGISTER ICON
	public static void high()
	{
		WebElement reg=driver.findElement(registerin);

		if(reg.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",reg);    
		System.out.println("register icon is displayed");
		}
		else 
		{
		System.out.println("register icon is not displayed");
	    }	
	}
	//HIGHLIGHT THE LOGIN ICON
	public void login()
	{
		WebElement progress=driver.findElement(login);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("login icon is displayed");
		}
		else 
		{
		System.out.println("login icon is not displayed");
	    }
}
	//HIGHTLIGHT THE COMPUTER MODULE
	public void comupter() {
		WebElement progress=driver.findElement( Computer);
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("login icon is displayed");
		}
		else 
		{
		System.out.println("login icon is not displayed");
	    }
		
	}
	//HIGHTLIGHT THE DESKTOP MODULE
	public void desktop() {
		WebElement progress=driver.findElement(Desktop );
		if(progress.isDisplayed())
		{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    jsExecutor.executeScript("arguments[0].style.border='2px solid red'",progress);    
		System.out.println("login icon is displayed");
		}
		else 
		{
		System.out.println("login icon is not displayed");
	    }
		
	}
	


	
}