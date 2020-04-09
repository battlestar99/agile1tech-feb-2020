package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementCheck {

	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		Thread.sleep(1000);
         
		firstName.sendKeys("Michael");
		
		lastName.sendKeys("Jackson");
		
		Thread.sleep(1000);
		
		firstName.clear();
		
		lastName.clear();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
