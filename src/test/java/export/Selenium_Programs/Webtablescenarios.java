package export.Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablescenarios {

	public static void main(String[] args) 
	{	int count=0;
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='example']"));
		
		List<WebElement>pagination=driver.findElements(By.xpath("//div[@id='example_paginate']//span//a"));
		int numberofpagination=pagination.size();
		System.out.println(numberofpagination);
		
		//find out total number of office in London
		for(int i=0;i<numberofpagination;i++)
		{
			List<WebElement>officecolum=table.findElements(By.xpath("//table[@id='example']//tbody//tr/td[3]"));
			int totalcolumonpage=officecolum.size();
			
			for(int j=0;j<totalcolumonpage;j++)
			{
				WebElement officename=table.findElements(By.xpath("//table[@id='example']//tbody//tr/td[3]")).get(j);
				String officenametext=officename.getText();
				if(officenametext.equalsIgnoreCase("Tokyo"))
				{
					count++;
				}
			}
			WebElement clickpagination=driver.findElements(By.xpath("//div[@id='example_paginate']//span//a")).get(i);
			clickpagination.click();
		}
		System.out.println("total number of London Office="+count);
	}

}
