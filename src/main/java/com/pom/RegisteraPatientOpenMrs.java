package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mavenproject.BaseClass;
import com.properties.Frm;

public class RegisteraPatientOpenMrs extends BaseClass implements OpenMrsInterface {
	
	@FindBy(xpath=Click)
	private WebElement button;
	
	@FindBy(id=Given)
	private WebElement givenname;
	
	@FindBy(name=NameFamily)
	private WebElement nameoffamily;
	
	@FindBy(xpath=Press)
	private WebElement ButtonPress;
	
	@FindBy(xpath=FGender)
	private WebElement gender;
	
	@FindBy(xpath= Press1)
	private WebElement ButtonPress1;
	
	@FindBy(name=Borndate)
	private WebElement birthdate;
	
	@FindBy(name=Bornmonth)
	private WebElement birthmonth;
	
	@FindBy(name=Bornyear)
	private WebElement birthyear;
	
	@FindBy(xpath=Press2)
	private WebElement ButtonPress2;
	
	@FindBy(id=HomeAddress)
	private WebElement Address;
	
	@FindBy(name=city)
	private WebElement City;
	
	@FindBy(name=State)
	private WebElement state;
	
	@FindBy(id=Nation)
	private WebElement country;
	
	@FindBy(id=PinCode)
	private WebElement postalcode;
	
	@FindBy(xpath=Press3)
	private WebElement ButtonPress3;
	
	@FindBy(xpath=phonenumber)
	private WebElement contactnumber;
	
	@FindBy(xpath=Press4)
	private WebElement ButtonPress4;
	
	@FindBy(name=relationship)
	private WebElement relative;
	
	@FindBy(xpath=PersonName)
	private WebElement Nameoftheperson;
	
	@FindBy(xpath=Press5)
	private WebElement  ButtonPress5;
	
	@FindBy(id=Confirm)
	private WebElement submit;
	
	public RegisteraPatientOpenMrs() {
		PageFactory.initElements(driver, this);
	}
	
public void EnterDetails() {
		
			clickElement(driver,button);
			inputValues(driver,givenname,Frm.getInstanceFrm().getInstanceConfigurationReader().getname());
			inputValues(driver,nameoffamily,Frm.getInstanceFrm().getInstanceConfigurationReader().getfamilyname());
			clickElement(driver,ButtonPress);
			clickElement(driver,gender);
			clickElement(driver,ButtonPress1);
			inputValues(driver,birthdate,Frm.getInstanceFrm().getInstanceConfigurationReader().getborndate());
			inputValues(driver,birthmonth,Frm.getInstanceFrm().getInstanceConfigurationReader().getbornmonth());
			inputValues(driver,birthyear,Frm.getInstanceFrm().getInstanceConfigurationReader().getbornyear());
			clickElement(driver,ButtonPress2);	
			inputValues(driver,Address,Frm.getInstanceFrm().getInstanceConfigurationReader().gethomeaddress());
			inputValues(driver,City,Frm.getInstanceFrm().getInstanceConfigurationReader().getcityname());
			inputValues(driver,state,Frm.getInstanceFrm().getInstanceConfigurationReader().getstate());
			inputValues(driver,country,Frm.getInstanceFrm().getInstanceConfigurationReader().getcountry());
			inputValues(driver,postalcode,Frm.getInstanceFrm().getInstanceConfigurationReader().getpostalcode());
			clickElement(driver,ButtonPress3);
			inputValues(driver,contactnumber,Frm.getInstanceFrm().getInstanceConfigurationReader().getPhoneNumber());
			clickElement(driver,ButtonPress4);
			inputValues(driver,relative,Frm.getInstanceFrm().getInstanceConfigurationReader().getrelative());
			inputValues(driver,Nameoftheperson,Frm.getInstanceFrm().getInstanceConfigurationReader().getPersonName());
			clickElement(driver,ButtonPress5);
			clickElement(driver,submit);
			
	}
	
	
	
	
	
	
	
	
	
	

}
