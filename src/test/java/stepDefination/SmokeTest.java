package stepDefination;

//import cucumber.api.PendingException;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {
	
	WebDriver d;
	
	
	
	@Before
	public void setup() throws IOException
	{
		/*java.io.InputStream is = this.getClass().getResourceAsStream("my.properties");
		java.util.Properties p = new Properties();
		p.load(is);*/
		String browser=System.getProperty("BROWSER");

		System.out.println("value of browser:-"+browser);
		if(browser.contains("Chrome"))
		{
			
		 System.setProperty("webdriver.gecko.driver", "..//com.learnautomation.cucumber//geckodriver.exe");
//		  d=new ChromeDriver();
		}
//		  
		  else
		{
			System.out.println("Test is in else condition");
		}
//		  else
			  
			 
		  //d=new FirefoxDriver();
			  
	}
	
	@Given("^Open FF and start application$")
	public void open_FF_and_start_application() throws Throwable {
		
		 
	    d.get("http://live.guru99.com/index.php/");
	    System.out.println("One");
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

//	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
//	public void i_enter_valid_email_and_valid_password(String username, String password) throws Throwable {
//	
//		d.findElement(By.cssSelector("a.skip-link.skip-account > span.label")).click();
//		d.findElement(By.cssSelector("#header-account>div>ul>Li")).click();
//		d.findElement(By.id("email")).sendKeys(username);
//		
//		
//	  System.out.println("Two");
//	}
	
	
	//@When("^I enter valid '(.+)' and valid '(.+)'$")
	@When("^I enter valid username(\\d+) and valid password(\\d+)$")
	public void i_enter_valid_username_and_valid_password1(String username, String pass) throws Throwable {
		
		d.findElement(By.cssSelector("a.skip-link.skip-account > span.label")).click();
		d.findElement(By.cssSelector("#header-account>div>ul>Li")).click();
		d.findElement(By.id("email")).sendKeys(username);
		
		
	  System.out.println("Two");
		
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		System.out.println("Logout");
		d.quit();
		//Assert.assertEquals("Sign-on: Mercury Tours", d.getTitle(),"Logout Just did not happen :)");
	   
	}


}
