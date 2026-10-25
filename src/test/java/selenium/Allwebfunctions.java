package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import static org.testng.Assert.assertTrue;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.Base1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Allwebfunctions extends Base {

	// public static WebDriverManager driver = null;
	// WebDriver driver =null;

	// String browser = "Chrome";
	// String browser = System.getProperty("browser");
	// public static WebDriver driver;
	@BeforeMethod
	public void lunchdempapp() throws IOException
	{
		pr = new Properties ();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\configuration.properties");
		pr.load(fp);
		String mavenvironment=System.getProperty("Envronment");
		//String environment = pr.getProperty("Envronment");
		if(mavenvironment.equalsIgnoreCase("QA")) {
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\QA.properties"));
		}
		else if(mavenvironment.equalsIgnoreCase("UAT")) {
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\UAT.properties"));
		}
		else if(mavenvironment.equalsIgnoreCase("PROD")) {
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\PROD.properties"));
		}
		
		String application=pr.getProperty("URLPracticesapp");
		
		getDriver().get(application);		
	}
	@Test
	public void openapplication() throws InterruptedException {
		try {

			

			List<WebElement> allradiobuttons = getDriver().findElements(By.name("radioButton"));
			System.out.println("Total number of webelements :" + allradiobuttons.size());
			allradiobuttons.get(1).click();
			WebElement selectedcheckbox = getDriver().findElement(By.xpath("//input[@value='radio3']"));
			selectedcheckbox.click();
			Assert.assertTrue(selectedcheckbox.isSelected(), "CheckBox is selected");

			// mouse over
			String Country = "Bhutan";
			getDriver().findElement(By.cssSelector("#autocomplete")).sendKeys(Country);
			WebElement dropdownbox = getDriver().findElement(By.cssSelector("#ui-id-1"));
			WebElement selectcountry = getDriver()
					.findElement(By.xpath("//ul[@id='ui-id-1']//div[contains(text(),'" + Country + "')]"));
			// selectcountry.click();
			// create object for Actions class
			Actions mouse = new Actions(getDriver());
			mouse.moveToElement(selectcountry).click().build().perform();

			System.out.println("Country is selected");

			// contextClick() = rightclick, //doubleClick() = doubleclick, // dragAndDrop()
			// = drag and drop

			WebElement MouseHover = getDriver().findElement(By.cssSelector("#mousehover"));
			if (Base1.browser.equalsIgnoreCase("FireFox")) {
				((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", MouseHover);
			}
			mouse.moveToElement(MouseHover).build().perform();
			getDriver().findElement(By.linkText("Top")).click();

			// Drop down filed
			WebElement selectdropdwon = getDriver().findElement(By.id("dropdown-class-example"));
			Select select = new Select(selectdropdwon);
			select.selectByValue("option2");
			select.selectByVisibleText("Option3");
			select.selectByIndex(0);
			select.selectByIndex(1);
			// Iframe
			List<WebElement> frames = getDriver().findElements(By.tagName("iframe"));
			System.out.println("Total frames: " + frames.size());
			System.out.println("frame count is calculated");
			WebElement frame = getDriver().findElement(By.xpath("//iframe[@id='courses-iframe']"));
			String mavenbrowsername=System.getProperty("browser");
			if (mavenbrowsername.equalsIgnoreCase("FireFox")) {
				((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", frame);
			}
			getDriver().switchTo().frame(frame);
			System.out.println("frame is selected as per aviliable");
			getDriver().findElement(By.xpath("//div[@class='logo']//a")).isDisplayed();
			List<WebElement> alllinksfromframe = getDriver().findElements(By.xpath("//li/a"));
			System.out.println("Totsal WebLinks under Frame : " + alllinksfromframe.size());
			WebElement morelink = getDriver().findElement(By.linkText("More"));
			mouse.moveToElement(morelink).build().perform();

			WebDriverWait wt = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
			wt.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.linkText("Contact"))));
			getDriver().findElement(By.linkText("Contact")).click();
			Thread.sleep(1000);

			getDriver().switchTo().defaultContent();

			// Window Handling

			getDriver().findElement(By.cssSelector("#openwindow")).click();

			Set<String> windows = getDriver().getWindowHandles();
			Iterator<String> it = windows.iterator();

			String parent = it.next();
			String child = it.next();

			getDriver().switchTo().window(child);
			System.out.println("Switch to Window url :" + getDriver().getCurrentUrl());

			System.out.println("Window Title :" + getDriver().getTitle());

			Assert.assertEquals(getDriver().findElement(By.xpath("//a[contains(text(),'Get This Domain')]")).getText(),
					"Get This Domain");
			getDriver().switchTo().window(parent);
			System.out.println("Switch to Window url :" + getDriver().getCurrentUrl());

			System.out.println("Parent window title :" + getDriver().getTitle());
			// Scroll down to specific element
			WebElement scrolldowinelement = getDriver().findElement(By.cssSelector("#mousehover"));

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].scrollIntoView(true);", scrolldowinelement);
			Thread.sleep(1000);

			// take screenshot of full page
			String filePath = "E:\\Karate_Project\\API_UI\\target\\Images\\Screenshot_" + System.currentTimeMillis()
					+ ".png";
			TakesScreenshot ts = (TakesScreenshot) getDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(filePath);
			FileHandler.copy(source, destination);

		} catch (NoSuchElementException e) {
			System.out.println("element not found " + e);

		} catch (TimeoutException e) {
			System.out.println("Wait Timeout" + e);
		} catch (NoSuchFrameException fm) {
			System.out.println("Frame is not Prent , please check frame details and execut the application" + fm);
		} catch (Exception e) {
			System.out.println("Application Failed execute it again :" + e);
		} /*finally {
			if (driver != null) {
				driver.quit();
			}
		}*/

	}

}
