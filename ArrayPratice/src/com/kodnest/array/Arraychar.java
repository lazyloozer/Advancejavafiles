package com.kodnest.array;

import java.util.Scanner;

public class Arraychar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		//char c=sc.next().charAt(0);
//		char[]ch=new char[sc.nextInt()];
//		for(int i=0;i<ch.length;i++) {
//			ch[i]=sc.next().charAt(0);
//		}
//		char temp[]=new char[ch.length];
//		for(int i=ch.length-1;i>0;i--) {
//			 temp[i]=(char)ch[i];
//			System.out.println("Element"+i+1+":"+temp[i]);
//		}
//
//	}
	
		
		
		
		Scanner sc=new Scanner(System.in);
		//char c=sc.next().charAt(0);
		int[]ch=new int[sc.nextInt()];
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.nextInt();
		}
		char temp[]=new char[ch.length];
		for(int i=ch.length-1;i>0;i--) {
			 temp[i]=(char)ch[i];
			
		}
		for(int i=1;i<ch.length;i++) {
			System.out.println("Element"+i+":"+temp[i]);
		}

	}
	

}
