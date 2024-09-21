package AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.mavenproject.ConfigureReader;

import InterfaceProg.Information;

public class BookingConfirmation extends BaseClass implements Information {
	
static WebDriver driver;
	
	public BookingConfirmation(WebDriver driver ) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= Itinerary)
	private WebElement register;
	
	@FindBy(xpath=Logout)
	private WebElement logout;
	
//	public WebElement getregister() {
//		return register;
//	}
//	
//	public WebElement getlogout() {
//		return logout;
//	}
	
public void getInformation() {
		
		ConfigureReader cr=new ConfigureReader();
		
//		register.click();
		
		logout.click();
	
}
	
}
