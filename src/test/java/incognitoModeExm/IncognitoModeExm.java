package incognitoModeExm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoModeExm {

	public static void main(String[] args) {
	
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		

		WebDriver driver = new ChromeDriver(options );
		
		
	        driver.get("https://demo.nopcommerce.com/");
	        
	        System.out.println("title of the page: "+driver.getTitle());//privacy error
	        
                 
	}

}
