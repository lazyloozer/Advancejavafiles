package com.kodnest.array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size arryas");
		int m=sc.nextInt();
		int n=sc.nextInt();

		int a[][]=new int[m][n];
		int b[][];
		if(m==n) {
			b = new int[m][n];
		}else {
			b = new int[n][m];
		}

		System.out.println("Enter the arrays");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Original array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Transpose is:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i] = a[i][j];
			}
			System.out.println();
		}

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}


	}


}
