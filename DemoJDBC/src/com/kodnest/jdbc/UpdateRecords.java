package com.kodnest.jdbc;

import java.sql.*;
import java.util.Scanner;


public class UpdateRecords extends DisplayRecords{
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	void update() throws ClassNotFoundException, SQLException {
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		
		//stmt.execute("update student set name='pat' where id=1");
		String str="update student set name= ? where id=?";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the update value");
		String value=sc.nextLine();
		System.out.println("Enter the condition value");
		int val=sc.nextInt();
		
		Statement stmt=connection.prepareStatement(str);
		PreparedStatement statement = connection.prepareStatement(str);
		statement.setString(1, value);
		statement.setInt(2, val);
		
		int executeUpdate = statement.executeUpdate();
		
    
		
//		int executeUpdate=stmt.executeUpdate(str);

		System.out.println("Suceess Updated "+executeUpdate);
		if(executeUpdate>0) {
			System.out.println("Updation Sucessfull");
		}else {
			System.out.println("Updation fail");
		}
		System.out.println("-----------------");
	
		
		
		
		
		
	}

	
}