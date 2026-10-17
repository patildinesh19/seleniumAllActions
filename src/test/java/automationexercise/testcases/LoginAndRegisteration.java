package automationexercise.testcases;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.automationexercise.Home;
import PageObject.automationexercise.Registeration;
import PageObject.automationexercise.Signup;
import base.Base;

public class LoginAndRegisteration extends Base {

	@BeforeMethod
	public void openapplication() throws InterruptedException, IOException {
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
		
		String application=pr.getProperty("URL");
		
		getDriver().get(application);
	}
	
	@Test
	public void Testcase_Registeration() {
		
		Registeration reg = new Registeration(getDriver());
		Signup signup = new Signup(getDriver());
		reg.clickonLoginandRegisterationLink();
		reg.enterName("Dinesh");
		reg.entersignupemail("fgfdgnbm49@gmail.com");
		reg.clickonsignupbutton();
		signup.selectTitle("Mr");
		Assert.assertEquals(signup.verifyname(), "Dinesh", "Name is matching");
		Assert.assertFalse(signup.verifyemailaddressisDisable(), "Email address is disable");
		signup.enterpassword("Dinesh@123");
		signup.selectday("22");
		signup.selectMonth("June");
		signup.selectYear("1991");
		signup.selectCountry("India");
		signup.enterFirstName("Dinesh");
		signup.enterLastName("Patil");
		signup.enteraddress1("Chinchwad");
		signup.enterState("Mahrashtra");
		signup.entercity("Pune");
		signup.enterzipcode("411103");
		signup.enterMobileNumber("9876543210");
		signup.clickOnCreateAccountButton();
		Assert.assertEquals(signup.verifyAccountCreatedText(), "ACCOUNT CREATED!", "Account created message is matching");
		signup.clickonContinueButton();
	}
	
	@Test
	public void VerifyPasswordRequiredField()
	{
		Registeration reg = new Registeration(getDriver());
		Signup signup = new Signup(getDriver());
		reg.clickonLoginandRegisterationLink();
		reg.enterName("Dinesh");
		reg.entersignupemail("Patildinesh59@gmail.com");
		reg.clickonsignupbutton();
		signup.clickOnCreateAccountButton();
		Assert.assertEquals(signup.validatePasswordFieldType(), "Please fill out this field.", "Password required message is matching");
		
		
	}
	@Test
	public void LoginAndVerifyallProductimageloaded()
	{
		Registeration reg = new Registeration(getDriver());
		Home homepage = new Home(getDriver());
		reg.loginintoApplication("patildinesh19@hotmail.com", "DD123@dd123");
		Assert.assertTrue(homepage.verifylogin(), "LOgin is successful");
		//find out total number of product present on page and verify all product image is loaded or not
		int totalnumberofproducts = homepage.getAllproductCount();
		System.out.println("Total number of Products Present on Page : " + totalnumberofproducts);	
		int totalnumberofbrokenimages = homepage.verifyBrokenImage();
		Assert.assertEquals(totalnumberofbrokenimages, 0, "All product images are loaded successfully");
		homepage.getAllproductNames();
		homepage.displyAllProductNames();		
	}
	
	@Test
	public void mouseHoverProductAndClickOnAddToCart()
	{
		Registeration reg = new Registeration(getDriver());
		Home homepage = new Home(getDriver());
		reg.loginintoApplication("patildinesh19@hotmail.com", "DD123@dd123");
		Assert.assertTrue(homepage.verifylogin(), "LOgin is successful");
		homepage.mouseHoverProduct("Sleeveless Dress");
		homepage.clikOnAddToCartForMouseHoverProduct();
		
	}
}
