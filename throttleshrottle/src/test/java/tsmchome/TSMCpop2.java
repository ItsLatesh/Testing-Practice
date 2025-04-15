package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCpop2 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.throttleshrottle.com/");
		
			// Test Case: TSMC-17 Verify entering a valid name
	        
	        // Enter a valid name in the name field
	        WebElement nameField = driver.findElement(By.xpath("//input[@id='input_comp-l9720tko']"));
	        nameField.sendKeys("Latesh");
	        
	       
	       
	        
	        driver.quit();
		
		

	}

}
