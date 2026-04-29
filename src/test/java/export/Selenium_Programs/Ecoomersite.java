package export.Selenium_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecoomersite {
	public static void main(String[] args) throws InterruptedException {
		// take required item in array

		String[] vegItemArray = { "Cucumber", "Beetroot", "Beans" };

		// if want to compair item present in array then first arry to array
		// lsit
		List<String> vegItemList = Arrays.asList(vegItemArray);
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		// implicit wait for all steps
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		// get page title
		String str = driver.getTitle();
		System.out.println("Page Tilre :" + str);

		selectItems(driver, vegItemArray);
		verifyItemcount(driver, vegItemArray);
		verifycheckoutitems(driver);
		

	}

	private static void verifycheckoutitems(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		System.out.println("clicked on checkout button");
		
		//explicit wait 
		//WebDriverWait wt = new WebDriverWait(driver,1000);
		
	//	wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.promoCode")));
		System.out.println("explisit Wait sucess ");
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		String promocodetext=driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println("promo code text:"+promocodetext);
		
		
	}

	public static void verifyItemcount(WebDriver driver, String[] vegItemArray) {
		// TODO Auto-generated method stub
		int i = 0;
		WebElement Item_price_WEbtable = driver.findElement(By
				.xpath("//div[@class='cart-info']/table"));
		List<WebElement> row_in_Item_price_WEbtable = Item_price_WEbtable
				.findElements(By.tagName("tr"));
		int total_row_number_Item_price_WEbtable = row_in_Item_price_WEbtable
				.size();
		System.out.println("Total row number :"
				+ total_row_number_Item_price_WEbtable);
		for (i = 0; i < total_row_number_Item_price_WEbtable; i++) {
			String row_value = row_in_Item_price_WEbtable.get(i).getText();
			if (row_value.contains("Items")) {
				List<WebElement> cluman_under_row = row_in_Item_price_WEbtable
						.get(i).findElements(By.tagName("td"));
				int total_columan = cluman_under_row.size();
				System.out.println("Total Columan under row:" + total_columan);

				String totalno_veg_selected = cluman_under_row.get(2).getText();
				System.out.println("Total_no_Veg_selected:"
						+ totalno_veg_selected);
				if (totalno_veg_selected.contains("3"))
					;
				{
					System.out.println("Correct number if Veg Selectd");
				}
			}
		}
	}

	public static void selectItems(WebDriver driver, String[] vegItemArray) {
		// TODO Auto-generated method stub
		// if required to take all item present on page with same xpath then use
		// Weblist object
		int i = 0;
		int j = 0;
		List<String> vegItemList = Arrays.asList(vegItemArray);
		List<WebElement> allvegitems = driver.findElements(By
				.cssSelector("h4.product-name"));
		// find out how many number of same xpath item present on page
		int allVegCount = allvegitems.size();
		System.out.println("Total Veg Count :" + allVegCount);
		for (i = 0; i < allVegCount; i++) {
			// print all veg name with weight means print all xpath item name
			String vegNameWithWeight = allvegitems.get(i).getText();
			System.out.println("Veg Name with Weight : " + vegNameWithWeight);

			// for comparing item in array list we need to split actual veg name
			// which contani vehnam - 1 Kg
			String[] itemName = allvegitems.get(i).getText().split("-");
			// below trim method will remove white space
			String actualVegName = itemName[0].trim();

			// below will print Veg name without weight
			System.out.println("Veg No :" + i);
			System.out.println("All Veng Name without Weight" + actualVegName);
			if (vegItemList.contains(actualVegName)) {
				j++;
				// Click on Add to card button
				driver.findElements(
						By.xpath("//div[@class='product-action']/button"))
						.get(i).click();
				if (j == vegItemArray.length) {

					break;
				}

			}

		}

	}

}
