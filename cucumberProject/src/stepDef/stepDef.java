package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.pageHome;


public class stepDef {
	
	WebDriver driver;
	pageHome ph;
	
	@Given("^user is in the login page$")
	public void user_is_in_the_login_page() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			 ph= new pageHome(driver);
			
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^user is on the signup page$")
	public void user_is_on_the_signup_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 ph= new pageHome(driver);
		
		driver.get("https://www.facebook.com/lite/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		
		ph.getUserName().sendKeys("test1234");
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password1234");
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		
		String actualValue = loginbutton.getText();
		String expectedValue = "login";
		//Assert.assertEquals(expectedValue, actualValue);
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		System.out.println("I am in then for step def");
	}
	
	@Then("^user should see the login page$")
	public void user_should_see_the_login_page() throws Throwable {
		System.out.println("user should be in the login page");
	  
	}
	
	
	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("dfdajfladj");
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		ph.getUserName().sendKeys("dlkjfdf");
	}

	@Then("^user should not be able to logged in$")
	public void user_should_not_be_able_to_logged_in() throws Throwable {
		System.out.println("user shoule not be able to logged in");
	}

	@Then("^user should stay in the same page$")
	public void user_should_stay_in_the_same_page() throws Throwable {
		System.out.println("user shoule stay at the same page");
	}
	
	
	@Then("^user should be able to close the browser$")
	public void user_should_be_able_to_close_the_browser() throws Throwable {
	   driver.quit();
	}




}
