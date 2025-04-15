package tsmchome;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMCtitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.throttleshrottle.com/");
		driver.manage().window().maximize();
		
		String expectedTitle = "Best Cafe | Throttle Shrottle";
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			{
			System.out.println("Test passed");
			
			
			}else {
				System.out.println("Test Failed");
				
			}
		
		driver.quit();
		
		
		

	}

}
