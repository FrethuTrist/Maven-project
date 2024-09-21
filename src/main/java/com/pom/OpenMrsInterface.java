package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface OpenMrsInterface {

	String username_id="username";
	String password_id="password";
	String Location_xpath="//li[text()='Inpatient Ward']";
	String Login_id="loginButton";
	String Click="(//a[@type='button'])[4]";
	String Given="fr1028-field";
	String NameFamily="familyName";
	String Press="(//button[@type='button'])[3]";
	String FGender="//option[@value='F']";
	String Press1="(//button[@type='button'])[3]";
	String Borndate="birthdateDay";
	String Bornmonth="birthdateMonth";
	String Bornyear="birthdateYear";
	String Press2="(//button[@type='button'])[3]";
	String HomeAddress="address1";
	String city="cityVillage";
	String State="stateProvince";
	String Nation="country";
	String PinCode="postalCode";
    String Press3="(//button[@type='button'])[3]";
    String phonenumber="(//input[@type='text'])[14]";
    String Press4="(//button[@type='button'])[3]";
    String relationship="relationship_type";
    String PersonName="(//input[@type='text'])[15]";
    String Press5="(//button[@type='button'])[3]";
    String Confirm="submit";
    String StartVisit="(//li[@class='float-left'])[1]";
    String Confirm1="(//button[@class='confirm right'])[6]";
    String Attachments="(//a[@class='button task activelist'])[5]";
    String UploadFile="//div[text()='Click or drop a file here.']";
    String Caption="//textarea[@placeholder='Enter a caption']";
    String clickfile="//button[@class='confirm ng-binding']";
    String Redirect="//span[@class='PersonName-familyName']";
    String Endvisit="(//li[@class='float-left'])[7]";
    String Yes="(//button[@class='confirm right'])[5]";
    String StartVisit1="(//li[@class='float-left'])[1]";
    String Confirm2="(//button[@class='confirm right'])[6]";
    String CaptureVitals="(//a[@class='button task activelist'])[4]";
    String Height="w8";
    String Next="next-button";
    String Weight="50";
    String Next1="next-button";
    String SaveForm="save-form";
    String Save="//button[@type='submit']";
    String Endvisit1="(//a[@class='button task activelist'])[1]";
    String yes="(//button[@class='confirm right'])[8]";
    
    
    
    
    
    
    
	
	
	
	
	
}
