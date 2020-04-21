package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class elementCheck {
	
	WebDriver driver;
	pageHome ph; 
	
	@BeforeTest
	public void beforeTest() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
			 ph= new pageHome(driver);
			
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void validateElementPresent() throws InterruptedException {
		
		Thread.sleep(2000);
		ph.getFirstName().sendKeys("Michael");
		ph.getLastName().sendKeys("Scott");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}

}
