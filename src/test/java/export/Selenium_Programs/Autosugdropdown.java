package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosugdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*ChromeDriver driver1= new ChromeDriver();
		driver1.findElement(By.xpath("")).sendKeys(arg0);
		driver1.get("");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(arg0, arg1);
		driver1.close();
		driver1.quit();*/
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println("1");
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		WebElement sources = driver.findElement(By
				.xpath("//div[@id='react-autowhatever-1']/parent::div/input")); 
		// WebElement sources=
		// driver.findElement(By.cssSelector("input.react-autosuggest__input react-autosuggest__input--open"));
		System.out.println("2");
		sources.clear();
		sources.sendKeys("MUM");
		Thread.sleep(2000);
		sources.sendKeys(Keys.ENTER);
		sources.sendKeys(Keys.ARROW_DOWN);
		sources.sendKeys(Keys.ENTER);
		sources.submit(); //or we can use click method 
		//Action 
		Actions a= new Actions(driver);
		a.click(sources).build().perform();
		a.contextClick(sources).build().perform();
		a.moveToElement(sources).contextClick().build().perform();
		a.moveToElement(sources).click().build().perform();
	
		
		//How to set the size of browser window using Selenium
		Dimension d= new Dimension (150, 150);
		driver.manage().window().setSize(d);
		
		//WebDriverWait wt=new WebDriverWait(driver,1000);
	//	wt.until(ExpectedConditions.alertIsPresent());
		//wt.until(ExpectedConditions.elementToBeClickable(element));
		//wt.until(ExpectedConditions.elementToBeClickable(element));
		
		driver.switchTo().alert().getText();
		
		
		
		
		
		

	}
}
