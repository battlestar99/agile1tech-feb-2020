package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		String currentUrl = driver.getCurrentUrl();
		
		String currentTitle = driver.getTitle();
		
		System.out.println(currentUrl);
		System.out.println(currentTitle);
		
		WebElement messangerLink = driver.findElement(By.linkText("Messenger"));
		
		WebElement liteLink = driver.findElement(By.linkText("Facebook Lite"));
		
		String text = messangerLink.getText();
		
		String textOne=liteLink.getText();
		
		System.out.println(text);
		
		liteLink.click();
		
		String liteUrl = driver.getCurrentUrl(); 
		String liteTitle = driver.getTitle();
		System.out.println(liteUrl);
		System.out.println(liteTitle );
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
