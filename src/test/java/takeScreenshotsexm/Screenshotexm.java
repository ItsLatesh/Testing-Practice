package takeScreenshotsexm;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotexm {

	public static void main(String[] args) {
		
		/*their are three types we can achieve screen shots
		 * full page
		 * specific area of the page 
		 * web element 
		 * */
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
			        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			        
			
			
		            driver.get("https://demo.nopcommerce.com/");
		            driver.manage().window().maximize();
		            
		            /*
		            
		            //full page screenshot
		            
		            TakesScreenshot ts = (TakesScreenshot) driver;
		            File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		            File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		            
		            sourcefile.renameTo(targetfile);//copy the sourcefile to target file 
		            
		            */
		            //screenshot of specific section of the page 
		            
		           WebElement featuresection =  driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		            
		           featuresection.getScreenshotAs(OutputType.FILE);
		           
		           File sourcefile = featuresection.getScreenshotAs(OutputType.FILE);
		            File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\feature.png");
		            
		           
		            sourcefile.renameTo(targetfile);//copy the sourcefile to target file 
		            
		            
		            
		            driver.quit();
		            
		            
		

	}

}
