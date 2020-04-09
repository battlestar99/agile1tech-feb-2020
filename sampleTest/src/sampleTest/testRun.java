package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRun {

	public static void main(String[] args) {
		
		// primitive data type that comes from java core library
		int x = 12; 
		
		int y; 
		
		
		y=12;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		// opening the google chrome browser 
		
		
	
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		
		WebDriver driver1=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver1.get("https://www.google.com/");
		
		driver1.quit();
		
	}

}
