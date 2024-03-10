package com.kodnest.jdbc;

import java.sql.*;
import java.util.Scanner;


public class InsertRecord  extends DisplayRecords{
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	void Insert() throws ClassNotFoundException, SQLException {
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		//Establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		//read for user
         String str="insert into student values(?,?)";
         //using Scanner
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the ID");
         int id=sc.nextInt();
         
         sc.nextLine();
         
         System.out.println("Enter the Name");
         String name=sc.nextLine(); 
         
         //creating the statement
		Statement stmt=connection.prepareStatement(str);
		PreparedStatement statement = connection.prepareStatement(str);
		
		//set values
		statement.setInt(1,id);
		statement.setString(2,name);
		
		//exceute
		
		int executeUpdate = statement.executeUpdate();

		System.out.println("Suceess Inserted "+executeUpdate);
		if(executeUpdate>0) {
			System.out.println("Inserted Sucessfully");
		}else {
			System.out.println("Insertion Fail");
		}
		System.out.println("-----------------");
	
		
		
		
		
		
	}

	
}

//String str="insert into student values(2,'john')";
//stmt.execute(str);
//String str1="insert into student values(3,'jake')";
//stmt.execute(str1);
//String str2="insert into student values(4,'ricky')";
//stmt.execute(str2);
//String str3="insert into student values(5,'ben')";
//stmt.execute(str3);
//connection.setAutoCommit(true);
//stmt.execute("delete from student");