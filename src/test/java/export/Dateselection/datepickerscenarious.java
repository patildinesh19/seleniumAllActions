package export.Dateselection;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//select todays date from date picker without hard code values and select future date as specific DD/MM/YYY

public class datepickerscenarious
{
	WebDriver driver=null;
	
	
	
	public static void main (String arg [])
	{
		String current_month="";
		String array[];
		String name2 = "";
		String required_month="July";
		datepickerscenarious dp= new datepickerscenarious();
		try{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			WebElement datefield=driver.findElement(By.xpath("//div[@id='sandbox-container1']//div/input"));
			datefield.click();
			dp.tablefunction(driver);
			WebElement startdate=driver.findElement(By.xpath("//div[@id='datepicker']//input[1]"));
			startdate.click();
			dp.tablefunction(driver);
			Calendar cl=Calendar.getInstance();
			int mm=cl.get(Calendar.MONTH);
			int mm1=7;
			WebElement enddate=driver.findElement(By.xpath("//div[@id='datepicker']//input[2]"));
			enddate.click();
			
			do
			{
				driver.findElement(By.xpath("//table[@class='table-condensed']/thead//tr[2]//th[3]")).click();
				WebElement checkmonth=driver.findElement(By.xpath("//table[@class='table-condensed']/thead//tr[2]//th[@class='datepicker-switch']"));
				current_month=checkmonth.getText();
				System.out.println("Current month="+current_month);
				array=current_month.split(" ");
				name2=array[0];
				System.out.println(name2);				
			}while(name2!=required_month);
		
		
		}
			catch(org.openqa.selenium.StaleElementReferenceException e){
			//Repeat the code in try
			}
	}
	public void tablefunction(WebDriver driver)
	{
		try{
			WebElement table=driver.findElement(By.xpath("//table[@class='table-condensed']"));
			if(driver.findElement(By.xpath("//table[@class='table-condensed']")).isDisplayed())
			{
				System.out.println("Data Picker is dispalyed");
			}
			else
			{
				System.out.println("Date picker is not dispalyed");
			}
			
			Calendar c1=Calendar.getInstance();
			int dd= c1.get(Calendar.DATE);
			dd=dd-1;
			
			List<WebElement>no_of_rows=table.findElements(By.xpath("//table[@class='table-condensed']//tbody//tr"));
			List<WebElement>no_of_days=table.findElements(By.xpath("//table[@class='table-condensed']//tbody//tr//td"));
			

			for(int i=0;i<no_of_days.size();i++)
			{
				WebElement eachday=table.findElements(By.xpath("//table[@class='table-condensed']//tbody//tr//td")).get(i);
				String name=eachday.getText();
				int daysinint=Integer.parseInt(name);
				if(dd==daysinint)
				{	System.out.println("Todays date ="+daysinint);
					table.findElements(By.xpath("//table[@class='table-condensed']//tbody//tr//td")).get(i).click();
					break;
				}
			}
			String datepickervalue="return document.getElementsByClassName(\"form-control\")[0].value;";
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String datefieldvalue=(String) js.executeScript(datepickervalue);
			System.out.println("dateFieldvalue="+datefieldvalue);
			}
			catch(org.openqa.selenium.StaleElementReferenceException e){
			//Repeat the code in try
			}
	}
}
