package com.kodnest.collections;

import java.util.ArrayList;
import java.util.Scanner;




public class DemoArrayList {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	cricket cricket=new cricket();
	while(true){
	System.out.println("Enter the name ");
	System.out.println(" ");
	System.out.println("1.crickters ");
	System.out.println(" ");
	System.out.println("2.Football ");
	System.out.println("3.remove cricket");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:cricket.cricket();
	break;
	case 2:cricket.footbal();
	case 3:cricket.remove();
	
	default:System.exit(0);
	}
	
	
		
		

	}
	}
	}


