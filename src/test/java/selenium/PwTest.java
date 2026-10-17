package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import base.Base1;

public class PwTest extends Base1 {
	@Test
	public void lunchApplication()
	{
		driver.get("http://localhost:4200/");
		System.out.println("Application lunch sucessfully");
		driver.getTitle();
		System.out.println("Application title is : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "playwright-test-admin Demo Application");
	}

}
