package nopcommerce.stepdefinition;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;


import noncommerce.testbase.Testbase;
import noncommerce.utilities.Dropdown;
import noncommerce.utilities.Highlightsthetittle;
import noncommerce.utilities.Scrrenshots;
import nopcommerce.pageobjects.Booksmodule;
import nopcommerce.pageobjects.Computertoggle;

import nopcommerce.pageobjects.Loginpage;
import nopcommerce.pageobjects.Registrationpage;
import recordingtests.ScreenRecorderUtil;

public class Stepdefinition extends Testbase {
	WebDriver driver;
	Computertoggle comp = new Computertoggle(driver);
	
//lAUNCH THE BROWSERS
	@Given("open the browser")
	public  void open_the_browser() throws Exception {
	ScreenRecorderUtil.startRecord("open_the_browser");
		
//...................CHROME DRIVER.........................\\
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (6)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
       
//....................EDGE DRIVER.........................\\
//        System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win32 (1)\\msedgedriver.exe");
//      EdgeOptions options = new EdgeOptions();
//      options.addArguments("--remote-allow-origins=*");
//        driver = new EdgeDriver(options);
//        driver.manage().window().maximize();
        
//....................FIREFOX DRIVER.......................\\
//        System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
//        driver = new FirefoxDriver();
//         driver.manage().window().maximize();   
// 
        
//...................HEADLESS BROWSER......................\\
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
//options.addArguments("headless");
//driver = new ChromeDriver(options);
         
         

//	OpenBrowser();
//System.out.println(driver.getTitle());
}
	
//TO ENTER THE URL
@When("user enter the url {string}")
public void user_enter_the_url(String url) throws Exception 
     {
		driver.get(url);
		driver.manage().window().maximize();
		Scrrenshots.capture(driver);
		Highlightsthetittle h= new Highlightsthetittle(driver);
		Highlightsthetittle.high();       
     }
	
//METHODS CALLING ON REGISTER PAGE
	  
@Then("click on the Register")
public void click_on_the_register() throws Exception 
	{
		Registrationpage rp=new Registrationpage(driver);
		 rp.register();
		 Scrrenshots.capture(driver);
		 
    }
@When("click on the Gender")
public void click_on_the_gender() throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.gender();
		 Scrrenshots.capture(driver);
    }

@Then("Enter a Firstname  {string}")
public void enter_a_firstname(String string) throws Exception
         {
		Registrationpage rp=new Registrationpage(driver);
		 rp.firstname(string);
		 Scrrenshots.capture(driver);
            }

@When("enter a Lastname {string}")
public void enter_a_lastname(String string) throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.lastname(string);
		 Scrrenshots.capture(driver);
   }
@Then("Enter a {string}")
 public void enter_a(String string) throws Exception {
         Dropdown d= new Dropdown(driver);
	              d.day();
                  d.month();
                   d.year();
                   Scrrenshots.capture(driver);
 } 
@Then("Enter a Email {string}")
public void enter_a_email(String string) throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.mail(string);
		 Scrrenshots.capture(driver);
}
	
	@Then("Enter a company details {string}")
	public void enter_a_company_details(String string) throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.companydetails(string);
		 Scrrenshots.capture(driver);
 }

	@Then("Click on news letter\"<news letter>\"")
	public void click_on_news_letter_news_letter() throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.newsletter();
		 Scrrenshots.capture(driver);
 }

	@When("enter the Password\"<password>\"")
	public void enter_the_password_password() throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.password(null); 
		 
		  
		 Scrrenshots.capture(driver);
}

	@Then("Enter a  ConfirmPassword {string}")
	public void enter_a_confirm_password(String string) throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.confirmpassword(null);
		 Scrrenshots.capture(driver);
}

	@When("click on a Register button")
	public void click_on_a_register_button() throws Exception {
		Registrationpage rp=new Registrationpage(driver);
		 rp.registerbutton();
		 Scrrenshots.capture(driver);
	Highlightsthetittle h= new Highlightsthetittle(driver);
	     h.login();
}
	
