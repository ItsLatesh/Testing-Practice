package alertexm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopExm {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/*
		//normal alert with single button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		*/
		
		/*
		//confirmation alert - ok and cancel
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();//close alert using ok button
		driver.switchTo().alert().dismiss();
		
		*/
		
		//Prompt alert with input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert myprompt = driver.switchTo().alert();
		myprompt.sendKeys("welcome");
		myprompt.accept();
		
		
		

	}

}
