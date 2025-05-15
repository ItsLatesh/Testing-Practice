package keyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		// keyboard actions - actions 
		/*
		 * keydown()
		 * keyup()
		 * for three keys for example
		 * ctrl+shift+A
		 * act.keydown(keys.control).keydown(keys.shift).sendkeys("A").keyup(keys.shift).keyup(keys.control).perform*/
		
       WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		
		
	            driver.get("https://text-compare.com/");
	            driver.manage().window().maximize();
	            
	            driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
	            
	            
	            Actions act = new Actions(driver);  
	            
	            //CTRL+A - SELECTS THE TEXT
	            
	            act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	            
	            
	            //CTRL+C - COPY THE TEXT INTO CLIPBORAD
	            
	            act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	            
	            
	            //TAB - SHIFT TO 2ND BOX
	            
	            act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	            
	            
	            //CTRL+V - PASTE THE TEXT
	            
	            
	            act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
