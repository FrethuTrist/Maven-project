package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mavenproject.BaseClass;

public class Loginpage extends BaseClass {

	public WebDriver driver;
	
	@FindBy(id= "nav-link-accountList")
	private WebElement signinbtn;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@type='submit']")
    private WebElement continuebtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id= "signInSubmit")
	private WebElement signinbtn1;
	
	@FindBy(xpath= "//div[contains(text(),'Enter a valid email address')]")
	private WebElement emailError;
	
	@FindBy(xpath= "//div[contains(text(),'Enter your email')]")
	private WebElement emptyEmail;
	
	@FindBy(xpath= "//*[@class='a-list-item']")
	private WebElement passwordError;
	
	@FindBy(xpath= "//div[contains(text(),'Enter your')]")
	private WebElement emptyPassword;
	
	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public boolean validLogin(ExtentTest extenttest) {
		try {	
		urllaunch("https://www.amazon.in/");
		clickElement(driver,signinbtn);
		inputValues(driver,emailid, "helenfreeda2701@gmail.com");
		clickElement(driver,continuebtn);
		inputValues(driver,password, "Karthick@0812");
		clickElement(driver,signinbtn1);
		String title=driver.getTitle();
		Assert.assertEquals(title, "Online Shopping site in India:Shop Online for Mobiles,Books,Watches,Shoes anf More");
		extenttest.log(Status.PASS, "Login Sucessfull");
	}catch (AssertionError e) {
		
		extenttest.log(Status.FAIL, "Login failed :" + e.getMessage());
		return false;
	}
	return true;
	}
	public void invalidMaidID() {
	 	
		urllaunch("https://www.amazon.in/");
		clickElement(driver,signinbtn);
		inputValues(driver,emailid, "helenfreeda2701@gmail");
		clickElement(driver,continuebtn);
		String emailError=driver.getTitle();
		Assert.assertEquals(emailError, "Enter a valid email address or phone number");	
	}	
	
public void invalidpassword() {
	 	
		urllaunch("https://www.amazon.in/");
		clickElement(driver,signinbtn);
		inputValues(driver,emailid, "helenfreeda2701@gmail.com");
		clickElement(driver,continuebtn);
		inputValues(driver,password,"Karthi@08");
		clickElement(driver,signinbtn1);
		String textpop=driver.getTitle();
		Assert.assertEquals(textpop, "Incorrect Password");	
	}	
	
public void nullmail() {
 	
	urllaunch("https://www.amazon.in/");
	clickElement(driver,signinbtn);
	clickElement(driver,continuebtn);
	String textpop=driver.getTitle();
	Assert.assertEquals(textpop, "Enter your mobile or phone number");	
}	

	
public void nullpassword() {
 	
	urllaunch("https://www.amazon.in/");
	clickElement(driver,signinbtn);
	inputValues(driver,emailid, "helenfreeda2701@gmail.com");
	clickElement(driver,continuebtn);
	clickElement(driver,signinbtn1);
	String textpop=driver.getTitle();
	Assert.assertEquals(textpop, "Enter your password");	
}	
	}
	
