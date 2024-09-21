package AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.mavenproject.ConfigureReader;

import InterfaceProg.WebDatas;

public class BookHotel extends BaseClass implements WebDatas {
	
static WebDriver driver;
	
	
	public BookHotel(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=Firstname)
	private WebElement Frstnm;
	
	@FindBy(id=Lastname)
	private WebElement lstnm;
	
	@FindBy(id=BillingAddress)
	private WebElement BlngAdd;
	
	@FindBy(id=CreditCardNum)
	private WebElement Ccn;
	
	@FindBy(id=CreditCardType)
	private WebElement Cct;
	
	@FindBy(name=ExpiryMonth)
	private WebElement Em;
	
	@FindBy(id= ExpiryYear)
	private WebElement Ey;
	
	@FindBy(id=CvvNumber)
	private WebElement Cvvnum;
	
	@FindBy(id=BookNow)
	private WebElement Bknow;
	
//	public WebElement getFrstnm() {
//		return Frstnm;
//	}
//	
//	public WebElement getlstnm() {
//		return lstnm;
//	}
//	
//	public WebElement getBlngAdd() {
//		return BlngAdd;
//	}
//	
//	public WebElement getCcn() {
//		return Ccn;
//	}
//	
//	public WebElement getCct() {
//		return Cct;
//	}
//	
//	public WebElement getEm() {
//		return Em;
//	}
//	
//	public WebElement getEy() {
//		return Ey;
//	}
//	
//	public WebElement getCvvnum() {
//		return Cvvnum ;
//	}
//	
//	public WebElement getBknow() {
//		return Bknow;
//	}	

	public void getWebDatas() {
		
		ConfigureReader cr=new ConfigureReader();
	
        inputValues(driver,Frstnm,cr.getFirstName());
		
		inputValues(driver,lstnm,cr.getlastname());
		
		inputValues(driver,  BlngAdd,cr.getBillingAddress());
		
		inputValues(driver,Ccn,cr.getCreditNumber());
		
		inputValues(driver, Cct,cr.getCreditType());
		
		inputValues(driver,Em,cr.getMonthExpiry());
		
		inputValues(driver,Ey,cr.getYearExpiry());
		
		inputValues(driver,Cvvnum,cr.getCvvNumber());
		
		 Bknow.click();
	}
}
	
	