package com.kodnest.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class demo extends student {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		
		
		Connection connection = DriverManager.getConnection(url,username,password);
		try {
		String sql="insert into student values(?,?)";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		
		student s=new student();
		String sname=s.getName();
		int  sid=s.getId();
		
		connection.setAutoCommit(false);
		Statement statement = connection.prepareStatement(sql);
		
		PreparedStatement statement2 = connection.prepareStatement(sql);
		statement2.setInt(1, id);
		statement2.setString(2, name);
		
		int executeUpdate = statement2.executeUpdate(sql);
		connection.commit();
		}catch(Exception e) {
			connection.rollback();
		}
		System.out.println("Success- ");
		

	}

}
