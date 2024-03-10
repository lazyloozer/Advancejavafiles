package com.kodnest.twoDarray;

import java.util.Scanner;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("USer! enter the total number of classes");
		int m=sc.nextInt();
		
		System.out.println("USer! enter the total number of Students");
		int n=sc.nextInt();
		int [][] a=new int[m][n];
		
//		a[0][0]=20;
//		a[0][1]=30;
//		a[0][2]=40;
//		a[0][3]=50;
//		a[0][4]=60;
//		
//		a[1][0]=70;
//		a[1][1]=80;
//		a[1][2]=90;
//		a[1][3]=100;
//		a[1][4]=120;
		System.out.println("User! enter the"+(m*n) + "Students marks");
		
		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
				
		
		}

			
			}
		System.out.println("The Marks Are:");
		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=0;j<=a[i].length-1;j++) {
			System.out.println(	a[i][j]);
				
		
		}

			
			}

	}

}
