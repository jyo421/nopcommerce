package noncommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public WebDriver driver;
	public Dropdown(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void day()
	{
		WebElement day=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select d=new Select(day);
		d.selectByIndex(12);
		Staticwait.staticShortWait();
	}
    public void month()
    {
		WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		Select m=new Select(month);
		m.selectByIndex(1);
		Staticwait.staticShortWait();
	}
    
    public void year() 
    {
		WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		Select y=new Select(year);
		y.selectByIndex(21);
		Staticwait.staticShortWait();
	}
    
	public void sortby()
	{
		 WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 Select sc=new Select(sortby);
		 sc.selectByIndex(2);
		 Staticwait.staticShortWait();
	}
	
	public void display()
	{
		WebElement dispaly=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select ds=new Select(dispaly);
		ds.selectByIndex(2);
		Staticwait.staticShortWait();	
	}
}
