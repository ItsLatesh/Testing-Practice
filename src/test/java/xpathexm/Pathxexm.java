package xpathexm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pathxexm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	//types of xpath
	 //absolute and relative
		//absolute start with single / and relative starts with double//
		//absolute do not use attributes and relative use attributes
		//absolute traverse through each node and relative jump directly jump and find the element by using attribute
		
		
	//xpath with single attribute
		//driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("iphone");
		
	//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("tshirt");
		
	//xpath with Text()
		
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		boolean disstatus = driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).isDisplayed();
		System.out.println(disstatus);
		
		
		String text = driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText();
		
		System.out.println(text);
		
		
		
		
		
	}

}
