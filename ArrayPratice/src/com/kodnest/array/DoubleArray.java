package com.kodnest.array;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array");
		double s=sc.nextDouble();
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		double a[][][]=new double[(int) s][(int) s1][(int) s2];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					a[i][j][k]=sc.nextDouble();
				}
			}
		}
		System.out.println("Heights are :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+"");

	}
				System.out.println();
				}
			System.out.println();
			}

}}
