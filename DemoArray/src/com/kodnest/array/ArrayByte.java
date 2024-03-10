package com.kodnest.array;
import java.util.Scanner;
public class ArrayByte {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		byte size=sc.nextByte();
		byte[]a=new byte[size];
		
		System.out.println("Enter the "+ size +" of array");
		for(byte i=0;i<=size-1;i++) {
		a[i]=sc.nextByte();
		
		}
		System.out.println("the elements:");
		for(byte i=0;i<=size-1;i++)
		System.out.println(a[i]);
	}

}
