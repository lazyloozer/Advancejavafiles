package com.kodnest.array;

import java.util.Scanner;

public class ArrayPostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]res=ArrPosNeg(n);
		System.out.println("the Array negative numbers are:");
		for(int i=0;i<res.length;i++) {
			res[i]=-res[i];
			System.out.println(res[i]);
		}

	}

	private static int[] ArrPosNeg(int n) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		System.out.println("Enter the postive array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
		
	}

}
