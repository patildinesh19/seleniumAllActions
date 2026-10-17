package PageObject.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registeration {
	
	private WebDriver driver;
	private By loginandregisterationlink = By.xpath("//a[contains(text(),' Signup / Login')]");
	private By  name = By.xpath("//input[contains(@data-qa,'signup-name')]");
	private By singupemail = By.xpath("//input[contains(@data-qa,'signup-email')]");
	private By loginemail = By.xpath("//input[contains(@data-qa,'login-email')]");
	private By signupbutton = By.xpath("//button[contains(@data-qa,'signup-button')]");
	private By password = By.xpath("//input[@data-qa='login-password']");
	private By loginButton = By.xpath("//button[@data-qa='login-button']");
	public Registeration(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonLoginandRegisterationLink()
	{
		driver.findElement(loginandregisterationlink).click();
	}
	
	public void enterName(String username)
	{
		driver.findElement(name).sendKeys(username);
	}
	public void entersignupemail(String email)
	{
		driver.findElement(singupemail).sendKeys(email);
	}
	public void clickonsignupbutton()
	{
		driver.findElement(signupbutton).click();
	}
	public void enterLoginEmail(String email)
	{
		driver.findElement(loginemail).sendKeys(email);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickonLoginButon()
	{
		driver.findElement(loginButton).click();
	}
	
	public void loginintoApplication(String email, String pwd)
	{
		clickonLoginandRegisterationLink();
		enterLoginEmail(email);
		enterPassword(pwd);
		clickonLoginButon();
	}
}
