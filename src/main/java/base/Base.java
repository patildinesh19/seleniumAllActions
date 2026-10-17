package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	
	  
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	//public static String browser = "Chrome";
	public static Properties pr;
	// String browser = System.getProperty("browser");
	@BeforeMethod()
	public void intilizeDriver() throws IOException
	{
		pr = new Properties ();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\configuration.properties");
		pr.load(fp);
		String mavenbrowsername=System.getProperty("browser");
		//String browsername=pr.getProperty("browser");
		WebDriver webDriver = null;
		

			if (mavenbrowsername.equalsIgnoreCase("Chrome")) {
				webDriver = new ChromeDriver();
				
				
				}
			if (mavenbrowsername.equalsIgnoreCase("FireFox")) {

				webDriver = new FirefoxDriver();
				
				
			}
			webDriver.manage().window().maximize();
			webDriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
			 driver.set(webDriver);
			
	}
	public static WebDriver getDriver() {
        return driver.get();
    }
	
	 @AfterMethod
	    public void tearDown() {

	        if (driver.get() != null) {

	            driver.get().quit();

	            driver.remove();
	        }
	    }

}