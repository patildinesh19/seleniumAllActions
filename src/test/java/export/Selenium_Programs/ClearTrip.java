package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		WebElement adultDroupbox = driver.findElement(By
				.cssSelector("[id='Adults']"));
		Select audeltValue = new Select(adultDroupbox);
		audeltValue.selectByValue("6");

		Thread.sleep(5000);
		// driver.findElement(By.cssSelector("[name='depart_date']")).click();
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();

		driver.findElement(
				By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active"))
				.click();

		driver.findElement(By.xpath("//a[@title='More search options']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='airline']")).sendKeys(
				"IndiGo (6E)");
		driver.findElement(By.xpath("//input[@name='airline']")).sendKeys(
				Keys.ENTER);
		Thread.sleep(1000);
		
	String str=	driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText();
	System.out.println("Error Message:"+str);
	if (str.contains("Sorry, but we can't continue until you fix everything that's marked in RED"));
	{
		//Assert.assertTrue("Error message is correct", true);

	}
	
}
}

