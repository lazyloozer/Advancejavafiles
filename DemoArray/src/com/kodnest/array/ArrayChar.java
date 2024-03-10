package com.kodnest.array;
import java.util.Scanner;
public class ArrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr the size of array");
		char size=sc.next().charAt(0);
		char[]a=new char[size];
		System.out.println("Enter the "+size+" of array");
		for(int i=1;i<size;i++) {
			a[i]=sc.next().charAt(i);
		}
		for(int i=1;i<size;i++) {
			System.out.println(a[i]);
		}

	}

}
