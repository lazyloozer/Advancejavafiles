package com.kodnest.array;
import java.util.Scanner;
public class ArrayInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("USer!ENTER THE SIZE OF ARRAY");
		int size=sc.nextInt();
		 int[]a=new int[size];
		 System.out.println("Enter the"+ size +"of Array");
		 for(int i=0;i<=size-1;i++) {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<=size-1;i++) {
			 System.out.println(a[i]);
		 }
	

	}

}
