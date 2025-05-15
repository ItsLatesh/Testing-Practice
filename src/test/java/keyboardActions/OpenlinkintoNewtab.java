package keyboardActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenlinkintoNewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
			        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			        
		            driver.get("https://demo.nopcommerce.com/");
		            driver.manage().window().maximize();
		            
		            WebElement Registerlink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		            
		            Actions act = new Actions(driver);
		            
		            //ctrl+reglink
		            act.keyDown(Keys.CONTROL).click(Registerlink).keyUp(Keys.CONTROL).perform();
		            
		            //switching to regist page
		            
		            List<String>ids =new ArrayList (driver.getWindowHandles());
		            driver.switchTo().window(ids.get(1));//switch to register page 
		            
		            driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("tt");
		            
		            driver.switchTo().window(ids.get(0));//switch to home page
		            
		            driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("iphone");
		            
		            
		            
		            
		            
		            
		            
		            

	}

}
