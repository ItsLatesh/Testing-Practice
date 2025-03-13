package webmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condexm {

	public static void main(String[] args) {
 //conditional methods - access these commands through webelement 
	/*return boolean value (true/false)
	 * isDisplayed() - we can check display status of the element
	 * isEnabled() - we can check enable/disable status of the element/operational element
	 * isSelected() - we can use to check the element is selected or not */
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	
	driver.manage().window().maximize();
	
//isDisplayed()
	
	//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//System.out.println("display status : "+logo.isDisplayed());
	
//isEnabled()
	
	//boolean text = driver.findElement(By.xpath("//label[normalize-space()='First name:']")).isEnabled();
	//System.out.println("text status: "+text);
	
//isSelected()
	WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement Female = driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println(male.isSelected());
	System.out.println(Female.isSelected());
	
	System.out.println("after selecting male....");
	male.click();
	
	
	//System.out.println("after selecting Female....");
	//Female.click();
	
	
	System.out.println(male.isSelected());
	System.out.println(Female.isSelected());
	
	//browser methods
	/*close() - close single browser
	 * quit() - close multiple browsers*/
	
	
 
	}

}
