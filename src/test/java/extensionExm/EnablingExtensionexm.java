package extensionExm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnablingExtensionexm {

	public static void main(String[] args) {
		
		/*enabling extension in the browser
		 *  step 1 : add CRX extractor/downloader to chrome browser 
		 *  
		 *  step2 : add selectorsHub plugin to chromer browser
		 *  
		 *  step3 : capture crx file for selectorhub extension
		 *  
		 *  step 4 : pass crx file path in automation script in chrome options 
		 *  
		 * */
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		

		WebDriver driver = new ChromeDriver(options );
		
		
	        driver.get("https://text-compare.com/");
	        
	        System.out.println("title of the page: "+driver.getTitle());//privacy error
	        
	}

}
