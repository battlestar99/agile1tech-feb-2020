package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class instragramTest {
	
	
	
	WebDriver driver; 
	
	
	@BeforeTest
	public void beforeTest() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.instagram.com/accounts/emailsignup/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}
	
	
	@Parameters({"mobile","fullname","username","password"})
	@Test
	public void instaSignup(String mobile, String fullname, String username, String password) {
		
		WebElement mobile1= driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[3]/div/label/input")); 
		mobile1.sendKeys(mobile);
		WebElement fullname1= driver.findElement(By.name("fullName"));  
		fullname1.sendKeys(fullname);
		WebElement username1= driver.findElement(By.name("username"));  
		username1.sendKeys(username);
		WebElement password1= driver.findElement(By.name("password"));  
		password1.sendKeys(password);
		
	}
	
	

}
