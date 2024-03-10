package com.kodnest.array;
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("USer please enter the elements of an array");
		for(int i=0;i<=a.length-1;i++) {
		a[i]=sc.nextInt();
		}

		System.out.println("USer please enter the elements of an array");
	int ele=sc.nextInt();
		boolean flag=false;
		//int[] a= {10,20,24,14};
		for(int i=0;i<=a.length-1;i++) {
			if(ele==a[i]) {
				flag=true;
				break;
				
			}else {
				flag=false;
				
			}
		}
			if(flag==true) {
				System.out.println("Present");
			}else {
				System.out.println("Not present");
			}
				
			
		}

	}


