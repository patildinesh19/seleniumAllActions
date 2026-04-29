package export.TestNgDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class openmultiplebrowser extends baseclass
{
	
	baseclass bs = new baseclass();
	@Test
	public void initiatebrowser() throws IOException
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		
		
		if(bs.readpropertyfile("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("Browser is open sucessfully");
						
		}
		else if(bs.readpropertyfile("browser").equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
			
		}
		else
		{
			driver = new InternetExplorerDriver();
			
		}
			
		
		driver.get(bs.readpropertyfile("url"));
	}
	
}
