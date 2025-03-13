package webmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviExm {

	public static void main(String[] args) {
		/*navigational methods
		 * navigate().to(url) - accepts URL in the string format and URL object format
		 * navigate().back()
		 * navigate().forward()
		 * navigate().refresh*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.opencart.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
		
		

	}

}
