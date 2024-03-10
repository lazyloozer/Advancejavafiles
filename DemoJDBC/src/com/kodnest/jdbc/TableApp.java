package com.kodnest.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class TableApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
	Scanner sc=new Scanner(System.in);
	InsertRecord insert=new InsertRecord();
	UpdateRecords update=new UpdateRecords ();
	DisplayRecords display=new DisplayRecords ();
	System.out.println("Application");
	System.out.println("");
	DelecteRecords delete=new DelecteRecords();
	display.display();
	System.out.println("Select the options");
	System.out.println("*******************");
	while(true) {
	System.out.println(" 1.Insert");
	System.out.println(" 2.Update");
	System.out.println(" 3.Display");
	System.out.println(" 4.delete");
	System.out.println(" 5.Exit");
	Thread.sleep(2000);
	
	//int inst=sc.nextInt();
	System.out.println("--------------------------");
	System.out.println("Enter your Choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:insert.Insert();
	insert.display();
	break;
	case 2:update.update();
	update.display();
	break;
	case 3:display.display();
	break;
	case 4:delete.delete();
	delete.display();
	break;
	default:	System.out.println("Invaild choice");
		System.exit(0);
	System.out.println();
	
	}
	
	
	}
	}

}
