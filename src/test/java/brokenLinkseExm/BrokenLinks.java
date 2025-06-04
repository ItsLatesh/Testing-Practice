package brokenLinkseExm;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		/*
		 * Broken links 
		 * the link should have href attribute with valid link
		 *hitting url to the server then we get a status code 
		 *if the the status code is >= 400 broken link 
		 *<400 not a broken link
		 * */
		
       WebDriver driver = new ChromeDriver();
		
		
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        
        //capture the all links from website 
        
       List<WebElement> links = driver.findElements(By.tagName("a"));
       
       System.out.println("total number of links " + links.size() );
       
       int noOfBrokenLinks = 0;
       
       
       for(WebElement linkElement : links) {
    	   String hrefvalue = linkElement.getAttribute("href");
    	   
    	   if(hrefvalue == null || hrefvalue.isEmpty()) {
    		   System.out.println("href attribute value is null or empty. so not not possible to verify  ");
    		   
    		   continue;
    		   
    		   
    		   
    	   }
    	   
    	   
    	   try {
    	   //to send url to the server
    	   //to convert string into URL
    	   
    	   URL linkURL = new URL(hrefvalue);
    	   
    	   // after opening connection to the server it will return  a connection object 
    	   
    	   
    	   HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();//open connection to the server
    	   
    	   conn.connect();//connect to the server and sent request tot the server .
    	   
    	   if(conn.getResponseCode() >= 400) {
    		   
    		   System.out.println(hrefvalue+"======> Broken link");
    		   noOfBrokenLinks++;
    		   
    		   
    		   
    	   }
    	   else {
    		   System.out.println(hrefvalue+"======>not a broken link ");
    	   }
    	   
    	   }catch(Exception e) {
    		   
    	   }
    	   
    	   
    	   
       }
    	 
       
       System.out.println("Number of broken links : " + noOfBrokenLinks);
       
        
        
		
	}

}
