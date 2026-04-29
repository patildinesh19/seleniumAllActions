package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class variableAssignment 
{
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String checkboxlable= driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println("Check box lable:"+checkboxlable);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	//	WebElement dropdown=driver.findElement(By.cssSelector("[id='dropdown-class-example']"));
		Select dropdownvalue=new Select(dropdown);
		//dropdownvalue.selectByValue(checkboxlable);
		dropdownvalue.selectByVisibleText(checkboxlable);
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(checkboxlable);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println("Alert text:"+alerttext);
		
		if(alerttext.contains(checkboxlable))
			
		{
			System.out.println("Pass");
		}
		driver.switchTo().alert().accept();
		
	}
}
