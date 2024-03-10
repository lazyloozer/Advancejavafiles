package com.kodnest.pratice2;

import java.util.Scanner;

public class DemoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	 employee a[]=new employee[sc.nextInt()];
	 for(int i=0;i<a.length;i++) {
		 a[i]=new employee();
	 }
	 
		 for(int i=0;i<a.length;i++) {
			 System.out.println("Enter the employee name"+i);
			
		 a[i].name=sc.nextLine();
		 }
	 for(int i=0;i<a.length;i++) {
		 System.out.println(a[i].name);
	 }
	}

}
class employee{
	String name;
	//String s=sc.next();
	
	
	
	
}
