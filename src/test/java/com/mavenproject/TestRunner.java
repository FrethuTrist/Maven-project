package com.mavenproject;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;
import com.utility.ReadandWrite;
import com.utility.SQLConnector;

public class TestRunner {
	
	
	public static void main(String[] args) throws SQLException, InvalidFormatException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	    	String username=ReadandWrite.ReadExcel(0,1);
		driver.findElement(By.id("username")).sendKeys(username);
		String password=ReadandWrite.ReadExcel1(1,1);
		driver.findElement(By.id("password")).sendKeys(password);
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		
		
	}
	
}
