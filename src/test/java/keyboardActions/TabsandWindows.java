package keyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsandWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
	            driver.get("https://demo.nopcommerce.com/");
	            
	            //driver.switchTo().newWindow(WindowType.TAB);//opended new tab
	            
	            
	            driver.switchTo().newWindow(WindowType.WINDOW);
	            
	            driver.get("https://www.orangehrm.com/");
	            
	            
	           // driver.manage().window().maximize();

	}

}
