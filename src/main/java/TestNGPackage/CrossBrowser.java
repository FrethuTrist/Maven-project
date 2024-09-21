package TestNGPackage;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.mavenproject.BaseClass;

public class CrossBrowser extends BaseClass {
	
	
	@Test
	private void firefox() {
		launchbrowser("firefox");
		urllaunch("https://www.google.com/");
		System.out.println("Browser ID: "+ Thread.currentThread().getId());
		browserTerminate();	
	}
	
	@Test
	private void Chrome() {
		launchbrowser("chrome");
		urllaunch("https://www.google.com/");
		System.out.println("Browser ID: "+ Thread.currentThread().getId());
		browserTerminate();	
	}
	
	@Test
	private void edge() {
		launchbrowser("edge");
		urllaunch("https://www.google.com/");
		System.out.println("Browser ID: "+ Thread.currentThread().getId());
		browserTerminate();	
	}
}
