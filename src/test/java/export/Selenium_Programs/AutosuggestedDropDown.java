package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestedDropDown {

	public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		WebElement autosuggesteddropbox=driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		autosuggesteddropbox.sendKeys("Ban");
		Thread.sleep(1000);
		autosuggesteddropbox.sendKeys(Keys.DOWN);
		System.out.println("1");
		Thread.sleep(1000);
		autosuggesteddropbox.sendKeys(Keys.DOWN);
		System.out.println("2");
		Thread.sleep(1000);
		autosuggesteddropbox.sendKeys(Keys.DOWN);
		System.out.println("3");
		Thread.sleep(1000);
		autosuggesteddropbox.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script ="return document.getElementById(\"fromPlaceName\").value;"; //this is java frame
		//now we need to execute java frame
		
		js.executeScript(script);
		//above script returinig value of string so we need to take above script in string
		
		String serchvalue=(String) js.executeScript(script);
		System.out.println(serchvalue);
		
		System.out.println(autosuggesteddropbox.getText());
		driver.manage().deleteAllCookies();
	}

}
