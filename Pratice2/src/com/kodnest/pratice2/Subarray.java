package com.kodnest.pratice2;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=Subarray(s);
		int sub=15;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]);
				}
				System.out.println(" ");
			}
		}

	}

	private static int[] Subarray(int s) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[s];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		// TODO Auto-generated method stub
		
	}

}
