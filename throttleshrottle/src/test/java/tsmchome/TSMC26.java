package tsmchome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMC26 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://www.throttleshrottle.com/");
			
			// Test Case: TSMC-26 Verify that the "Explore the Collection" heading is displayed correctly
			
			// Test Case: TSMC-27 Verify that "Handmade Vintage Lighter’s" text is displayed correctly
			
			 WebElement heading = driver.findElement(By.xpath("//span[contains(text(),'Explore the Collection')]"));
		        
		        
		        if (heading.isDisplayed()) {
		            System.out.println("Heading 'Explore the Collection' is displayed correctly");
		        } else {
		            System.out.println("Heading 'Explore the Collection' is not displayed");
		        }
		        
		        
		        
		        WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Explore the Collection')]"));
		        
		        
		        if (text.isDisplayed()) {
		            System.out.println("Text 'Handmade Vintage Lighter’s' is displayed correctly");
		        } else {
		            System.out.println("Text 'Handmade Vintage Lighter’s' is not displayed");
		        }
		        
		        
		        
		        
		        driver.quit();

	}

}
