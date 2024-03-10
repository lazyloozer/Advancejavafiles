package com.demo.encapulaion;

import java.util.Scanner;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String s=sc.next();
		System.out.println("Enter the age");
		int s1=sc.nextInt();
		Employee1 e=new Employee1(s,s1);
//		e.setName(s);
//		e.setId(s1);
//		System.out.println("Employee Name :"+e.getName());
//		System.out.println("Employee ID : "+e.getId());
		System.out.println("The Employee Name:" +s);
		System.out.println("THe Employee ID: "+s1);
		System.out.println("This is DEtais Of An EMployee");

	}

}
