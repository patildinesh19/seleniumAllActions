package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.Base1;

public class DemoSite extends Base {

	@BeforeMethod
	public void lunchdempapp() throws IOException
	{
		pr = new Properties ();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\configuration.properties");
		pr.load(fp);
		String mavenvironment=System.getProperty("Envronment");
		//String environment = pr.getProperty("Envronment");
		if(mavenvironment.equalsIgnoreCase("QA")) {
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\QA.properties"));
		}
		else if(mavenvironment.equalsIgnoreCase("UAT")) {
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\UAT.properties"));
		}
		else if(mavenvironment.equalsIgnoreCase("PROD")) {
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\PROD.properties"));
		}
		
		String application=pr.getProperty("URLDEMOAPP");
		
		getDriver().get(application);		
	}
	
	@Test()
	public void uploadFile()  {
		try {
			WebElement fileupload = getDriver().findElement(By.id("fileinput"));
			fileupload.sendKeys("E:\\GIT.docx");	 
			System.out.println("File uploaded sucessfully");
			Thread.sleep(10000);
		}catch(Exception e)
		
		{
			System.out.println(e);
		}
		
	}
}
