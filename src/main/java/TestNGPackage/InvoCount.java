package TestNGPackage;

import org.testng.annotations.Test;

import com.mavenproject.BaseClass;

public class InvoCount extends BaseClass {
	
	@Test(invocationCount=5)
	private void firefox() {
		launchbrowser("firefox");
		urllaunch("https://www.google.com/");
		browserTerminate();	
	}
	
	@Test
	private void Chrome() {
		launchbrowser("chrome");
		urllaunch("https://www.google.com/");
		browserTerminate();	
	}
	
	@Test
	private void edge() {
		launchbrowser("edge");
		urllaunch("https://www.google.com/");
		browserTerminate();	
	}
}

