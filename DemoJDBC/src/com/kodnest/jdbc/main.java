package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnestjdbc";
		String username="root";
		String password="Manu@1999";
		Connection connection = DriverManager.getConnection(url, username, password);
		//String str="create table abc(id int(20),name varchar(20))";
		//String str="insert into abc values(11,'mike')";
		String str="update abc set name='jake' where id=10";
		String str1="update abc set name='rocky' where id=11";
		//connection=null;
		try {
			System.out.println("Transcation Started");
			connection.setAutoCommit(false);
			
		
		//String str="delete from abc";
		//String str="select * from abc";
		
		Statement st = connection.createStatement();
		st.addBatch(str1);
		st.addBatch(str);
		connection.commit();
		}
		catch(Exception e) {
			System.out.println("Rollback");
			connection.rollback();
			System.out.println("Transction complete");
			
		}
		//ResultSet resultSet = st.executeQuery(str);
		//while(resultSet.next()) {
			//System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
		//}
		//System.out.println(executeUpdate+"Connection Sucess");
	}

}
