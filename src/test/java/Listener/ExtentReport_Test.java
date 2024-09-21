package Listener;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.mavenproject.BaseClass;

public class ExtentReport_Test {
	
	public static ExtentTest extenttest;
	
	@BeforeSuite
    public void	extentReportStartUP() {
    	BaseClass base = new BaseClass();
    	base.extentReportStart(null);
    }
	
	@AfterSuite
	 public void extentReportEnd() throws IOException {
    	BaseClass base = new BaseClass();
    	base.extentReportTearDown(null);
    }
	
	
}
