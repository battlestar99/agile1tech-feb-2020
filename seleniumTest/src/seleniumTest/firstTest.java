package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		// webdriver object is an instance of the browser 
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver1.get("https://www.yahoo.com/");
		
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		Thread.sleep(1000);
		
		driver1.quit();
		

	}

}
