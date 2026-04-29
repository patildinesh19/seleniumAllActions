package export.TestNgDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Agrilone 
{
	
	@BeforeSuite
	public void closedbrowser() 
	{
		System.out.println("Environment set sucessfully");
	}
	
	@Test
	public void setvariables()throws IOException
	{
		Properties pro = new Properties();
		// find the location of file using FileInputStream class
		FileInputStream fi= new FileInputStream("C:\\Selenium_Basics\\Selenium_Basic_Functions\\src\\TestNgDemo\\datadireven.properties");
		pro.load(fi);
		
		
		System.out.println(pro.getProperty("username"));
		
	}
	@BeforeMethod()
	public void checkseventwell()
	{
		System.out.println("Before taking Agrilone check 7/12 form");
		
	}
	
	@AfterMethod
	public void checkseventwellsucess()
	{
		System.out.println("seven twell form check sucessfully");
	}
	@Test(groups={"Smoke"})
	public void loginWebApp()
	{
		System.out.println("Login into Agri lon webApp");
	}
	@Test
	public void loginmobileapp()
	{
		System.out.println("Login into Agri Lon MobileApp");
	}
	@Test
	public void takeagrilone()
	{
		System.out.println("Agrilone take sucessfully");
	}
	@Test
	public void completeAgrilone()
	{
		System.out.println("complete Agri lone");
	}
}
