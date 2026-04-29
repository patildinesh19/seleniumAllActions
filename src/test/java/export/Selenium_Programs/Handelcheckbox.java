package export.Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelcheckbox {
	public static void main(String Args[]) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		int totalradio = driver.findElements(
				By.xpath("//input[@name='group1']")).size();
		System.out.println("Total Radio button on page" + totalradio);

		for (int i = 0; i < totalradio; i++) {
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String radiobuttonvalue = driver
					.findElements(By.xpath("//input[@name='group1']")).get(i)
					.getAttribute("value");
			System.out.println("Radio button value=" + radiobuttonvalue);
			if (radiobuttonvalue.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i)
						.click();
			}

			Thread.sleep(1000);
		}

	}
}
