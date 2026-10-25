package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.Base1;

public class WebActions extends Base {
	
	
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
		
		String application=pr.getProperty("URLPracticesapp");
		
		getDriver().get(application);		
	}
	@Test 
	public void handelAlertbox()
	{
		String name="Dinesh";
		WebElement textbox = getDriver().findElement(By.name("enter-name"));
		textbox.sendKeys(name);
		getDriver().findElement(By.id("alertbtn")).click();
		WebDriverWait  wt = new WebDriverWait(getDriver(),Duration.ofSeconds(100));
		wt.until((ExpectedConditions.alertIsPresent()));
		String alertmessage = getDriver().switchTo().alert().getText();
		getDriver().switchTo().alert().accept();
		System.out.println("Alert Message is :"+alertmessage);
		getDriver().findElement(By.id("confirmbtn")).click();
		WebDriverWait wt1 = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
		wt1.until(ExpectedConditions.alertIsPresent());
		String confirmmessage = getDriver().switchTo().alert().getText();
		System.out.println("Confirm message is : "+confirmmessage);
		getDriver().switchTo().alert().dismiss();				 
	}
	@Test
	public void handelWebTable()
	{
		int count =0;
		List<WebElement> Cityes = getDriver().findElements(By.cssSelector(".tableFixHead #product tbody td:nth-child(3)"));
		for(int i=0;i<Cityes.size();i++)
		{
			
			String CityName = Cityes.get(i).getText();
			System.out.println("All Cities are : "+CityName);
			if(CityName.equalsIgnoreCase("Chennai"))
			{
				count++;
				
			}
			
		}
		System.out.println("Total number of City Chennai present "+count);
		
		List<WebElement> Amount = getDriver().findElements(By.cssSelector(".tableFixHead #product tbody td:nth-child(4)"));
		int int_Sum=0;
		for(int i=0;i<Amount.size();i++)
		{
			
			String string_sum;
			string_sum= Amount.get(i).getText();
			int_Sum = int_Sum+Integer.parseInt(string_sum);
		}
		System.out.println("Total Amount is "+int_Sum);
		String totalamounttext = getDriver().findElement(By.cssSelector(".totalAmount")).getText();
		String [] splittotalamotstring =  totalamounttext.split(":");
		System.out.println(splittotalamotstring[0]);
		System.out.println(splittotalamotstring[1]);
		String amount_Without_White_space = splittotalamotstring[1].strip();
		Assert.assertEquals(Integer.parseInt(amount_Without_White_space), int_Sum);
		
		int price =0;
		int int_price = 0;
		List<WebElement> allprices = getDriver().findElements(By.cssSelector("table[name= courses] tbody td:nth-child(3)"));
		for(int i=1;i<allprices.size();i++)
		{
			String string_price = allprices.get(i).getText();
			int_price = Integer.parseInt(string_price);
			price = price+int_price;
		}
		System.out.println("Total Price = "+price);
	}
}
