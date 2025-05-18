package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomExm {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
		 
		
			
			
		            driver.get("https://demo.nopcommerce.com/");
		            /*
		            Thread.sleep(5000);
		            driver.manage().window().minimize();
		            
		            Thread.sleep(5000);
		            */
		            driver.manage().window().maximize();
		            
		          
		            
		            
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("document.body.style.zoom= '50%'");
		            
		            
		            

	}

}
