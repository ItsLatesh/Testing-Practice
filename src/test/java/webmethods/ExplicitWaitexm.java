package webmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitexm {

	public static void main(String[] args) {
		/*explicit wait 
		 * conditional based ,it will work more effectively
		 * finding element is inclusive
		 * it will wait for conditions to be true,then consider the time
		 * we need to write multiple statements for multiple elements
		 * */
		
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
        
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		WebElement texuser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		
		texuser.sendKeys("Admin");
		
        WebElement texpassuser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		
        texpassuser.sendKeys("admin123");
		
		WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		login.click();

	}

}
