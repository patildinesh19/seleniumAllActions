package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reactautomation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New_Selenium\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.cssSelector("input#gosuggest_inputSrc"));
		element.sendKeys("Pune");
		Thread.sleep(1000);
		WebElement values=driver.findElement(By.cssSelector("ul#react-autosuggest-1"));
		
		element.sendKeys(Keys.ARROW_DOWN);
		System.out.println(values.getText());
		element.sendKeys(Keys.ARROW_DOWN);
		System.out.println(values.getText());
		element.sendKeys(Keys.ARROW_DOWN);
		System.out.println(values.getText());
		element.sendKeys(Keys.ENTER);
		System.out.println("test complete");
		driver.close();
		

	}

}
