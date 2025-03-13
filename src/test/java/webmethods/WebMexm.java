package webmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMexm {

	public static void main(String[] args) throws InterruptedException {
//1. get methods
  /*get methods - we can access these methods through webdriver instance 
	 * get(url) - opens the url on the browser
	 * getTitle() - returns title of the page 
	 * getCurrentUrl() - returns URL of the page 
	 * getaPageSource() - returns source code of the page
	 * getWindowHandle() - returns ID of the single browser window
	 * getWindowHandles() - returns ID's of the multiple browser windows*/
		
		WebDriver driver = new ChromeDriver();
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//getTitle() - returns title of the page 
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getaPageSource() - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single browser window
		String windowid = driver.getWindowHandle();
		System.out.println("window id: "+windowid);
		
        //getWindowHandles() - returns ID's of the multiple browser windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
		
		//driver.close();
		
		driver.quit();
		
		
	
	}

}
