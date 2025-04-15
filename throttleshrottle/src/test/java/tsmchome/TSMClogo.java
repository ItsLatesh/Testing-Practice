package tsmchome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSMClogo {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.throttleshrottle.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.linkText("THROTTLE SHROTTLE MOTO CLUB"));
		
		if(logo.isDisplayed())
		{
			System.out.println("logo as a text is visible");
		}else {
			System.out.println("logo as a text not visible");
		}

	}

}
