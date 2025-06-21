package testNGINtegration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 1) open application
 * 2) test logo presence 
 * 3) login
 * 4) close
 * execute test cases using xml file 
 * 1) generate automatically
 * or manually 
 * */
    
public class OrangeHrmTest {
	
	WebDriver driver;
	
	  @Test(priority = 1)
	
	
	
	void openapp() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   
	}
	  @Test(priority = 2)
	  
	 void testLogoPresence() throws InterruptedException {
		  Thread.sleep(3000); // 
		 boolean status =  driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();	
		  
		  System.out.println("Logo presence status: " + status);
		 
	 }
	  @Test(priority = 3)
	  
	  void login() {
		  
		  driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
		  String title = driver.getTitle();
		  System.out.println("Page title after login: " + title);
		  
	  }
	  @Test(priority = 4)
	  
	  void logout() {
		  
		  
	  }
			  /*to crate our own xml file 
			   * <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name = "my suite">
		<test = "my tests">
		<classes>
		<Class name = "our classs name "></class>
		
		</classes>
		</test>
		</suite> */
	 
	  
	  /*test suite--->test cases--->step steps 
	   * xml file ----> classes----> test methods 
	   * 
	   * 
	   * 
	   * 2 things acheived through xml
	   * 1. executed group of test cases as 1 suite 
	   * 2. we can generate testng reports (deafult )
	   * *///
	
	 
	
	
  
	  
	  
  }

