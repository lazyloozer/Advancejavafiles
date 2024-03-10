package com.kodnest.jdbc;

import java.sql.*;
import java.util.Scanner;


public class DelecteRecords  extends DisplayRecords{
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the Driver
	void delete() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);

		//stmt.execute("update student set name='pat' where id=1");
		String str="delete from student where id=?";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value");
		int value=sc.nextInt();
		
		
				Statement stmt=connection.prepareStatement(str);
				PreparedStatement statement = connection.prepareStatement(str);
				
				statement.setInt(1, value);
				
		int executeUpdate=statement.executeUpdate();
		

		System.out.println("Suceess Deleted "+executeUpdate);
		if(executeUpdate>0) {
			System.out.println("Updation successful");
		}else {
			System.out.println("Updation Fail");
		}
		System.out.println("-----------------");
		
		
		
		
		
	}

	
}