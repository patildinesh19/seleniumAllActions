package export.Selenium_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablescenarios
{
	//take data from table store in arraylist than sort using array
	ArrayList<String> at= new ArrayList<String>();
	
	
	public static void main(String [] args)
	
	{
		tablescenarios tb=new tablescenarios();
		tb.tablescenario();
		tb.sorttalevalue();
	}
		public void tablescenario()
		{
	
			System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.id("example"));
		List<WebElement> row_table=table.findElements(By.xpath("//table[@id='example']//tbody/tr"));
		//take all office name and sort it
		List<WebElement> name_of_offices=table.findElements(By.xpath("//table[@id='example']//tbody/tr/td[3]"));
		
		int number_of_offices=name_of_offices.size();
		for(int i=0;i<number_of_offices;i++)
		{
			WebElement name_webelement=table.findElements(By.xpath("//table[@id='example']//tbody/tr/td[3]")).get(i);
			String name=name_webelement.getText();
			//check array list contain duplicate value i
			if(at.contains(name))				
			{
				System.out.println("Duplicate name"+name);
			}
			else
			{
			at.add(name);			
			}
		}
		System.out.println("Table values storie in ArrayList"+at);			
	}
	
	public void sorttalevalue()
	{
		String officename[]= new String[at.size()];
		String sortarray []=new String[at.size()];
		
		for(int i=0;i<at.size();i++)
		{
			officename[i]=at.get(i);
		}
		System.out.println(officename);
		for(int i=0;i<officename.length;i++)
		{
			System.out.println("Office Name In Array"+officename[i]);
		}
		Arrays.sort(officename);
		
		for(int i=0;i<officename.length;i++)
		{
			System.out.println("Office Name Sorrted List"+officename[i]);
		}
		
		
	}

}