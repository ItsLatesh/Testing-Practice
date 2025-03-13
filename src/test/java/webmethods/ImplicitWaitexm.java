package webmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitexm {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.close();
	/*Implicit wait
	 * adv
	 * single time/one statement
	 * it will not wait till maximum time if the element is availble
	 * application for all the elements 
	 * easy to use
	 * Dis
	 * if  the time is not sufficient then you will get exception */
	}

}
