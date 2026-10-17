package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static org.testng.Assert.assertTrue;

import java.awt.Window;
import java.io.File;
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
import org.testng.annotations.Test;

import base.Base;
import base.Base1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Allwebfunctions extends Base1 {

	// public static WebDriverManager driver = null;
	// WebDriver driver =null;

	// String browser = "Chrome";
	// String browser = System.getProperty("browser");
	// public static WebDriver driver;

	@Test
	public void openapplication() throws InterruptedException {
		try {

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");

			List<WebElement> allradiobuttons = driver.findElements(By.name("radioButton"));
			System.out.println("Total number of webelements :" + allradiobuttons.size());
			allradiobuttons.get(1).click();
			WebElement selectedcheckbox = driver.findElement(By.xpath("//input[@value='radio3']"));
			selectedcheckbox.click();
			Assert.assertTrue(selectedcheckbox.isSelected(), "CheckBox is selected");

			// mouse over
			String Country = "Bhutan";
			driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Country);
			WebElement dropdownbox = driver.findElement(By.cssSelector("#ui-id-1"));
			WebElement selectcountry = driver
					.findElement(By.xpath("//ul[@id='ui-id-1']//div[contains(text(),'" + Country + "')]"));
			// selectcountry.click();
			// create object for Actions class
			Actions mouse = new Actions(driver);
			mouse.moveToElement(selectcountry).click().build().perform();

			System.out.println("Country is selected");

			// contextClick() = rightclick, //doubleClick() = doubleclick, // dragAndDrop()
			// = drag and drop

			WebElement MouseHover = driver.findElement(By.cssSelector("#mousehover"));
			if (Base1.browser.equalsIgnoreCase("FireFox")) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MouseHover);
			}
			mouse.moveToElement(MouseHover).build().perform();
			driver.findElement(By.linkText("Top")).click();

			// Drop down filed
			WebElement selectdropdwon = driver.findElement(By.id("dropdown-class-example"));
			Select select = new Select(selectdropdwon);
			select.selectByValue("option2");
			select.selectByVisibleText("Option3");
			select.selectByIndex(0);
			select.selectByIndex(1);
			// Iframe
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			System.out.println("Total frames: " + frames.size());
			System.out.println("frame count is calculated");
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
			if (browser.equalsIgnoreCase("FireFox")) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frame);
			}
			driver.switchTo().frame(frame);
			System.out.println("frame is selected as per aviliable");
			driver.findElement(By.xpath("//div[@class='logo']//a")).isDisplayed();
			List<WebElement> alllinksfromframe = driver.findElements(By.xpath("//li/a"));
			System.out.println("Totsal WebLinks under Frame : " + alllinksfromframe.size());
			WebElement morelink = driver.findElement(By.linkText("More"));
			mouse.moveToElement(morelink).build().perform();

			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
			wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Contact"))));
			driver.findElement(By.linkText("Contact")).click();
			Thread.sleep(1000);

			driver.switchTo().defaultContent();

			// Window Handling

			driver.findElement(By.cssSelector("#openwindow")).click();

			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();

			String parent = it.next();
			String child = it.next();

			driver.switchTo().window(child);
			System.out.println("Switch to Window url :" + driver.getCurrentUrl());

			System.out.println("Window Title :" + driver.getTitle());

			Assert.assertEquals(driver.findElement(By.xpath("//a[contains(text(),'Get This Domain')]")).getText(),
					"Get This Domain");
			driver.switchTo().window(parent);
			System.out.println("Switch to Window url :" + driver.getCurrentUrl());

			System.out.println("Parent window title :" + driver.getTitle());
			// Scroll down to specific element
			WebElement scrolldowinelement = driver.findElement(By.cssSelector("#mousehover"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", scrolldowinelement);
			Thread.sleep(1000);

			// take screenshot of full page
			String filePath = "E:\\Karate_Project\\API_UI\\target\\Images\\Screenshot_" + System.currentTimeMillis()
					+ ".png";
			TakesScreenshot ts = (TakesScreenshot) driver;
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
