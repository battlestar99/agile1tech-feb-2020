package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookTest {

	public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_m")).sendKeys("Michael");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Johnson");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("john@gmail.com");
		
		Thread.sleep(1000);
		
		email.clear();
		
		
		
		Thread.sleep(1000);
		
		String x = driver.getCurrentUrl();
		String y = driver.getTitle();
		
		System.out.println(x);
		System.out.println(y); 
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
