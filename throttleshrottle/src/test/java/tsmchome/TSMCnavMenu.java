package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCnavMenu {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.throttleshrottle.com/");
			driver.manage().window().maximize();
			
			/*
			WebElement home = driver.findElement(By.linkText("Home"));
			
			System.out.println("is displyed: "+ home.isDisplayed());
			System.out.println("is enabled "+ home.isEnabled());
			*/
			
	        WebElement holiParty = driver.findElement(By.xpath("//p[@id='comp-l651e5yz1label']"));
	        holiParty.click();
	        
	        
	        String expectedUrl = "https://www.throttleshrottle.com/shop";
	        String actualUrl = driver.getCurrentUrl();
	        if (expectedUrl.equals(actualUrl)) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }
	        Thread.sleep(5);
	        
	        
	        WebElement cultureMenu = driver.findElement(By.linkText("Culture"));
	        cultureMenu.click();
	        
	        String expectedUrl1 = "https://www.throttleshrottle.com/culture";
	        String actualUrl1 = driver.getCurrentUrl();
	        if (expectedUrl1.equals(actualUrl1)) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        Thread.sleep(5);
	        
	        
	        
	        WebElement home1 = driver.findElement(By.xpath("//p[@id='comp-l651e5yz0label']"));
	        home1.click();
	        
	        String expectedUrl2 = "https://www.throttleshrottle.com";
	        String actualUrl2 = driver.getCurrentUrl();
	        if (expectedUrl2.equals(actualUrl2)) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        Thread.sleep(5);
	        
	        WebElement login = driver.findElement(By.xpath("//span[@class='VGMdYn']"));
	        login.click();
	        
	        String expectedUrl3 = "https://www.throttleshrottle.com/login";
	        String actualUrl3 = driver.getCurrentUrl();
	        if (expectedUrl3.equals(actualUrl3)) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        
	        WebElement cartIcon = driver.findElement(By.xpath("//*[local-name()='svg']/*[@d='M99.8 28.4c0-1.2-0.9-2-2.1-2h-15c0 3.2 0 7.6 0 8.2 0 1.5-1.2 2.6-2.6 2.9 -1.5 0.3-2.9-0.9-3.2-2.3 0-0.3 0-0.3 0-0.6 0-0.9 0-4.7 0-8.2H40.1c0 3.2 0 7.3 0 8.2 0 1.5-1.2 2.9-2.6 2.9 -1.5 0-2.9-0.9-3.2-2.3 0-0.3 0-0.3 0-0.6 0-0.6 0-5 0-8.2h-15c-1.2 0-2 0.9-2 2L8.3 124c0 1.2 0.9 2.1 2.1 2.1h96.3c1.2 0 2.1-0.9 2.1-2.1L99.8 28.4z']"));
	        cartIcon.click();
	        
	        // Add assertions to verify redirection to the cart page
	        String expectedUrl4 = "https://www.throttleshrottle.com/cart";
	        String actualUrl4 = driver.getCurrentUrl();
	        if (expectedUrl4.equals(actualUrl4)) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        
	        
	        
	        driver.quit();
	        
	        
	        
			
			

	}
}

	