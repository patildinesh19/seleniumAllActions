package export.Selenium_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newscenarious {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int count=0;
		System.setProperty("webdriver.chrome.driver", "C:\\New_Selenium\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//find the count of links on website
		
		int countoflink=driver.findElements(By.tagName("a")).size();
		System.out.println("count of links"+countoflink);
		
		//find the links count from footer section

		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); // limiting webdriver scop
		int totallinksfromfooter=footerdriver.findElements(By.tagName("a")).size();
		System.out.println("Total links from footer"+totallinksfromfooter);
		
		// verify all links under footer are worknig are not and take title for each link
		// logic : open each link in seperate tab and take title
		
		for (int i=0; i<totallinksfromfooter; i++)
		{
			//go to each link and open in tab
			String clinckonlinktab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clinckonlinktab); //click on each link
			Thread.sleep(1000);
		}
		
		Set<String> ids=driver.getWindowHandles();
		
		Iterator<String>it=ids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());		
			
			String str=driver.getTitle();
			System.out.println("Window name"+str);
			if(str.equals("404 Not Found"))
			{	
				System.out.println("link is broken");
				count++;				
			}
		
		}
		System.out.println("number of broken links="+count);
		
		
	
		
		

	}

}
