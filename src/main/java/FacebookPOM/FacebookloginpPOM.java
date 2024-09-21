package FacebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginpPOM {
	
	static WebDriver loginDriver;
	
	@FindBy (id ="email")
	private WebElement mail;
	
	@FindBy (name ="pass")
	private WebElement password;
	
	@FindBy (name ="login")
	private WebElement loginbtn;
	
	@FindBy (xpath ="//a[text()='Forgotten password?']")
	private WebElement forgottenpassword;
	
	@FindBy (xpath ="//a[@role='role']")
	private WebElement Createaccount;
	
	public FacebookloginpPOM (WebDriver driver) {
		
		this.loginDriver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getmail() {
		return mail;
	}
	
	public WebElement getpassword() {
		return password;
	}
	
	public WebElement getloginbtn() {
		return loginbtn;
	}
	

}
