package com.kodnest.array;

import java.util.Scanner;

public class Assement4 {

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
		System.out.println("Collage student");
		System.out.println("COllage 1");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					
					System.out.println("Student"+(j+1)+": "+a[i][j][k]+" ");
			}
				System.out.println("Collage 2:");
				
		}
	}
	}

}
