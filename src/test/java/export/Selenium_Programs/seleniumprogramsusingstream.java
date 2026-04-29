package export.Selenium_Programs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.stream.*;

public class seleniumprogramsusingstream 
{
	public static void main(String [] args) throws IOException
	{
		ArrayList<String> Orginalofficename= new ArrayList<String>();
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.207:4444/wd/hub"),dc);
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\\\Selenium_Basics\\\\Selenium_Basic_Functions\\\\chromedriver_win_32_1\\\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Dimension d= new Dimension (400,400);
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.id("example"));		
		List<WebElement> name=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[1]"));
		List<WebElement> positioncolumn=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[2]"));
		List<WebElement> officename=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[3]"));
		List<WebElement> salary=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[6]"));
		List<WebElement> pagination=driver.findElements(By.xpath("//div[@id='example_paginate']/span/a"));
		
		//verify office name is sorted order on first page 		
		
		for(int i=0;i<officename.size();i++)
		{
			WebElement off=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[3]")).get(i);
			String offname=off.getText();
			Orginalofficename.add(offname);			
		}	
		System.out.println(Orginalofficename);
		List<String>sortedlist=Orginalofficename.stream().sorted().collect(Collectors.toList());				
		System.out.println(sortedlist);		
		if(Orginalofficename.equals(sortedlist))
		{
			System.out.println("Office name is in sortted order");
		}
		else
		{
			System.out.println("Office name is not in sorrted order");
		}
		
		//find out salary of perticuler person
		
		for(int i=0;i<name.size();i++)
		{
			WebElement indname=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[1]")).get(i);
			String nmae=indname.getText();
			if(nmae.equals("A. Satou"))
			{
				WebElement actualsalary=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[6]")).get(i);
				String salaryedamount=actualsalary.getText();
				System.out.println("Salary Amount A. Satou is"+salaryedamount);				
			}
		}
		// find out salry of person which is present 5th page
		
		/*---------------Lambda methods For ArrayList--------------*/
		
				/*find out the distinct count from array list*/
				long count=Orginalofficename.stream().distinct().count();
				System.out.println("total number of unique office address is "+count);
				/* Find all distinct values from list*/
				Orginalofficename.stream().distinct().forEach(s->System.out.println(s));
				/*Find out how many time NewYOrk city is in list*/
				long totalnumbrrofcitycount=Orginalofficename.stream().filter(s->s.contentEquals("New York")).count();
				System.out.println("Total number of New York City count is "+totalnumbrrofcitycount);
				/*convert all city name to upper case */
				Orginalofficename.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
				
				long totalelemwntinlist=Orginalofficename.stream().count();
				System.out.println("Total element in list="+totalelemwntinlist);
				
				Orginalofficename.stream().sorted().forEach(s->System.out.println(s));
				
				
				
				
				
		/*
		for(int i=0;i<pagination.size();i++)
		{
			for(int j=0;j<name.size();j++)
			{
				WebElement indname=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[1]")).get(j);
				String nmae=indname.getText();
				if(nmae.equals("C. Hurst"))
				{
					WebElement actualsalary=driver.findElements(By.xpath("//table[@id='example']//tbody/tr/td[6]")).get(j);
					String salaryedamount=actualsalary.getText();
					System.out.println("Salary Amount for C. Hurst is "+salaryedamount);
					break;
				}
				WebElement paginationnumber=driver.findElements(By.xpath("//div[@id='example_paginate']/span/a")).get(i);
				paginationnumber.click();
			}
		}
		
		Assert.assertTrue(Orginalofficename.equals(sortedlist));		*/
	}
	
	
	
	
	
}
