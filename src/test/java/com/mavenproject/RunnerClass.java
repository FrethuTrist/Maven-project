package com.mavenproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import AdactinProject.AdactinSearchHotels;
import AdactinProject.Adactinlogin;
import AdactinProject.BookHotel;
import AdactinProject.BookingConfirmation;
import AdactinProject.SelectHotel;

public class RunnerClass extends BaseClass {

	public static void main(String[] args) throws IOException {
//		 TODO Auto-generated method stub
		
		launchbrowser("chrome");
		
		urllaunch("https://www.facebook.com/");
		
		getTitle() ;
		
		getCurrentUrl(WebDriver driver);
		
		WebElement email = driver.findElement(By.id("email"));
		inputValues(email, "Helen" );
		
		WebElement pswrd = driver.findElement(By.id("pass"));
		inputValues(pswrd, "Helen1234" );
		
		WebElement login = driver.findElement(By.name("login"));
		clickElement(login);
		
		
		navigateto("https://www.amazon.in/");
		
		navigateback();
		
		WebElement clickclick = driver.findElement(By.xpath("(//a[@class='nav-a'])[4]"));
        rightclick (clickclick);
		
		
		

//		ConfigureReader cr=new ConfigureReader();
//		
//		launchbrowser(cr.getBrowserName());
//		
//		urllaunch(cr.getUrl());
//		
//		Adactinlogin al=new Adactinlogin(driver);
//		
//		AdactinSearchHotels ash=new AdactinSearchHotels(driver);
//		
//		SelectHotel sl=new SelectHotel(driver);
//		
//		inputValues(driver,al.getuid(),cr.getUserName());
//		
//		inputValues(driver,al.getpsswrd(),cr.getpasword());
//		
//		clickElement(driver,al.getloginbtn());
//		
//		inputValues(driver,ash.getplace(),cr.getlocation());
//		
//		inputValues(driver,ash.getHotel(),cr.gethotels());
//		
//		inputValues(driver,ash.getTypeofroom(),cr.getroomtype());
//		
//		inputValues(driver,ash.getnumofrooms(),cr.getnumofrooms());
//		
//		inputValues(driver,ash.getcheckin(),cr.getcheckin());
//		
//		inputValues(driver,ash.getcheckout(),cr.getcheckout());
//		
//		inputValues(driver,ash.getadultrooms(),cr.getadultsroom());
//		
//		inputValues(driver,ash.getchildrooms(),cr.getchildroom());
//		
//		clickElement(driver,ash.getSearchbtn());
//		
//		clickElement(driver,sl.getradiobtn());
//		
//		clickElement(driver,sl.getContinuebtn());
		
//		ConfigureReader cr=new ConfigureReader();
//		
//		launchbrowser(cr.getBrowserName());
//		
//		urllaunch(cr.getUrl());
//		
//		Adactinlogin al=new Adactinlogin(driver);
//		al.getElementValues();
//	
//		AdactinSearchHotels ash=new AdactinSearchHotels(driver);
//		ash.getDatas();
//		
//		SelectHotel sh=new SelectHotel(driver);
//		sh.getValues();
//		
//		BookHotel bh=new BookHotel(driver);
//		bh.getWebDatas();
//		
//		BookingConfirmation bc=new BookingConfirmation(driver);
//		bc.getInformation();	
		
        
	}

}
