package webtableexm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesexm {

	public static void main(String[] args) {
		
		/*types of web tables
		 * 1. Static web table
		 * 2. Dynamic web table
		 * 3. table with pagination*/
		
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			//total number of rows in the table
			int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			System.out.println("number of rows:"+rows);
			
			//total number of columns in the table
			int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println("number of columns :"+columns);
			
		   //read data from specific row and columns (5th row and 1st column)
			String readdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
			System.out.println("5th row and 1st column data is :"+readdata);
	        System.out.println();
	        
			/*
			//reading all the data
			for(int r=2; r<=rows;r++)
			{
				for(int c=1 ; c<columns ; c++) 
				{
					String v = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(v+"\t");
				}
				System.out.println();
			}
			*/
	        
	        /*
			
			//print book names whose author name is  mukesh 
			for(int r = 2 ; r<=rows; r++)
			{
				String authrName = driver.findElement(By.xpath("//table[@name=\'BookTable\']//tr["+r+"]//td[2]")).getText();
				
				if(authrName.equals("Mukesh"))
				{
				String bookname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname+"\t"+authrName);
				}
			}
			*/
	        
	        //find all the prices of book
	        int total = 0;
	        
	        for(int r = 2 ; r<=rows; r++)
			{
				String price = driver.findElement(By.xpath("//table[@name=\'BookTable\']//tr["+r+"]//td[4]")).getText();
				total = total+Integer.parseInt(price);
				
				
			}
	        System.out.println("total price of the book :"+total);
	        
			
			driver.quit();
			

	}

}
