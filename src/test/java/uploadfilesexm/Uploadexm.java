package uploadfilesexm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadexm {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        
        //single file upload 
        
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\lates\\Music\\yt tumb//Sapno.png");
        
        if(driver.findElement(By.xpath("//ul[@id='fileList']// li")).getText().equals("Sapno.png"))
        {
        	
        	System.out.println("file uploaded successfully");
        	
        	
        }
        else {
        	System.out.println("file upload failed");
        	
        	
        }
        
        /*to upload multiple file
         * string file 1= "<your file path >";
         * string file 2 = "<your file path >";
         * driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file 2); 
         *int nofileuploads = driver.findElement(By.xpath("//ul[@id ='fileList]//li'")).size();
         *if(nofileuploads == 2) {
        	
        	System.out.println("files uploaded successfully");
        	
        	
        }
        else {
        	System.out.println("files upload failed");
        	
        	
        }*/
        
        
        
     
	}

}
