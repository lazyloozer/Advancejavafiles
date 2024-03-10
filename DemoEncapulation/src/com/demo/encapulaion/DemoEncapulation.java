package com.demo.encapulaion;

import java.util.Scanner;

public class DemoEncapulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String s1=sc.nextLine();
		System.out.println("Enter the age");
		int a=sc.nextInt();
		student s=new student();
		s.setName(s1);
		s.setAge(a);
	
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		
		

	}

}
