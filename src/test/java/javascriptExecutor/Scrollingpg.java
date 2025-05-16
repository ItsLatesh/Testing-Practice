package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollingpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
		 
		 //ChromeDriver driver = new ChromeDriver();
		 
			       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			        
			
			
		            driver.get("https://demo.nopcommerce.com/");
		            driver.manage().window().maximize();
		            
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            
		            //scroll down page by pixel number
		            //js.executeScript("window.scrollBy(0,3000)","");
		            //System.out.println(js.executeScript("return window.pageYoffset;"));
		            
		            //scroll till element is visible 
		             //WebElement  ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		            
		            
		          //  js.executeScript("arguments[0].scrollIntoView();",ele);
		            
		            
		            
		            //scroll page tille the end of the page 
		            
		            
		            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		            

	}

}
