package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        
        
        Actions act = new Actions(driver);
        
        //1
        WebElement rome= driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement Italy= driver.findElement(By.xpath("//div[@id='box106']"));
        
        act.dragAndDrop(rome, Italy).perform();
        
        //2
        WebElement washington= driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement unitedstates = driver.findElement(By.xpath("//div[@id='box103']"));
        act.dragAndDrop(washington, unitedstates).perform();
        
        
        
        
        
        

	}

}
