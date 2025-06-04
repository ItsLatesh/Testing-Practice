package shadowDOMs;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDoms {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://dev.automationtesting.in/shadow-dom");
       
        driver.manage().window().maximize();
        
        
        
      //1. This Element is inside single shadow DOM.
        //String cssSelectorForHost1 = "#shadow-root";
        //Thread.sleep(1000);
        
        SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
       String A = shadow.findElement(By.cssSelector("#shadow-element")).getText();
        
        System.out.println(A);
        
        
        
        
      //2. This Element is inside 2 nested shadow DOM.
       // String cssSelectorForHost1 = "#shadow-root";
        //String cssSelectorForHost2 = "#inner-shadow-dom";
        //Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        String B = shadow1.findElement(By.cssSelector("#nested-shadow-element")).getText();
        
        System.out.println(B);
        
        
      //3. This Element is inside 3 nested shadow DOM.
       // String cssSelectorForHost1 = "#shadow-root";
        //String cssSelectorForHost2 = "#inner-shadow-dom";
        //String cssSelectorForHost3 = "#nested-shadow-dom";
        //Thread.sleep(1000);
        
        SearchContext shadow01 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow11 = shadow01.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow2 = shadow11.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        String C =  shadow2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
        
        System.out.println(C);
        
        
        
        driver.quit();
        
	}

}
