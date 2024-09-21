package TestNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPractices {
	
	@Test(dataProvider="login")
	
	public void login(String user,String pass) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
	//	driver.quit()
	
	}
	
		@DataProvider(name="login")
		public Object[][] dataSet() {
			
			return new Object [][]
					
					{{"Admin","admin123"},{"Admin","admin"},{" ","Admin"}};
		}
}
		
					
