package POM_Manager;

import org.openqa.selenium.WebDriver;

import com.mavenproject.BaseClass;
import com.mavenproject.ConfigureReader;

import AdactinProject.AdactinSearchHotels;
import AdactinProject.Adactinlogin;
import AdactinProject.BookHotel;
import AdactinProject.BookingConfirmation;
import AdactinProject.SelectHotel;

public class PageObjectManager extends BaseClass {
	
static WebDriver driver;

	private Adactinlogin login;
	private AdactinSearchHotels searchHotel;
	private SelectHotel HotelSearch;
	private BookHotel HotelBook;
	private BookingConfirmation Confirmation;
	private ConfigureReader config;
	
	public Adactinlogin getAdactinpagemanager() {
		
		if(login==null) {
			
			login=new Adactinlogin(driver);
		}
		
		return login;	
	}
	
public AdactinSearchHotels getAdactinSearchpagemanager() {
		
		if(searchHotel==null) {
			
			searchHotel=new AdactinSearchHotels(driver);
		}
		
		return searchHotel;	
	}

public SelectHotel getSelectpagemanager() {
	
	if(HotelSearch==null) {
		
		HotelSearch=new SelectHotel(driver);
	}
	
	return HotelSearch;	
}

public BookHotel getBookhotelpagemanager() {
	
	if(HotelBook==null) {
		
		HotelBook=new BookHotel(driver);
	}
	
	return HotelBook;	
}

public BookingConfirmation getConfirmationpagemanager() {
	
	if(Confirmation==null) {
		
		Confirmation=new BookingConfirmation(driver);
	}
	
	return Confirmation;	
}

public ConfigureReader getConfigpagemanager() {
	
	if( config==null) {
		
		 config=new ConfigureReader();
	}
	
	return  config;	
}
	
}
