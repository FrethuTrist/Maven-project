package AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.mavenproject.ConfigureReader;

import InterfaceProg.ElementValues;

public class Adactinlogin extends BaseClass implements ElementValues {
	
	static WebDriver driver;
	
	
	public Adactinlogin(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=user_id)
	private WebElement uid;
	
	@FindBy(name=passcode)
	private WebElement psswrd;
	
	@FindBy(xpath=loginbotton)
	private WebElement loginbtn;
	
//	public WebElement getuid() {
//		return uid;
//	}
//
//	public WebElement getpsswrd() {
//		return psswrd;
//		
//	}
//	
//	public WebElement getloginbtn() {
//		return loginbtn;
//	
//	}
	
		public void getElementValues() {
			
		
		ConfigureReader cr=new ConfigureReader();
		
		
		inputValues(driver,uid,cr.getUserName());
		
		inputValues(driver,psswrd,cr.getpasword());
		
		loginbtn.click();
		
	}
}
	
