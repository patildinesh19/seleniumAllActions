package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import base.Base1;

public class WebActions extends Base1 {
	@Test (enabled = false)
	public void handelAlertbox()
	{
		String name="Dinesh";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement textbox = driver.findElement(By.name("enter-name"));
		textbox.sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		WebDriverWait  wt = new WebDriverWait(driver,Duration.ofSeconds(100));
		wt.until((ExpectedConditions.alertIsPresent()));
		String alertmessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Alert Message is :"+alertmessage);
		driver.findElement(By.id("confirmbtn")).click();
		WebDriverWait wt1 = new WebDriverWait(driver, Duration.ofSeconds(100));
		wt1.until(ExpectedConditions.alertIsPresent());
		String confirmmessage = driver.switchTo().alert().getText();
		System.out.println("Confirm message is : "+confirmmessage);
		driver.switchTo().alert().dismiss();				 
	}
	@Test(enabled = false)
	public void handelWebTable()
	{
		int count =0;
		List<WebElement> Cityes = driver.findElements(By.cssSelector(".tableFixHead #product tbody td:nth-child(3)"));
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
		
		List<WebElement> Amount = driver.findElements(By.cssSelector(".tableFixHead #product tbody td:nth-child(4)"));
		int int_Sum=0;
		for(int i=0;i<Amount.size();i++)
		{
			
			String string_sum;
			string_sum= Amount.get(i).getText();
			int_Sum = int_Sum+Integer.parseInt(string_sum);
		}
		System.out.println("Total Amount is "+int_Sum);
		String totalamounttext = driver.findElement(By.cssSelector(".totalAmount")).getText();
		String [] splittotalamotstring =  totalamounttext.split(":");
		System.out.println(splittotalamotstring[0]);
		System.out.println(splittotalamotstring[1]);
		String amount_Without_White_space = splittotalamotstring[1].strip();
		Assert.assertEquals(Integer.parseInt(amount_Without_White_space), int_Sum);
		
		int price =0;
		int int_price = 0;
		List<WebElement> allprices = driver.findElements(By.cssSelector("table[name= courses] tbody td:nth-child(3)"));
		for(int i=1;i<allprices.size();i++)
		{
			String string_price = allprices.get(i).getText();
			int_price = Integer.parseInt(string_price);
			price = price+int_price;
		}
		System.out.println("Total Price = "+price);
	}
}
