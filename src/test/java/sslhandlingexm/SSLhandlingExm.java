package sslhandlingexm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLhandlingExm {

	public static void main(String[] args) {
		/*Secure Socket Layer handling 
		 * 
		 * */
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		//to remove "chrome is being controlled by automated test software "
				//options.setExperimentalOption("excludeSwitches",new String []) {"enable-automation"}
				
		options.setAcceptInsecureCerts(true);//accepts SSL certificates 

		WebDriver driver = new ChromeDriver(options );
		
		
	        driver.get("https://expired.badssl.com/");
	        
	        System.out.println("title of the page: "+driver.getTitle());//privacy error
	        
	}

}
