package dropex;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapExm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		//select the single option 
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		// to capture all the options and the size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("number of options: "+options.size());
		
		/*for(int  i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	*/
		/*for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
		
		for(WebElement op:options)
		{
			String option = op.getText();
			if(option.equals("Java") || option.equals("python"));
			{
				op.click();
			}
		}
	}

}
