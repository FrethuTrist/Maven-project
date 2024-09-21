package Runner;

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
import com.pom.Loginpage;

import Listener.ExtentReport_Test;
import Listener.ITestListenerClass;

@Listeners(ITestListenerClass.class)


 public class AmazonRunner extends BaseClass{
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void setUp() {
		driver=BaseClass.launchbrowser("chrome");
	}
	
	@Test
	public static void validLoginTest() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid Email Id and Valid Password");
		Loginpage lp= new Loginpage(driver);
		Assert.assertTrue(lp.validLogin(ExtentReport_Test.extenttest));
		}
	
	@Test
	public static void invalidLogin() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email Id");
		Loginpage lp= new Loginpage(driver);
		lp.invalidMaidID();
	}
		
	@Test
	public static void invalidpassword() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email Id");
		Loginpage lp= new Loginpage(driver);
		lp.invalidpassword();
	}
	
	@Test
	public static void emptymail() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email Id");
		Loginpage lp= new Loginpage(driver);
		lp.nullmail();
	}
	
	@Test
	public static void emptypassword() {
		ExtentReport_Test.extenttest=extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid Email Id");
		Loginpage lp= new Loginpage(driver);
		lp.nullpassword();
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
