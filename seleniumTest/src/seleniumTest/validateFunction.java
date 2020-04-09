package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateFunction {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("enger"));
		
		
		WebElement signUpButton = driver.findElement(By.id("u_0_13")); 
		
		boolean x = signUpButton.isDisplayed();
		
		System.out.println(x);
		
		boolean y = signUpButton.isEnabled();
		
		
		System.out.println(y);
		
		
		WebElement maleRadioButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div[1]/div[6]/span/span[2]/input")); 
		
		maleRadioButton.click();
		
		
		boolean z  = maleRadioButton.isSelected();
		
		System.out.println(z);
		
		String text = signUpButton.getText();
		
		System.out.println(text);
		
		

	}

}
