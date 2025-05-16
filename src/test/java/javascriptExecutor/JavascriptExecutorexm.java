package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorexm {

	public static void main(String[] args) {
		/*
		 * remotedriver
		 * Javascriptexecutor : it is an interface
		 * executeScript() : - we can execute javascript statments .
		 *some times actions method  does not work on the element  so we directly execute javascript statements  using executescript method 
		 *  */
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
		 
		 //ChromeDriver driver = new ChromeDriver();
		 
			       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			        
			
			
		            driver.get("https://testautomationpractice.blogspot.com/");
		            driver.manage().window().maximize();
		            
		            WebElement inputbox  = driver.findElement(By.xpath("//input[@id='name']"));
		            
		            JavascriptExecutor js =  (JavascriptExecutor) driver;//typecasting
		            
		            //JavascriptExecutor js = driver;
		            
		            js.executeScript("arguments[0].setAttribute('value','john')",inputbox);
		            
		          
		            
		            WebElement radiobtn  = driver.findElement(By.xpath("  //input[@id='male']"));
		            js.executeScript("arguments[0].click()",radiobtn);
		            
		
		
           
		 
	}

}
