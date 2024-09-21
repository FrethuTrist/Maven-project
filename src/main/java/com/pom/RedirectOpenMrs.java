package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.properties.Frm;

public class RedirectOpenMrs extends BaseClass implements OpenMrsInterface {
	
	@FindBy(xpath=Redirect)
	private WebElement redirecting;
	
	@FindBy(xpath=Endvisit)
	private WebElement visit;
	
	@FindBy(xpath=Yes)
	private WebElement yesbutton;
	
	@FindBy(xpath=StartVisit1)
	private WebElement startvisit1;
	
	@FindBy(xpath=Confirm2)
	private WebElement confirm2;
	
	@FindBy(xpath=CaptureVitals)
	private WebElement capturevitals;                         
	
	@FindBy(id=Height)
	private WebElement height;   
	
	@FindBy(id=Next)
	private WebElement Buttonnext; 
	
	@FindBy(name=Weight)
	private WebElement weight; 
	
	@FindBy(id=Next1)
	private WebElement Buttonnext1; 
	
	@FindBy(id=SaveForm)
	private WebElement saveform; 
	
	@FindBy(xpath=Save)
	private WebElement save; 
	
	@FindBy(xpath=Endvisit1)
	private WebElement endvisit1; 
	
	@FindBy(xpath=yes)
	private WebElement yess; 
	
	
	
	public void  RedirectOpenMrs() {
		PageFactory.initElements(driver, this);
	}
	
	public void Redirecting() {
		
		clickElement(driver,redirecting);
		System.out.println("Successfully file Attached");
		System.out.println("One entry,current date with Attachment Upload tag Successfully Visible");
		clickElement(driver,visit);
		clickElement(driver,yesbutton);
		clickElement(driver,startvisit1);
		clickElement(driver,confirm2);
		clickElement(driver,capturevitals);
		inputValues(driver,height,Frm.getInstanceFrm().getInstanceConfigurationReader().getHeight());
		clickElement(driver,Buttonnext);
		inputValues(driver,weight,Frm.getInstanceFrm().getInstanceConfigurationReader().getWeight());
		clickElement(driver,Buttonnext1);
		clickElement(driver,saveform);
		clickElement(driver,save);
		clickElement(driver,endvisit1);
		clickElement(driver,yess);
	}

}
