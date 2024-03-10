package com.kodnest.collections;
import java.util.ArrayList;
import java.util.Scanner;


public class DemoArraylist1 {

		



			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			cricket cricket=new cricket();
			while(true){
			System.out.println("1.crickters ");
			System.out.println("2.Football ");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:cricket.cricket();
			break;
			case 2:cricket.footbal();
			break;
			default:System.exit(0);
			System.out.println("Termited Succesfully");
			}
			
			
				
				

			}
			}
			



		// TODO Auto-generated method stub

	}


