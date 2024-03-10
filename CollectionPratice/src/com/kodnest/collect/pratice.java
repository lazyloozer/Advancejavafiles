package com.kodnest.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		String playlist=sc.nextLine();
		String[] string = playlist.split(" ");
		ArrayList pl1=new ArrayList();
		for (String string2 : string) {
			pl1.add(string2);
			
		}
		//System.out.println(al);
		
		String playlist1=sc.nextLine();
		String[] string1 = playlist.split(" ");
		ArrayList pl2=new ArrayList();
		
		for (String string2 : string1) {
			pl2.add(string2);
			
		}
		//System.out.println(a1);
		
		HashSet hs=new HashSet();
		for(Object o:pl1) {
			hs.add(o);
		
		}
		for(Object o:pl2) {
			hs.add(o);
		}
		System.out.println("HashSet");
		System.out.println(hs);
	 

	}
	}


