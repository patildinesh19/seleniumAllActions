package export.TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homelone 
{
	
	@BeforeClass
	public void runbeforclass()
	{
		System.out.println("Run before class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Run After class");
	}
	@Test(groups={"Smoke"})
	public void loginWebApp()
	{
		System.out.println("Login into home lon webApp");
	}
	@Test
	public void loginmobileapp()
	{
		System.out.println("Login into home Lon MobileApp");
	}
	@Test
	public void takehome()
	{
		System.out.println("homelone take sucessfully");
	}
	@Test
	public void completehomelon()
	{
		System.out.println("complete home lone");
	}
	@AfterTest 
	public void deletehomeloan()
	{
		System.out.println("Delete home loan");
	}
	
	@AfterSuite
	public void closedallbrowser()
	{
		System.out.println("All browsers closed sucessfully");
	}
}
