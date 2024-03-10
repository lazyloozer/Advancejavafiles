package com.kodnest.array;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=SubArray(n);
		int subarraysum=15;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
			
			System.out.println(" ");
		}}

	}

	private static int[]SubArray(int n) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		System.out.println("Enter  the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;

		
	}

}
