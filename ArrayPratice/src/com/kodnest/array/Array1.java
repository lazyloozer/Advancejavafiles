package com.kodnest.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] result=createArray(n);
		for(int i=0;i<result.length;i++) {
		System.out.println("Array elements are  :"+result[i]);
		
		}
	}

	private static int[] createArray(int n) {
//create an array
		Scanner sc=new Scanner(System.in);
		int []a=new int[n];
		System.out.println("enter an array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
			return a;
		
		}
		//return a;
	
		
	}


