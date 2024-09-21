package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
	FileInputStream fis;
	
	public Properties ConfigFile() {
		
		File f=new File("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\mavenproject\\src\\main\\java\\com\\properties\\Data.properties");
		
		try {
			fis=new FileInputStream(f);
		}catch (FileNotFoundException e) {
			
		}
		Properties p=new Properties();
		try {
			p.load(fis);
		}catch (Exception e) {
			
		}
		return p;
	}
	
	public String getBrowser() {
		String browser =ConfigFile().getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url =ConfigFile().getProperty("url");
		return url;
	}
	
	public String getusername() {
		String username =ConfigFile().getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password =ConfigFile().getProperty("password");
		return password;
	}
	
	public String getTitle() {
		String title =ConfigFile().getProperty("title");
		return title;
	}
	
	public String getname() {
		String name =ConfigFile().getProperty("name");
		return name;
	}
	
	public String getfamilyname() {
		String familyname =ConfigFile().getProperty("familyname");
		return familyname;
	}
	
	public String getborndate() {
		String birthdate =ConfigFile().getProperty("birthdate");
		return birthdate;
	}
	
	public String getbornmonth() {
		String birthmonth =ConfigFile().getProperty("birthmonth");
		return birthmonth;
	}

	public String getbornyear() {
		String birthyear =ConfigFile().getProperty("birthyear");
		return birthyear;
	}
	
	public String gethomeaddress() {
		String address =ConfigFile().getProperty("address");
		return address;
	}
	
	public String getcityname() {
		String city =ConfigFile().getProperty("city");
		return city;
	}
	
	public String getstate() {
		String state =ConfigFile().getProperty("state");
		return state;
	}
	
	
	public String getcountry() {
		String country =ConfigFile().getProperty("country");
		return country;
	}
	
	public String getpostalcode() {
		String pincode =ConfigFile().getProperty("pincode");
		return pincode;
	}
	
	public String getPhoneNumber() {
		String phonenumber =ConfigFile().getProperty("phonenumber");
		return phonenumber;
	}
	
	public String getrelative() {
		String relation =ConfigFile().getProperty("relation");
		return relation;
	}

	public String getPersonName() {
		String personname =ConfigFile().getProperty("personname");
		return personname;
	}
	
	public String getCaption() {
		String caption =ConfigFile().getProperty("caption");
		return caption;
	}
	
	public String getHeight() {
		String height =ConfigFile().getProperty("height");
		return height;
	}
	
	public String getWeight() {
		String weight =ConfigFile().getProperty("weight");
		return weight;
	}
}
