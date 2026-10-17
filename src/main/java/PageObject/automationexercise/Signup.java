package PageObject.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Helper;

public class Signup {
	private WebDriver driver ;
	private String Title = "//input[@value='$VALUE$']";
	private By name = By.xpath("//input[@id='name']");
	private By emailaddress = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='password']");
	private By Dayobj = By.id("days");
	private By mothobj = By.id("months");
	private By yearobj = By.id("years");
	private By Firstname = By.cssSelector("#first_name");
	private By Lastname = By.cssSelector("#last_name");	
	private By address1= By.cssSelector("#address1");
	private By Country = By.cssSelector("#country");
	private By state = By.cssSelector("#state");
	private By city = By.cssSelector("#city");
	private By zipcode = By.cssSelector("#zipcode");
	private By mobileNumber = By.cssSelector("#mobile_number");
	private By createAccuontbutton = By.xpath("//button[contains(text(),'Create Account')]");
	private By AccountCreatedtext = By.xpath("//h2[@data-qa='account-created']/b");
	private By verifyContinueButton = By.xpath("//a[contains(text(),'Continue')]");
	public Signup(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectTitle(String title)
	{
		Helper helper = new Helper();
		String updatedxpath = helper.replacexpathvalue(Title, title);
		By updatedtitle = By.xpath(updatedxpath);
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(updatedtitle));
		driver.findElement(updatedtitle).click();
	}
	public String verifyname()
	{
		return driver.findElement(name).getAttribute("value");
	}

	public boolean verifyemailaddressisDisable()
	{
		return driver.findElement(emailaddress).isEnabled();
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void selectday(String day)
	{
		Select selectday = new Select(driver.findElement(Dayobj));
		selectday.selectByValue(day);
	}
	
	public void selectMonth(String month)
	{
		Select selectmonth = new Select(driver.findElement(mothobj));
		selectmonth.selectByVisibleText(month);
	}
	public void selectYear(String year)
	{
		Select selectyear = new Select(driver.findElement(yearobj));
		selectyear.selectByValue(year);
	}
	
	public void enterFirstName(String firstname)
	{
		driver.findElement(Firstname).sendKeys(firstname);
	}
	public void enterLastName(String lastname)
	{
		driver.findElement(Lastname).sendKeys(lastname);
	}
	
	public void enteraddress1(String address)
	{
		driver.findElement(address1).sendKeys(address);
	}
	public void enterState(String statevalue)
	{
		driver.findElement(state).sendKeys(statevalue);
	}
	public void entercity(String cityvalue)
	{
		driver.findElement(city).sendKeys(cityvalue);
	}
	public void enterzipcode(String zipcodevalue)
	{
		driver.findElement(zipcode).sendKeys(zipcodevalue);
		
	}
	public void selectCountry(String countryvalue)
	{
		Select select = new Select(driver.findElement(Country));
		select.selectByValue(countryvalue);
	}
	public void enterMobileNumber(String mobilenumbervalue)
	{
		driver.findElement(mobileNumber).sendKeys(mobilenumbervalue);
	}
	public void clickOnCreateAccountButton()
	{
		driver.findElement(createAccuontbutton).click();
	}
	public String verifyAccountCreatedText()
	{
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(500));
		wait.until(ExpectedConditions.presenceOfElementLocated(AccountCreatedtext));
		return driver.findElement(AccountCreatedtext).getText();		
	}
	
	public void clickonContinueButton()
	{
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(verifyContinueButton));
		driver.findElement(verifyContinueButton).click();
	}
	public String validatePasswordFieldType()
	{
		return driver.findElement(password).getDomProperty("validationMessage");
	}
}
