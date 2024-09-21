package com.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.BaseClass;
import com.properties.Frm;



public class GeneralActionsOpenMrs extends BaseClass implements OpenMrsInterface {
	
	
	@FindBy(xpath=StartVisit)
	private WebElement startvisit;
	
	@FindBy(xpath=Confirm1)
	private WebElement confirmation;
	
	@FindBy(xpath=Attachments)
	private WebElement Attachment;
	
	@FindBy(xpath=UploadFile)
	private WebElement AttachFile;
	
	@FindBy(xpath=Caption)
	private WebElement caption;
	
	@FindBy(xpath=clickfile)
	private WebElement fileclick;
	
	public void GeneralActionsOpenMrs() {
		PageFactory.initElements(driver, this);
	}
	
public void Actions() throws AWTException, InterruptedException {
	
			clickElement(driver,startvisit);     
			clickElement(driver,confirmation);
			clickElement(driver,Attachment);
			clickElement(driver,AttachFile);
			Robot r=new Robot();
			r.delay(3000);
			StringSelection s= new StringSelection("C:\\SqlQueriespractice(Easy).PNG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			inputValues(driver,caption,Frm.getInstanceFrm().getInstanceConfigurationReader().getCaption());
			clickElement(driver,fileclick);			
			
}

}