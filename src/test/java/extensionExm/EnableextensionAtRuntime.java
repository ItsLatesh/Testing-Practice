package extensionExm;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableextensionAtRuntime {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		File file = new File("C:\\Users\\lates\\Desktop\\Software testing\\Latesh test\\seleniumwebdriver\\SelectorsHub-Chrome-Web-Store.crx");
		
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		
		
        driver.get("https://text-compare.com/");
        
        
		

	}

}
