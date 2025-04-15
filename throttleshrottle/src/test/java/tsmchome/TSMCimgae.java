package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCimgae {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.throttleshrottle.com/");
		driver.manage().window().maximize();
		
		// Test Case: TSMC-6 Validate image gallery alignment and visibility
		WebElement imageGallery = driver.findElement(By.xpath("//div[@id='gallery-horizontal-scroll-comp-l97xmqpx']"));
		
		Actions actions = new Actions(driver);
        actions.moveToElement(imageGallery).perform();
        
        // Add assertions to verify the visibility and alignment of the image gallery
        if (imageGallery.isDisplayed()) {
            System.out.println("Image gallery is visible");
        } else {
            System.out.println("Image gallery is not visible");
        }
        
        // Locate and click on an image in the gallery
        WebElement image = driver.findElement(By.xpath("//div[@id='pgi80b6b13246cc48678ae90410a748b0da_0']"));
        image.click();
        
        WebElement enlargedImage = driver.findElement(By.xpath("//div[@id='pgi80b6b13246cc48678ae90410a748b0da_0']"));
        if (enlargedImage.isDisplayed()) {
            System.out.println("Image enlarged successfully");
        } else {
            System.out.println("Image did not enlarge");
        }
        
        // Check for like counter
        /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//button[@data-hook='love-icon']"));
        js.executeScript("arguments[0].click();", element);
        System.out.println("Love button clicked successfully!");
        */
        
        driver.quit();
        
        

	}

}
