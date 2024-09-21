package AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.mavenproject.ConfigureReader;

import InterfaceProg.Values;

public class SelectHotel extends BaseClass implements Values{
	
static WebDriver driver;
	
	
	public SelectHotel(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=radiobutton)
	private WebElement radiobtn;
	
	@FindBy(id=Continue)
	private WebElement Continuebtn;
	
//	public WebElement getradiobtn() {
//		return radiobtn;
//	}
//	
//	public WebElement getContinuebtn() {
//		return Continuebtn;
//	}
	
public void getValues() {
		
		ConfigureReader cr=new ConfigureReader();
		
		radiobtn.click();
		
		Continuebtn.click();
		
	
}

}