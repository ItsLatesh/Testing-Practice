package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCdropDown {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.throttleshrottle.com/");
			driver.manage().window().maximize();
			
			// Test Case: TSMC-11 Verify dropdown menu behavior on click
			WebElement moreMenu = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/wix-dropdown-menu[1]/nav[1]/ul[1]/li[7]/div[1]/div[1]/div[1]/p[1]"));
	        moreMenu.click();
	        
	        
	        WebElement dropdown = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/wix-dropdown-menu[1]/nav[1]/ul[1]/li[7]/div[1]/div[1]/div[1]/p[1]"));
	        if (dropdown.isDisplayed()) {
	            System.out.println("Dropdown remained open");
	        } else {
	            System.out.println("Dropdown did not remain open");
	        }
	        
	        driver.quit();

	}

}
