package tsmchome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMC2829 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.throttleshrottle.com/");
		
		// Test Case: TSMC-28 Verify that the "Holi Party At Farm" image is displayed
		// Test Case: TSMC-29 Verify that the "Holi Party At Farm" price is displayed
		
		
		 WebElement image = driver.findElement(By.xpath("//wow-image[@class='d7xFyJ sJ6BuOp']//img"));
	        
	        // Add assertions to verify the image is displayed properly
	        if (image.isDisplayed()) {
	            System.out.println("Image 'Holi Party At Farm' is displayed correctly");
	        } else {
	            System.out.println("Image 'Holi Party At Farm' is not displayed");
	        }
	        
	        WebElement price = driver.findElement(By.xpath("//div[@class='T2QOcV']"));
	        
	        // Add assertions to verify the price is displayed
	        if (price.isDisplayed()) {
	            System.out.println("Price '₹500.00' is displayed correctly");
	        } else {
	            System.out.println("Price '₹500.00' is not displayed");
	        }
	        
	        
	        
	        
	       
	        
	        driver.quit();
	        
	        
	        

	}

}
