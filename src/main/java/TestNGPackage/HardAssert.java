package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	private void Hassert() {
		
		String actual="Helen";
		String expected="helen";
		Assert.assertEquals(actual, expected);
		System.out.println("Validation");
	}

	}
