package Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.mavenproject.BaseClass;

public class ITestListenerClass extends BaseClass implements ITestListener{

	public String testName;
	public String methodName;
	
	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			ExtentReport_Test.extenttest.pass(result.getMethod() + "  : " + " Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ExtentReport_Test.extenttest.fail(result.getMethod() + "  : " + " Test fail",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void onTestSkipped(ITestResult result) {
//		ExtentReport_Test.extenttest.pass(result.getMethod() + "  : " + " Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		ExtentReport_Test.extenttest.pass(result.getMethod() + "  : " + " Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		ExtentReport_Test.extenttest.pass(result.getMethod() + "  : " + " Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		ExtentReport_Test.extenttest.pass(result.getMethod() + "  : " + " Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		ExtentReport_Test.extenttest.pass(result.getMethod() + "  : " + " Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
//	}
//	
	

}
