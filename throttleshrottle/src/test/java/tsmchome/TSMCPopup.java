package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCPopup {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.throttleshrottle.com/");
		driver.manage().window().maximize();
		
		 // Wait for the pop-up to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")));  

        // Fill out the form
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Latesh");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("test@example.com");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("9876543210");

        // Click submit button
        WebElement submitBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/button[1]"));
        submitBtn.click();

        // Handle SVG Close Button (using XPath)
        WebElement closeBtn = driver.findElement(By.xpath("//div[@title='Back to site']//*[name()='svg']"));  
        closeBtn.click();

        // Verify pop-up is closed
        boolean isPopupClosed = wait.until(ExpectedConditions.invisibilityOf(popup));
        System.out.println("Popup closed: " + isPopupClosed);

        
        driver.quit();
		
	}

}
