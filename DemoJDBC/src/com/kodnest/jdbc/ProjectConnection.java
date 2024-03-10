package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ProjectConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="";
		
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		Statement stmt=connection.createStatement();
		stmt.execute("create table student(id int(20),name varchar(20))");
		System.out.println("Sucess");
	
		
		
		
		
		
	}

	
}
