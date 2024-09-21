package AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.mavenproject.ConfigureReader;

import InterfaceProg.Datas;

public class AdactinSearchHotels extends BaseClass implements  Datas  {
	
	static WebDriver driver;
	
	public AdactinSearchHotels(WebDriver driver ) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= location)
	private WebElement place ;
	
	@FindBy(name=Hotels)
	private WebElement Hotel;
	
	@FindBy(xpath=RoomType)
	private WebElement Typeofroom;
	
	@FindBy(id=NoofRooms)
	private WebElement numofrooms;
	
	@FindBy(id=Chkin)
	private WebElement checkin;
	
	@FindBy(name= Chkout)
	private WebElement checkout;
	
	@FindBy(id=Adultsperroom)
	private WebElement adultrooms;
	
	@FindBy(xpath=Childrenperroom)
	private WebElement childrooms;
	
	@FindBy(id= Search)
	private WebElement Searchbtn;
	
//	public WebElement getplace() {
//		return place;
//	}
//	
//	public WebElement getHotel() {
//		return Hotel;
//	}
//	
//	public WebElement getTypeofroom() {
//		return Typeofroom;
//	}
//	
//	public WebElement getnumofrooms() {
//		return numofrooms;
//	}
//	
//	public WebElement getcheckin() {
//		return checkin;
//	}
//	
//	public WebElement getcheckout() {
//		return checkout;
//	}
//	
//	public WebElement getadultrooms() {
//		return adultrooms;
//	}
//	
//	public WebElement getchildrooms() {
//		return childrooms;
//	}
//	
//	public WebElement getSearchbtn() {
//		return Searchbtn;
//	}

	public void getDatas() {
	
		ConfigureReader cr=new ConfigureReader();
		
		inputValues(driver,place,cr.getlocation());
		
		inputValues(driver,Hotel,cr.gethotels());
		
		inputValues(driver, Typeofroom,cr.getroomtype());
		
		inputValues(driver,numofrooms,cr.getnumofrooms());
		
		inputValues(driver, checkin,cr.getcheckin());
		
		inputValues(driver,checkout,cr.getcheckout());
		
		inputValues(driver,adultrooms,cr.getadultsroom());
		
		inputValues(driver,childrooms,cr.getchildroom());
		
		Searchbtn.click();
	
	}	
}
