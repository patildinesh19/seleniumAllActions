package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Base;
import base.Base1;

public class DemoSite extends Base1 {

	@Test
	public void lunchdempapp()
	{
		driver.get("https://rahulshettyacademy.com/upload-download-test/");
	}
	
	@Test()
	public void uploadFile()  {
		try {
			WebElement fileupload = driver.findElement(By.id("fileinput"));
			fileupload.sendKeys("E:\\GIT.docx");	 
			System.out.println("File uploaded sucessfully");
			Thread.sleep(10000);
		}catch(Exception e)
		
		{
			System.out.println(e);
		}
		
	}
}
