package webtableexm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesexm {

	public static void main(String[] args) {
		
		/*types of web tables
		 * 1. Static web table
		 * 2. Dynamic web table
		 * 3. table with pagination*/
		
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		

	}

}
