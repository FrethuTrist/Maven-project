package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {
	
	public static String getParticularData() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/employees";
		String username="root";
		String password="Helen@1234";
		
		//Estabilized Connection
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		//Create a Statement
		
		Statement statement = connection.createStatement();
	ResultSet result=statement.executeQuery(query);
	
	result.next();
	
	int empno=result.getInt(1);
	System.out.println(empno);
	
	Date date=result.getDate(2);
	System.out.println(date);
	
	String firstName=result.getString(3);
	System.out.println(firstName);
	
	return firstName;
		
	}
	
	
	private static void getAllData() {
	
	String url="jdbc:mysql://localhost:3306/employees";
	String username="root";
	String password="Helen@1234";
	String query="Select* from employees limit 10";
	
	Connection connection = DriverManager.getConnection(url, username, password);
	Statement statement = connection.createStatement();
	ResultSet result=statement.executeQuery(query);
	
	
	while(result.next()) {
		
		int empNo=result.getInt(1);
		System.out.println(empNo);
		Date date=result.getDate(2);
		System.out.println(date);
			
	}
	
}
	
public static void main(String[] args) throws SQLException {
	getAllData();
	
}
	

}
