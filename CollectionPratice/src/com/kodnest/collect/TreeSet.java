package com.kodnest.collect;

import java.util.Scanner;

public class TreeSet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		java.util. TreeSet<Integer> ts = new java.util.TreeSet<Integer>();
		ts.add(sc.nextInt());
		ts.add(sc.nextInt());
		ts.add(sc.nextInt());
		ts.add(sc.nextInt());
		ts.add(sc.nextInt());
		 for(Object o:ts) {
			 System.out.println(o);
		 }
	}

}
