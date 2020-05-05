package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahooPage {

	
	
	WebDriver driver; 
	int y; 
	
	public yahooPage(WebDriver x) {
		
		
		driver = x; 
		
	}
	
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")); 
		
		return firstname; 
	}
}
