package TestNGPackage;

import org.testng.annotations.Test;

import com.mavenproject.BaseClass;

public class Priority extends BaseClass {
	
	@Test(priority=5)
	private void firefox() {
		launchbrowser("firefox");
		urllaunch("https://www.google.com/");
		browserTerminate();	
	}
	
	@Test(priority=-5)
	private void Chrome() {
		launchbrowser("chrome");
		urllaunch("https://www.google.com/");
		browserTerminate();	
	}
	
	@Test(priority=3)
	private void edge() {
		launchbrowser("edge");
		urllaunch("https://www.google.com/");
		browserTerminate();	
	}
}

