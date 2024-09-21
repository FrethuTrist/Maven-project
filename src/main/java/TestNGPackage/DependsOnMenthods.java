package TestNGPackage;

import org.testng.annotations.Test;

public class DependsOnMenthods {
	
	@Test(priority=1,expectedExceptions =ArithmeticException.class,enabled=true)
	
	private void sampleOne() {
		
		System.out.println("SampleOne");
		int i=10/0;
	}
	
	@Test(priority=2)
	private void sampleTwo() {
		System.out.println("sampleTwo");
	}
	
	@Test(dependsOnMethods= {"sampleOne","sampleTwo"})
	private void sampleThree() {
		System.out.println("sampleThree");
	}

}
