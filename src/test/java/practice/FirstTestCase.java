package practice;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

/*
 *Test case:
 -------------------
 *launch browser
 *open url https://demo.opencart.com/
 *validate title should be "your store"
 *close browser
 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		
		// launch browser chrome
		//WebDriver driver = new ChromeDriver()(we can use this approach for multiple browser)
		ChromeDriver driver = new ChromeDriver(); 
		
		//open the url
		
		driver.get("https://demo.opencart.com/");
		
		//validate title "your store"
		
		
		String act_title=driver.getTitle(); 
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//close browser
		driver.close();
		
		//driver.quit();
			
	
	}

}
