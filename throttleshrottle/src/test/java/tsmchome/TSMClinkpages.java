package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMClinkpages {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.throttleshrottle.com/");
		driver.manage().window().maximize();
		
		
		// Test Case: TSMC-8 Verify that the holi party event link works
		 // Locate and click the holi party event link
        WebElement holiPartyLink = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/wix-dropdown-menu[1]/nav[1]/ul[1]/li[2]/a[1]/div[1]/div[1]/p[1]"));
        holiPartyLink.click();
        
        
        String expectedUrl = "https://www.throttleshrottle.com/shop";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        
        Thread.sleep(5);
        
     // Test Case: TSMC-9 Verify that the culture link works
        // Locate and click the culture link
        WebElement cultureLink = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/wix-dropdown-menu[1]/nav[1]/ul[1]/li[3]/a[1]/div[1]/div[1]/p[1]"));
        cultureLink.click();
        
       
        String expectedUrl1 = "https://www.throttleshrottle.com/culture";
        String actualUrl1 = driver.getCurrentUrl();
        if (expectedUrl1.equals(actualUrl1)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
     // Test Case: TSMC-10 Verify if the "more" menu appears on the hover
        
     // Locate the "More" menu and hover over it
        WebElement moreMenu = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/wix-dropdown-menu[1]/nav[1]/ul[1]/li[7]/div[1]/div[1]/div[1]/p[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(moreMenu).perform();
        
        
        WebElement dropdown = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/wix-dropdown-menu[1]/nav[1]/ul[1]/li[7]/div[1]/div[1]/div[1]/p[1]"));
        if (dropdown.isDisplayed()) {
            System.out.println("Dropdown appeared successfully");
        } else {
            System.out.println("Dropdown did not appear");
        }
        
        
        
        driver.quit();
		
		

	}

}
