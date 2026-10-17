package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.Base;
import base.Base1;

public class TestListener extends Base1 implements  ITestListener  {

	
	@Override
	public void onTestStart(ITestResult result14645) {
		// TODO Auto-generated method stub
		System.out.println("Test Started : "+result14645.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Passed: " + result.getName());
		takeScreenshot(result, "Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
        System.out.println("Test Failed: " + result.getName());
        takeScreenshot(result, "Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	/**
	 * Helper method to take screenshots for both pass and fail scenarios
	 */
	private void takeScreenshot(ITestResult result, String status) {
		WebDriver driver = Base1.driver;
		if (driver != null) {
			String fileName = "Screenshot_" + result.getName() + "_" + status + "_" 
				+ System.currentTimeMillis() + ".png";
			String filePath = "E:\\Karate_Project\\API_UI\\target\\Images\\" + fileName;
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File destination = new File(filePath);
				FileHandler.copy(source, destination);
				System.out.println("Screenshot saved: " + filePath);
			} catch (IOException e) {
				System.out.println("Failed to capture screenshot: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

}