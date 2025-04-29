package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {

	public static void main(String[] args) throws InterruptedException {
		
		//right click : contextClick(element)

		WebDriver driver = new ChromeDriver();
		
		
	            driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	            driver.manage().window().maximize();
	            
	            WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	            
	            Actions act = new Actions(driver);
	            
	            //right click action
	            act.contextClick(button).build().perform();
	            
	            
	            driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	            Thread.sleep(5000);
	            
	            
	            //close the alert box
	            driver.switchTo().alert().accept();
	            
	            

	}

}
