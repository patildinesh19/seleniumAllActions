package PageObject.automationexercise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Helper;

public class Home {
	
	private WebDriver driver;
	private By Logout = By.linkText("Logout");
	private By allproducts = By.cssSelector(".features_items .col-sm-4");
	private By AllProductIages = By.cssSelector(".features_items .col-sm-4 .productinfo img");
	private By AllProductNames = By.cssSelector(".features_items .col-sm-4 .productinfo p");
	private String MouseHoverOnProductStringXpath = "//div[contains(@class,'productinfo')]//p[contains(text(),'$VALUE$')]";
	private By AddtoCartForMOuseHoverElement = By.xpath(("//div[@class='overlay-content']//a[contains(text(),'Add to cart')]"));
	ArrayList<String> Productname = new ArrayList<String>();
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean verifylogin()
	{
		return driver.findElement(Logout).isDisplayed();
	}
	
	public int getAllproductCount()
	{
		return driver.findElements(allproducts).size();
	}
	
	public int verifyBrokenImage()
	{
		int totalnumberofbrokenimages = 0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allimages = driver.findElements(AllProductIages);
		for(int i=0;i<allimages.size();i++)
		{
			boolean imageLoaded = (Boolean) js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", allimages.get(i));
			if(!imageLoaded)
			{
				totalnumberofbrokenimages++;
				System.out.println("Broken Image URL : "+allimages.get(i).getAttribute("src"));
			}
		}
		return totalnumberofbrokenimages;
	}
	public ArrayList<String> getAllproductNames()
	{
		
		String singleproductname="NULL";
		List<WebElement> allproductsnames = driver.findElements(AllProductNames);
		for(int i=0;i<allproductsnames.size(); i++)
		{
			singleproductname = driver.findElements(AllProductNames).get(i).getText();
			Productname.add(singleproductname);
		}
		return Productname;
	}
	public void displyAllProductNames()
	{
		for(int i=0;i<Productname.size(); i++)
		{
			System.out.println("Product Name : "+Productname.get(i));
		}
	}
	public void mouseHoverProduct(String productname)
	{
		Helper helper = new Helper();
		String obectformouseover = helper.replacexpathvalue(MouseHoverOnProductStringXpath, productname);
		System.out.println("Object for mouse hover : "+obectformouseover);
		By MouseOverActualObect = By.xpath(obectformouseover);
		
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(MouseOverActualObect));
		WebElement product = driver.findElement(MouseOverActualObect);
		Actions action = new Actions(driver);
		action.moveToElement(product).perform();
		
	}
	
	public void clikOnAddToCartForMouseHoverProduct()
	{
		driver.findElement(AddtoCartForMOuseHoverElement).click();
	}
}
