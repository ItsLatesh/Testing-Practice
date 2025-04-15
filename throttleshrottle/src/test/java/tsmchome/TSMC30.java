package tsmchome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMC30 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.throttleshrottle.com/");
		
		 WebElement image = driver.findElement(By.xpath("//div[@class='CZ0KIs']"));
	     image.click();
	        
	       
	        String expectedUrl = "https://www.throttleshrottle.com/product-page/motomayhem-2-0";
	        String actualUrl = driver.getCurrentUrl();
	        if (expectedUrl.equals(actualUrl)) {
	            System.out.println("Redirection to the event booking page is successful");
	        } else {
	            System.out.println("Redirection to the event booking page failed");
	        }
	        
	        driver.quit();
		

	}

}
