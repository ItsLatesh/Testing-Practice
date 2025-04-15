package tsmchome;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCDeviceResponse {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.throttleshrottle.com/");
			
			 // Test for Desktop
	        Dimension desktop = new Dimension(1920, 1080);
	        driver.manage().window().setSize(desktop);
	        System.out.println("test pass Desktop "+desktop);
	        
	        
	        // Test for Tablet
	        Dimension tablet = new Dimension(768, 1024);
	        driver.manage().window().setSize(tablet);
	        System.out.println("test pass tablet "+tablet);
	        
	        
	        // Test for Mobile
	        Dimension mobile = new Dimension(375, 667);
	        driver.manage().window().setSize(mobile);
	        System.out.println("test pass mobile");
	        driver.quit();
			

	}

}
