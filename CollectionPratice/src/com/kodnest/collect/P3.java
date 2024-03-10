package com.kodnest.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String[] split = s.split(" ");
		ArrayList al=new ArrayList();
		for (Object object : split) {
			al.add(object);
			
		}


		HashSet hs=new HashSet();
		for (Object object : al) {
			hs.add(object);
			
		}
		
		TreeSet ts=new TreeSet();
		for (Object object : hs) {
			ts.add(object);
			
			
		}
		System.out.println("Sorted List:");
		System.out.println(ts);
		
		

	}

}
