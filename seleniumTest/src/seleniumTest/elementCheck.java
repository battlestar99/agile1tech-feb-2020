package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementCheck {

	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		pageHome ph= new pageHome(driver);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		ph.getFirstName().sendKeys("Michael");
		ph.getLastName().sendKeys("Jackson");
		
		Thread.sleep(1000);
         
		
		
		Thread.sleep(1000);
		
		ph.getFirstName().clear();
		
		ph.getLastName().clear();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
