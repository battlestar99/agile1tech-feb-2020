package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.pageHome;
import pages.yahooPage;


public class stepDef {
	
	WebDriver driver;
	pageHome ph;
	yahooPage yp; 
	
	@Before
	public void beforefeature() {
		
		System.out.println("this is before hook");
		
	}
	
	@After
	public void afterFeature() {
		
		System.out.println("this is after hook");
		
	}
	
	
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
		Assert.assertEquals("test","test12");
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






//-----------------------------------------------------------------------


@Given("^user is in the yahoo sign up page$")
public void user_is_in_the_yahoo_sign_up_page() throws Throwable {
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	 ph= new pageHome(driver);
	 yp = new yahooPage(driver);
	 
	driver.get("https://login.yahoo.com/account/create");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^user enters firstname \"([^\"]*)\" in yahoo page$")
public void user_enters_firstname_in_yahoo_page(String arg1) throws Throwable {
    
	//WebElement firstname = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")); 
	
	//firstname.sendKeys(arg1);
	
	yp.getFirstName().sendKeys(arg1);
}

@When("^user enters lastname \"([^\"]*)\" in yahoo page$")
public void user_enters_lastname_in_yahoo_page(String arg1) throws Throwable {
WebElement lastName = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]")); 
	
	lastName.sendKeys(arg1);
}

@When("^user enters email address\"([^\"]*)\" in yahoo page$")
public void user_enters_email_address_in_yahoo_page(String arg1) throws Throwable {
WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")); 
	
	email.sendKeys(arg1);
}

@When("^user enters password \"([^\"]*)\"in yahoo page$")
public void user_enters_password_in_yahoo_page(String arg1) throws Throwable {
WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")); 
	
	password.sendKeys(arg1);
}

@Then("^user should be able to create an yahoo account$")
public void user_should_be_able_to_create_an_yahoo_account() throws Throwable {
  
	driver.quit();
}

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

@Given("^user is in the instragram sign up page$")
public void user_is_in_the_instragram_sign_up_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	 ph= new pageHome(driver);
	 yp = new yahooPage(driver);
	 
	driver.get("https://www.instagram.com/accounts/emailsignup/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^user enters mobile number  \"([^\"]*)\" in instra page$")
public void user_enters_mobile_number_in_instra_page(String arg1) throws Throwable {
	WebElement mobile= driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[3]/div/label/input")); 
	mobile.sendKeys(arg1);
	
}

@When("^user enters full Name \"([^\"]*)\" in instra page$")
public void user_enters_full_Name_in_instra_page(String arg1) throws Throwable {
	WebElement fullname= driver.findElement(By.name("fullName"));  
	fullname.sendKeys(arg1);
}

@When("^user enters username \"([^\"]*)\" in instra page$")
public void user_enters_username_in_instra_page(String arg1) throws Throwable {
	WebElement username= driver.findElement(By.name("username"));  
	username.sendKeys(arg1);
}

@When("^user enters password \"([^\"]*)\"in instra page$")
public void user_enters_password_in_instra_page(String arg1) throws Throwable {
	WebElement password= driver.findElement(By.name("password"));  
	password.sendKeys(arg1);
}

@Then("^user should be able to create an instragram account$")
public void user_should_be_able_to_create_an_instragram_account() throws Throwable {
   driver.quit();
}




}










