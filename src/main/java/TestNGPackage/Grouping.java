package TestNGPackage;

import org.testng.annotations.Test;

public class Grouping {
	
	

	@Test(groups = "VEG")
	
	private void idly() {
		System.out.println("Idly");
	}
	

	@Test(groups = "VEG")
	
	private void sambar() {
		System.out.println("Sambar");
	}
	

	@Test(groups = "VEG")
	
	private void curd() {
		System.out.println("Curd");
	}
	

	@Test(groups = "NONVEG")
	
	private void briyani() {
		System.out.println("Briyani");
	}
	
	
	@Test(groups = "NONVEG")
	
	private void chicken65() {
		System.out.println("Chicken65");
	}
	

	@Test(groups = "NONVEG")
	
	private void fish() {
		System.out.println("Fish");
	}
	

	@Test(groups = "EC")
	
	private void laptop() {
		System.out.println("LapTop");
	}
	

	@Test(groups = "EC")
	
	private void mobile() {
		System.out.println("Mobile");
	}
	

	@Test(groups = "EC")
	
	private void watch() {
		System.out.println("Watch");
	}

}
