package com.mavenproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	// static WebDriver driver;
	 
	 public static WebDriver driver;
	 
	 public static ExtentReports extentReports;
	 
	 public static File file;
	
	//1. Browser Launch
	protected static WebDriver launchbrowser(String browsername) {
		
		try {
		if(browsername.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("edge")){
			
			driver = new EdgeDriver();
			
		}else {
			
			System.out.println("Invalid browser name");
		}
		 
		driver.manage().window().maximize();
			
	}catch(Exception e) {
		e.printStackTrace();
		}
		return driver;
	}
	
	//2.Get Url
	
	protected static void urllaunch(String url) {
	
		try {
		driver.get(url);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	//3.Get Title
	
	protected static void getTitle() {
		try {
			String getTitle=driver.getTitle();
			System.out.println("The title of the Window is :"+ getTitle);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 4.Current URL
	
	protected static void getCurrentUrl(WebDriver driver) {
	try {
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current Url:"+ currentUrl);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
	
	//5. Click
	
	protected static void clickElement(WebDriver driver,WebElement element) {
	try {	
		element.click();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	//6. Sendkeys
	
	protected static void inputValues(WebDriver driver,WebElement element,String Value) {
		try {
		
		element.sendKeys(Value);	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public static void extentReportStart(String location) {
		extentReports=new ExtentReports();
		file=new File(location);
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version",System.getProperty("java.version"));
		
	}
	
	public static void extentReportTearDown(String location) throws IOException {
		extentReports.flush();
		file=new File(location);
		Desktop.getDesktop().browse((file).toURI());	
	}
	
	public String takeScreenshot() throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		String timeStamp =new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File scrfile= screenshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("Screenshot\\.png" + "_" + timeStamp+ ".png");
		FileUtils.copyFile(scrfile, destfile);
		return destfile.getAbsolutePath();
	}
	
	
	public static void validation(WebDriver act, String ect) {
		Assert.assertEquals(act.getTitle(), ect);
	}
	//7.Screenshot
	
	protected static void takeScreenshot(WebDriver driver,String filename,String format) {
		try {
			
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\mavenproject\\Screenshot" + "\\" + filename +".");
		
		FileHandler.copy(src, des);
			
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	//8. Navigate To
	
	protected static void navigateto(WebDriver driver, String navigateurl) {
		try {
			driver.navigate().to(navigateurl);	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	//9. Navigate Methods
	
	protected static void navigateMethods(WebDriver driver, String navigateMethodsName) {
	 try {
		 
		 if(navigateMethodsName.equalsIgnoreCase("forward")) {
				driver.navigate().forward();				
	 } else if(navigateMethodsName.equalsIgnoreCase("back")) {
			driver.navigate().back();
	 }else if(navigateMethodsName.equalsIgnoreCase("refresh")) {
           driver.navigate().refresh();
	 }
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
	
	//10.Get Text
		protected static void getText(WebDriver driver,WebElement element) {
	try {	
		String text = element.getText();
		System.out.println(text);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
		// 11.Actions
		
		protected static void action(WebDriver driver,WebElement element) {
		try {
			
			Actions action=new Actions(driver);
			
			action.moveToElement(element).perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
}

//	12.WebMethods (Visibility Check Element)

protected static void elementPresent(WebDriver driver,WebElement element,String Visibility) {
	
	boolean elementIs=false;
	try {
		if( Visibility.equalsIgnoreCase("IsEnabled")) {
			 elementIs=element.isEnabled();
		}else if( Visibility.equalsIgnoreCase("IsDisplayed")) {
			elementIs=element.isDisplayed();
		}
		else if(Visibility.equalsIgnoreCase("IsSelected")) {
			elementIs=element.isSelected();
		}else {
			System.out.println("Enter proper visibility type");
		}
	System.out.println("Element is present :"+ elementIs);
	
}catch(Exception e) {
	e.printStackTrace();
}

}
//13.waitConcept
protected static void waitTime(WebDriver driver, int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}

//14.JavaScript
protected static void javascript(WebDriver driver, String Value) {
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript(Value);
}
	

//15.close

protected static void CloseWindow() {
		driver.close();
}

//16.Clear

protected static void ClearMethod(WebDriver driver,WebElement element) {
	try {
		element.clear();
	}catch (Exception e) {
		e.printStackTrace();
	}
}


//17.Quit

protected static void browserTerminate() {
	
	driver.quit();
}
}