package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		Connection con=DriverManager.getConnection(url,username,password);
		String sql1="insert into bank values(1234,'Mike',10000)";
		String sql2="insert into bank values(12345,'Jake',20000)";
		String sql3="insert into bank values(12346,'ricky',30000)";
		String sql4="insert into bank values(12347,'Ben',40000)";
		String sql5="insert into bank values(12348,'David',50000)";
				
		Statement statement = con.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		statement.addBatch(sql3);
		statement.addBatch(sql4);
		statement.addBatch(sql5);
		//statement.execute(sql1);
		
		statement.executeBatch();
		System.out.println("Sucess");
				
		

	}

}
