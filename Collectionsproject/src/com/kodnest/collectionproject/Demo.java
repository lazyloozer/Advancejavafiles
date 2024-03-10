package com.kodnest.collectionproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
	public static void main(String[] args) {
		//LinkedList al=new LinkedList();
		
		// reslove the concurrent problem 
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		int i=0;
//		while(i<al.s) {
//			System.out.println(al.get(i));
//			al.add(99);//concurrent
//		for(Object o:al) {
//			System.out.println(al.get(i));
//			al.add(99)
//			;
//		}
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			al.add(99);
			
		}
		System.out.println(al);
		
		
	}

}
