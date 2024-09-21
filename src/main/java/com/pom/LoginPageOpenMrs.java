package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mavenproject.BaseClass;
import com.properties.Frm;

public class LoginPageOpenMrs  extends BaseClass implements OpenMrsInterface{
	
	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(id=password_id)
	private WebElement password;
	
	@FindBy(xpath=Location_xpath)
	private WebElement location;
	
	@FindBy(id=Login_id)
	private WebElement login;
	
	public LoginPageOpenMrs() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validLogin(ExtentTest extenttest) {
		
		try {
			urllaunch(Frm.getInstanceFrm().getInstanceConfigurationReader().getUrl());
			inputValues(driver,username,Frm.getInstanceFrm().getInstanceConfigurationReader().getusername());
			inputValues(driver,password,Frm.getInstanceFrm().getInstanceConfigurationReader().getpassword());
			clickElement(driver,location);
			clickElement(driver,login);
			validation(driver,Frm.getInstanceFrm().getInstanceConfigurationReader().getTitle());
			extenttest.log(Status.PASS, "Login Successfull");	
		}catch (AssertionError e) {
			extenttest.log(Status.FAIL, "Login Failed" + e.getMessage());
			return false;
		}
		return true;
	}
	

}
