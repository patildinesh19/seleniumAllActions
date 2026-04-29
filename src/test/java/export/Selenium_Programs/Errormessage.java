package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Errormessage {

	public static void main(String[] args) 
	{
		//StaleElementReferenceException:
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
					
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("name"));
		firstname.sendKeys("Hi");
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		firstname.sendKeys("hello");
		
		

	}

}
