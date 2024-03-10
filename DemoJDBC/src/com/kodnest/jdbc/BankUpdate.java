package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		Connection con=DriverManager.getConnection(url,username,password);
		con.setAutoCommit(false);
		
	
		String sql1="update bank set balance=balance-50000 where acc_no=12344";
		String sql2="update bank set balance=balance+50000 where acc_no=1234";
//		String sql3="update bank set balance=balance+50000 where acc_no=12345";
//		String sql4="update bank set balance=balance+50000 where acc_no=12346";
//		String sql5="update bank set balance=balance+50000 where acc_no=123447";
			try {	
		Statement statement = con.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		
//		statement.addBatch(sql3);
//		statement.addBatch(sql4);
//		statement.addBatch(sql5);
		//statement.execute(sql1);
		
		statement.executeBatch();
		con.commit();
		}catch(Exception e) {
			System.out.println("Except occur");
			con.rollback();
			
		}
		System.out.println("SuCcess");
				
		}

	}


