package com.kodnest.array;

import java.util.Scanner;

public class ArraySmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=ArraySmallest(n);
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
			
			
		}
		System.out.println("The smalllest element is :"+smallest);
		
				

	}

	private static int[] ArraySmallest(int n) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		System.out.println("Enter the array elments");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
		
		
	}

}
