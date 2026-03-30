package selenium;
import java.util.List;
import java.util.NoSuchElementException;
import java.awt.Window;
import java.time.Duration;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Allwebfunctions 
{
	//public static WebDriverManager driver = null;
	//WebDriver driver =null;
		
	@Test
	public void openapplication() throws InterruptedException {
			
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    //implcit wait
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(2000));
	    List<WebElement> allradiobuttons = driver.findElements(By.name("radioButton"));
	    System.out.println("Total number of webelements :"+allradiobuttons.size());
	    allradiobuttons.get(1).click();
	    driver.findElement(By.xpath("//input[@value='radio3']")).click();
	    
	    // mouse over 
	    String Country = "Bhutan";
	    driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Country);
	    WebElement dropdownbox = driver.findElement(By.cssSelector("#ui-id-1"));
	    WebElement selectcountry = driver.findElement(By.xpath("//ul[@id='ui-id-1']//div[contains(text(),"+Country+")]"));
	    //selectcountry.click();
	    		//create object for Actions class
	    Actions mouse = new Actions(driver);
	    mouse.moveToElement(selectcountry).click().build().perform();
	    
	    // contextClick() = rightclick, //doubleClick() = doubleclick, // dragAndDrop() = drag and drop	  
	    
	    WebElement MouseHover=  driver.findElement(By.cssSelector("#mousehover"));
	    mouse.moveToElement(MouseHover).build().perform();
	    driver.findElement(By.linkText("Top")).click();
	    
	    //Drop down filed
	    WebElement selectdropdwon = driver.findElement(By.id("dropdown-class-example"));
	    Select select = new Select(selectdropdwon);
	    select.selectByValue("option2");	
	    select.selectByVisibleText("Option3");
	    select.selectByIndex(0);
	    select.selectByIndex(1);
	    
	    // Iframe
	    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	    System.out.println("Total frames: " + frames.size());
	    
	    WebElement frame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
	    driver.switchTo().frame(frame);
	     System.out.println("frame is selected");
	   driver.findElement(By.xpath("//div[@class='logo']//a")).isDisplayed();
		   List<WebElement> alllinksfromframe =  driver.findElements(By.xpath("//li/a"));
		  System.out.println("Totsal WebLinks under Frame : "+alllinksfromframe.size());	    
		  WebElement morelink = driver.findElement(By.linkText("More"));
		  mouse.moveToElement(morelink).build().perform();
		  
		 
		  WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Contact"))));
			driver.findElement(By.linkText("Contact")).click();
			Thread.sleep(1000);
		
	   driver.switchTo().defaultContent();
	    driver.close();

	    
	}

	
}
