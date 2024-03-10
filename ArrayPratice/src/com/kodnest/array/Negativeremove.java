package com.kodnest.array;

import java.util.Scanner;

public class Negativeremove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of any arry");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter arry");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
			System.out.println(arr[i]);
		}
		
	}
	
}
