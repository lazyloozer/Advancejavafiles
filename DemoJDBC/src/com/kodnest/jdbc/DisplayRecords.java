package com.kodnest.jdbc;

import java.sql.*;
import java.util.Scanner;


public class DisplayRecords {
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the Driver
	void display() throws ClassNotFoundException, SQLException, InterruptedException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		Scanner sc=new Scanner(System.in);
		System.out.println("Display Results");
		System.out.println("----------------");
		
		String str="select * from student ";
		
		
		
		
		
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		Statement stmt=connection.prepareStatement(str);
		PreparedStatement statement = connection.prepareStatement(str);
	
		
		ResultSet rs=statement.executeQuery(str);
		while(rs.next())
		System.out.println(rs.getInt(1) +" "+rs.getString(2));
			
		
		
		System.out.println("-----------------");

		System.out.println("Sucessfully fetected");
		System.out.println("-----------------");
	
		
		
		
		
	
	}

	
}