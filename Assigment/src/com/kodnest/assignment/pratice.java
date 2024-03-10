package com.kodnest.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class pratice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int[][] b;
		if(m==n) {
			b=new int[m][n];
		}else {
			b=new int[n][m];
		}
		System.out.println("Enter an array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		System.out.println("Traspore Array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	
		
		
		
	
		
		
		
		
	}
}
