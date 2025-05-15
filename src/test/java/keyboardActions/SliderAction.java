package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderAction {
	/*dragAndDropBy(Element, x, y)*/

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
	            driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	            driver.manage().window().maximize();
	            
	            Actions act = new Actions(driver);  
	            
	            //minslider
	          WebElement min_slider  = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	          
              System.out.println("location of min slider before : "+min_slider.getLocation());//(59, 250)
              
              act.dragAndDropBy(min_slider, 100, 194).build().perform();
              
              System.out.println("location of min slider after : "+min_slider.getLocation());//(59, 250) = 
              
             //maximum slider
              
              WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
              System.out.println("location of max slider before : "+max_slider.getLocation());//(299,196)
              act.dragAndDropBy(max_slider, -100, 196).build().perform();
              System.out.println("location of max slider after moving  : "+min_slider.getLocation());
      
              
               
	}

}
