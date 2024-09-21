package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
	private void propertySetting() {
		System.out.println("Property Setting");	
	}
	
	@BeforeTest
private void browserLaunch() {
		System.out.println("Browser Launch");
		}
	
	@BeforeClass
	private void urlLaunch() {
		System.out.println("url launch");
		}
	
	@BeforeMethod
private void Login() {
		System.out.println("login");	
	}
	
	@Test
private void LaptopBrand() {
		System.out.println("Lenovo");	
	}
	
	@Test
private void MobileBrand() {
		System.out.println("Samsung");	
	}
	
	@Test
private void WatchBrand() {
		System.out.println("IWatch");	
	}
	
	@AfterMethod
	private void Logout() {
			System.out.println("loging out");	
		}
	
	@AfterClass
	private void Closeurl() {
		System.out.println("UrlClosing");
		}
	
	@AfterTest
	private void Close() {
			System.out.println("close");
			}
	
	@AfterSuite
	private void terminate() {
		System.out.println("terminating");	
	}
	
}
