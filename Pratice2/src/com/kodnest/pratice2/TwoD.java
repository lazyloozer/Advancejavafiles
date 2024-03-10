package com.kodnest.pratice2;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vlues of a");
		int [][]a=new int[sc.nextInt()][sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		//for(int i=0;i<a.length;i++) {
			//for(int j=0;j<a[i].length;j++) {
				//c[i][j]=a[i][j]+b[i][j];
				
				//System.out.println(a[i][j]);
//			}
//		}
		//
		System.out.println("Enter the vlues of b");
		int [][]b=new int[sc.nextInt()][sc.nextInt()];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b[i].length;j++) {
//				//c[i][j]=a[i][j]+b[i][j];
//				
//				//System.out.println(b[i][j]);
//			}
//		}
//		
		//
		
		System.out.println("Enter the vlues of c");
		int [][]c=new int[sc.nextInt()][sc.nextInt()];
		//for(int i=0;i<c.length;i++) {
			//for(int j=0;j<c[i].length;j++) {
				//c[i][j]=sc.nextInt();
			//}
		//}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.println(c[i][j]);
			}
		}
		

	}

}
