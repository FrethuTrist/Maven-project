package TestNGPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTest implements IRetryAnalyzer  {
	
	private int retryCount=0;
	
	private static final int maxCount=5;
	
	public boolean retry(ITestResult result) {
		
		if(retryCount<maxCount) {
			retryCount ++;
			return true;
		}
		return false;
	}
	

}
