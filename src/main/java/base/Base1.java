package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base1 {
	
	 public static WebDriver driver;
	public static String browser = "Chrome";
	// String browser = System.getProperty("browser");
	@BeforeMethod()
	public void intilizeDriver()
	{
		WebDriver webDriver = null;
		

			if (browser.equalsIgnoreCase("Chrome")) {
				webDriver = new ChromeDriver();
				
				
				}
			if (browser.equalsIgnoreCase("FireFox")) {

				webDriver = new FirefoxDriver();
				
				
			}
			webDriver.manage().window().maximize();
			webDriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
			
			
	}
	
	 @AfterMethod
	    public void tearDown() {

	        
	            driver.quit();

	            
	       
	    }

}