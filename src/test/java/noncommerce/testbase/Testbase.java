package noncommerce.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import noncommerce.utilities.Xlsx_write;

public class Testbase {
	
//	public static WebDriver driver;
//	
//	static Xlsx_write read= new Xlsx_write();
//	
//
//	public static void OpenBrowser( ) throws Exception 
//{
//		
//		String browser ="chrome";
//	
//		
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			
//			ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//			//driver=new ChromeDriver();
//		}
//		
//		else if(browser.equalsIgnoreCase("Firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//			
//		}				
//	
//	driver.get(read.getUrl());
//	driver.manage().window().maximize();		
//	
//	
//}
//	public static void closeBrowser() {
//		driver.quit();
//	}
}