//Methods calling the login page
	
	@Then("Click on the login component")
	public void click_on_the_login_component() throws Exception {
		Loginpage rp=new Loginpage(driver);
		 rp.login();
		 Scrrenshots.capture(driver);
}

	@When("Enter the  existing email {string}")
	public void enter_the_existing_email(String string) throws Exception {
		Loginpage rp=new Loginpage(driver);
		 rp.existingmail(string);
		 Scrrenshots.capture(driver);
}

	@Then("Enter the existing password {string}")
	public void enter_the_existing_password(String string) throws Exception {
		Loginpage rp=new Loginpage(driver);
		 rp.existingpassword(string);
		 Scrrenshots.capture(driver);
}

	@When("Click on a login button")
	public void click_on_a_login_button() throws Exception {
		Loginpage rp=new Loginpage(driver);
		 rp.loggedin();
		 Scrrenshots.capture(driver);
		 Highlightsthetittle h= new Highlightsthetittle(driver);
		 h.comupter();
}
	
//	Methods calling  the computer module

	@Then("click on a Computertoggle")
	public void click_on_a_computertoggle() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	   comp.computer();
	   Highlightsthetittle p= new Highlightsthetittle(driver);
	   p.desktop();
	   Scrrenshots.capture(driver);
	}
//DESKTOP
	@Then("click on a Desktop")
	public void click_on_a_desktop() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
		comp.demo();
		Scrrenshots.capture(driver);
		
		Dropdown d= new Dropdown(driver);
		 d.sortby();
	     d.display();
	     Scrrenshots.capture(driver);
		  
	}

	@Then("click on lenova image")
	public void click_on_lenova_image() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	  comp.image();
	  Scrrenshots.capture(driver);
	}

	@Then("click on add to cart")
	public void click_on_add_to_cart() throws IOException {
		Computertoggle comp = new Computertoggle(driver);
		comp.addtocart();
		 Scrrenshots.capture(driver);
	    	}

	@Then("click on shopping cart")
	public void click_on_shopping_cart() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	   comp.shopping();
	   Scrrenshots.capture(driver);
	}

	@Then("click on a Notebooks")
	public void click_on_a_notebooks() throws IOException {
		Computertoggle comp = new Computertoggle(driver);
		comp.notebook();
		  Scrrenshots.capture(driver);
	}

	@Then("click on applemacbook")
	public void click_on_applemacbook() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	    comp.applemac();
	    Scrrenshots.capture(driver);
	}

	@Then("click on cart")
	public void click_on_cart() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	   comp.cart();
	   Scrrenshots.capture(driver);
	}

	@Then("click on shopping")
	public void click_on_shopping() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	   comp.shopcart();
	   Scrrenshots.capture(driver);
	}

	@Then("click on software")
	public void click_on_software() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	  comp.software();
	  Scrrenshots.capture(driver);
	  
	}

	@Then("click on soundforge")
	public void click_on_soundforge() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	 comp.soundforge();
	  Scrrenshots.capture(driver);
	}

	@Then("click on cartbutton")
	public void click_on_cartbutton() throws Exception {
		Computertoggle comp = new Computertoggle(driver);
	    comp.cartbutton();
	    Scrrenshots.capture(driver);
	}

	@Then("click on shoppingbutton")
	public void click_on_shoppingbutton() throws IOException {
		Computertoggle comp = new Computertoggle(driver);
	   comp.shopbutton();
	   Scrrenshots.capture(driver);
	}

	@Then("click on a books")
	public void click_on_a_books() throws Exception {
		Booksmodule module = new Booksmodule(driver);
	  module.book();
	  Scrrenshots.capture(driver);
	  ScreenRecorderUtil.stopRecord();
	}


















































//    @Then("click on a Computertoggle")
//     public void click_on_a_computertoggle() throws Exception {
//	Computertoggle t = new Computertoggle(driver);
//	t.computer();
//	Highlightsthetittle p= new Highlightsthetittle(driver);
//     p.desktop();
//    

//	
//}
//
//   @Then("click on a Desktop")
//   public void click_on_a_desktop() throws Exception {
//	Computertoggle t = new Computertoggle(driver);
//	t.demo();
//	Scrrenshots.capture(driver);
//	
//	Dropdown d= new Dropdown(driver);
//	 d.sortby();
//     d.display();
//     Scrrenshots.capture(driver);
//	  
//    Computertoggle j = new Computertoggle(driver);
//	 j.addtocart();
//	 Scrrenshots.capture(driver);
//}
//
//   //Methods calling the bookmodule
//@Then("click on a books")
//public void click_on_a_books() throws Exception {
//	
//	 Booksmodule b= new Booksmodule(driver);
//		
//   b.book();
//	 Scrrenshots.capture(driver);
//	ScreenRecorderUtil.stopRecord();
//}
//    
//
}	


