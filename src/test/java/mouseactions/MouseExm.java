package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseExm {

	public static void main(String[] args) {
		// Mouse actions 
		/*
		 *selenium class
		 *Actions class
		 *its a predefined class provided in selenium 
		 * mouse operations 
		 * mouse hover : moveToElement(element)
		 * right click(context click) : 
		 * double click
		 * drag and drop
		 * */
WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
	            driver.get("https://demo.opencart.com/");
	            driver.manage().window().maximize();
	            
	            WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	            WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	            
	            Actions act = new Actions(driver);
	            
	            //mouse hover action 
	            /*build() - create an action
	             * perform() - complete an action 
	             * */
	            act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	            
	            
	            
	            
	            

	}

}
