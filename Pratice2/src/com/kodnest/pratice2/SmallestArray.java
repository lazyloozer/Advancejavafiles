package com.kodnest.pratice2;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int res[]=arraysmall(s);
		int small=res[0];
		for(int i=0;i<res.length;i++) {
			if(res[i]>small) {
				small=res[i];
			}
			
			
		}
		System.out.println(small);
	}

	private static int[] arraysmall(int s) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
		
	}

}
