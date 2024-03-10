package com.kodnest.demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		Connection con = DriverManager.getConnection(url,username,password);
		String sql="delete from employee where id=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int id=sc.nextInt();
		Statement st = con.prepareStatement(sql);
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 int executeUpdate = statement.executeUpdate(sql);
		System.out.println("Success"+executeUpdate);
		sc.close();

	}

}

