package shadowDOMs;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMSexm {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Shadow DOM elements cannot access via xpath 
		 * to access the shadow DOMS elements we use cssselector 
		 *  shadow host  contains shadow root and shadow root contains our element 
		 *  */
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://books-pwakit.appspot.com/");
       
        driver.manage().window().maximize();
        
        
        
      //This Element is inside single shadow DOM.
        //String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
        //Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("welcome");
        /*
        //)

        
        */
      
        

	}

}
