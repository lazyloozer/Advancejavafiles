package com.kodnest.pratice2;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int s=sc.nextInt();
		int a[][][]=new int[m][n][s];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					a[i][j][k]=sc.nextInt();
				}
			}
			
		}
		System.out.println("Student marks");
		System.out.println("College 1 :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]);
				}
			}
			
		}


	}

}
