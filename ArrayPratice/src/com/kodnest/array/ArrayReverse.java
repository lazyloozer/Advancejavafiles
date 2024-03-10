package com.kodnest.array;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] res=Arrayreverse(n);
		System.out.println("Enter the array");
		for(int i=res.length-1;i>=0;i--) {
			System.out.println("Array revsere is"+res[i]);
		}

	}

	private static int[] Arrayreverse(int n) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
		
		
	}

}
