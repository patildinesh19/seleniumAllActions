package export.TestNgDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class carlone
{
	
	 @Test(groups={"Smoke"})
	public void loginWebApp()
	{
		System.out.println("Login into Car lon webApp");
	}
	@Test
	public void loginmobileapp()
	{
		System.out.println("Login into car Lon MobileApp");
	}
	@Test
	public void takecarlone()
	{
		System.out.println("Carlone take sucessfully");
	}
	@Test
	public void completecarlone()
	{
		System.out.println("complete car lone");
	}
	@BeforeTest
	public void deletecookiees()
	{
		System.out.println("Delete cookies");
	
	}
}
