package com.kodnest.pratice2;

import java.util.Scanner;

public class TransposeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("USer! enter any row of array");
		int row=sc.nextInt();
		System.out.println("USer! enter the col of array");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		read(a);
		int [][] t=transpose(a,row,col);
		
		//transpose logic
		int [] [] trans=transpose(a,t);
		
		//display transpose
		display(a);
		
		
		
		System.out.println("Transpose array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				t[i][j]=a[j][i];
			
			}
		
		}
		
		
		//System.out.println(" array");
		
}

	
	
	
	private static void display(int[][] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
	}

	}




	private static int[][] transpose(int[][] a, int[][] t) {
		// TODO Auto-generated method stub
		System.out.println("Transpose array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				t[i][j]=a[j][i];
			
			}
		
		
		}
		return t;
		
		
	}
	
	
	

	private static int[][] transpose(int[][] a,int row,int col) {
	
		int t[][];
		if(row==col) {
			t=new int[row][col];
			
		}else {
			t=new int[col][row];
		}
		return t;
	}
	
	
	

	static void read(int[][] a) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Original array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	}}
