package cssexm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsExm {

	public static void main(String[] args) {
		
		//ctrl+shift+O shortcut for import
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize(); //max the window
		
	// tag id
		//tag is optional 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
    // tag class 
		
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("T-shirts");
		
	//tag attribute (when their is no id and class we use tag attribute)
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Tshirt");
		
	//tag class attribute  (to differentiate webelements fro specific element)
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("iphone");
		
		
		
		
		;

	}

}
