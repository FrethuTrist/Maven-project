package com.runner;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mavenproject.BaseClass;
import com.pom.GeneralActionsOpenMrs;
import com.pom.LoginPageOpenMrs;
import com.pom.Loginpage;
import com.pom.RedirectOpenMrs;
import com.pom.RegisteraPatientOpenMrs;
import com.properties.Frm;

import Listener.ExtentReport_Test;
import Listener.ITestListenerClass;

@Listeners(ITestListenerClass.class)


public class OpenMrsRunner extends BaseClass{
	
	@BeforeTest
	public static void setUp() {
	launchbrowser(Frm.getInstanceFrm().getInstanceConfigurationReader().getBrowser());
	}
	
	@Test
	public static void validLoginTest() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Email Id and Valid Password");
		LoginPageOpenMrs  lp= new LoginPageOpenMrs();
		Assert.assertTrue(lp.validLogin(ExtentReport_Test.extenttest));
		}
	
	@Test
	public static void Registerpatient() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Register Patient Details");
		RegisteraPatientOpenMrs  Rp= new RegisteraPatientOpenMrs();
		Rp.EnterDetails();
		}
	
	@Test
	public static void Generalactions() throws AWTException, InterruptedException {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Enter the Given Name");
		GeneralActionsOpenMrs  Ga= new GeneralActionsOpenMrs();
		Ga.Actions();
		}
	
	@Test
	public static void NavigateBack() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Enter the Given Name");
		RedirectOpenMrs  Rd= new RedirectOpenMrs();
		Rd.Redirecting();
		}
	
@AfterTest
public static void termination() {
	browserTerminate();
}

@BeforeSuite
private void extentStartUp() {
	extentReportStart("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\mavenproject\\Reports");
}

@AfterSuite
private void extentReportEnd() throws IOException {
	extentReportTearDown("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\mavenproject\\Reports\\index.html");
}
}