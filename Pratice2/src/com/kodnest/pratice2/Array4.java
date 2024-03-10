package com.kodnest.pratice2;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[n][m];
		System.out.println("Enter ele");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++){
					a[i][j]=sc.nextInt();
		}

	}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++){
				if(i==j)
					System.out.println(a[i][j]);
		}

	}


}}
