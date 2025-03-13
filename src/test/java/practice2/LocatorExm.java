package practice2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorExm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
	//name
		
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
	//id
		
		//boolean logodisplay = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logodisplay);
		
		
	//linktext(Recommended) and partiallinktext(can occur conflict )
		
		//driver.findElement(By.linkText("Tablets")).click();
		
		//driver.findElement(By.partialLinkText("Table")).click();
		
	//class
		
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("total number of header links: "+headerLinks.size());
		
	//TagName
		
		//List<WebElement> links =driver.findElements(By.tagName("a"));
		//System.out.println("total number of links: "+links.size());
		
		List<WebElement> allimg = driver.findElements(By.tagName("img"));
		
		System.out.println("total number images :" +allimg.size());
		
		
		
		

	}

}
