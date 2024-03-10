package com.kodnest.assignment;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int s3=sc.nextInt();
		e.setName(s1);
		e.setId(s2);
		e.setSalary(s3);
		
		System.out.println("Employee Details:");
		System.out.println("Name: "+e.getName());
		System.out.println("Employee ID: "+e.getId());
		System.out.println("Salary: "+e.getSalary());
	}

}
