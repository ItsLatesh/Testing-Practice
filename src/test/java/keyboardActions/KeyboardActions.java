package keyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		// keyboard actions - actions 
		/*
		 * */
		
       WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
	            driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	            driver.manage().window().maximize();
	            
	            Actions act = new Actions(driver);  
	            

	}

}
