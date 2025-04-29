package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        
        //sweitch 
        driver.switchTo().frame("iframeResult");
        
       WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
       WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
       WebElement button =  driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
     
       box1.clear();
       box1.sendKeys("Welcome");
       
       //double click
       Actions act = new Actions(driver);
       act.doubleClick(button).perform();
       
      /*String text = box2.getText();/*gettext is not working becoz its not inner text 
       gettext dont work on runtime */
       String text = box2.getAttribute("value");
       
       System.out.println("checking value : "+ text);
       
       if (text.equals("Welcome"))
       {
    	   System.out.println("text copied");
       }
       else {
    	   System.out.println("text not copied");
    	   
       }
       
       
	}

}
