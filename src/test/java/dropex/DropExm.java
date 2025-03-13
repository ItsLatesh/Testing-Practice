package dropex;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropExm {

	public static void main(String[] args) {
		/*Dropdown box
		 * select dropdown - select,
		 *                          selectByVisibleText()
		 *                          selectByvalue()
		 *                          selectByIndex()
		 * bootstrap dropdown
		 * hidden dropdown
		 * */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcounty = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcounty1 = new Select(drpcounty);
		
		//select option from the dropdown
		
		//drpcounty1.selectByVisibleText("France");
		
		//capture the all options 
		
		List<WebElement> options = drpcounty1.getOptions();
		System.out.println("number of options : "+options.size());
		
		for(int i = 0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		
		
		

	}

}
