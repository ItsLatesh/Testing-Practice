package webtableexm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	public static void main(String[] args) {
		//dynamic table with pagination 
		
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
			
			
			 try {
		            // Navigate to the website
		            driver.get("https://testautomationpractice.blogspot.com/");
		            driver.manage().window().maximize();

		            // Find the total number of pages from the pagination
		            List<WebElement> pageButtons = driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
		            int totalPages = pageButtons.size();

		            // Loop through each page
		            for (int page = 1; page <= totalPages; page++) {
		                // Click on the page button
		                driver.findElement(By.xpath("//ul[@id='pagination']/li/a[text()='" + page + "']")).click();

		                // Locate the table rows in the tbody
		                List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));

		                // Print table data for the current page
		                System.out.println("Table Data for Page " + page + ":");
		                for (WebElement row : rows) {
		                    List<WebElement> cols = row.findElements(By.tagName("td"));
		                    System.out.println(
		                        "ID: " + cols.get(0).getText() +
		                        ", Name: " + cols.get(1).getText() +
		                        ", Price: " + cols.get(2).getText() +
		                        ", Selected: " + cols.get(3).getText()
		                    );
		                }
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();		        }
	}
}

	            
	
			
			
			
		

	





