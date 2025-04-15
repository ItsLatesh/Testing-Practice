package tsmchome;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCDropDownsuboptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.throttleshrottle.com/");
		driver.manage().window().maximize();
		
		

		try {
            // Open the target website
            driver.get("https://www.throttleshrottle.com/"); // Replace with actual URL

            // Wait for "More" button to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement moreButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("comp-l651e5yz__more__label")));
            
            // Click the "More" button
            moreButton.click();

            // Wait for dropdown menu to be visible
            WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("comp-l651e5yzmoreContainer")));

            // Get all dropdown options (assuming they are inside <li> tags)
            List<WebElement> options = dropdownMenu.findElements(By.tagName("li"));

            // Print the dropdown options
            for (WebElement option : options) {
                System.out.println(option.getText());
            }

            // Example: Click the first option (if available)
            if (!options.isEmpty()) {
                options.get(0).click();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
		
		
	}

}
}
