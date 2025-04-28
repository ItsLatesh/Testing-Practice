package dateexm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatepickerExm {
	
	static void selectMonthAndYear(WebDriver driver , String month, String year) {
		//select month and year 
        while(true) {
        	String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month 
        	String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year
        	
        	if(currentMonth.equals(month) && currentYear.equals(year)){
        		break;
        		
        		
        		
        	}
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
        	}
		
		
	}
	
	static void selectDate(WebDriver driver, String date) {
		//selection of date 
        List<WebElement> Alldates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        
        for(WebElement dt:Alldates) {
     	   if(dt.getText().equals(date)) {
     		   dt.click();
     		   break;
     		   
     	   }
        }
	}
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		 
	           
	            driver.get("https://jqueryui.com/datepicker/");
	            driver.manage().window().maximize();
	            
	            //Switch to frame
	            driver.switchTo().frame(0);
	            //method 1 : using sendkeys()
	            
	           // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
	            
	            //method 2 : using date picker
	            String year = "2025";
	            String month = "May";
	            String date = "20";
	            
	            driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	            
	            selectMonthAndYear(driver,month,year);
	            selectDate(driver, date);
	            
	            /*
	            //select month and year 
	            while(true) {
	            	String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month 
	            	String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year
	            	
	            	if(currentMonth.equals(month) && currentYear.equals(year)){
	            		break;
	            		
	            		
	            		
	            	}
	            	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
	            	}
	           */
	            /*
	            //selection of date 
	           List<WebElement> Alldates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	           
	           for(WebElement dt:Alldates) {
	        	   if(dt.getText().equals(date)) {
	        		   dt.click();
	        		   break;
	        		   
	        	   }
	           }
	            */
	            
	            
	            
	

	}

}
