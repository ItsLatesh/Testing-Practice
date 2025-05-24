package chromeOptionsexm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsExm {

	public static void main(String[] args) {
		
		/*Chromeoptions
		 * headless testing : without seeing any actions on UI testing happening into backend 
		 *Adavantages 
		 *we can do multiple tasks (since execution happend backend )
		 *faster execution 
		 *Disadv
		 *user cannot see the actions on the page so he cannot understand flow/functionality of the test case.
		 *
		 *
	 */
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");//setting for headless mode of execution 
		
		
		
		
		WebDriver driver = new ChromeDriver(options);
		
		
		       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		
		
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
	            
	            
	            driver.quit();
	            
		

	}

}
