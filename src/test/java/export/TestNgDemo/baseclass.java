package export.TestNgDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass 
{
	public static WebDriver driver = null;
	public static WebDriverWait wt= null;
	
	
	public String readpropertyfile(String propertyname) throws IOException
	{
		Properties pro = new Properties();
		// find the location of file using FileInputStream class
		FileInputStream fi= new FileInputStream("C:\\Selenium_Basics\\Selenium_Basic_Functions\\src\\TestNgDemo\\datadireven.properties");
		pro.load(fi);		
		return(pro.getProperty(propertyname));		
	}
	
}
