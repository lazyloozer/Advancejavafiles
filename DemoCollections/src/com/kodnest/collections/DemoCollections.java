package com.kodnest.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class DemoCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al=new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		/*
		 * for(int i=0;i<al.size();i++) {
		 * 
		 * System.out.println(al.get(i)); }
		 * 
		 */
		//while loop
		/*
		 * int i=0; while(i<al.size()) { System.out.println(al.get(i)); i++; break; }
		 */
		// do while loop
		
//		 int i=0; 
//		 do { 
//			 System.out.println(al.get(i)+" ");
//		 i++; 
//		 }while(i<al.size());
//		 
//		//for each loop
		
//		for( Object i:al) {
//			System.out.println(i);
		// iterator
		
		  Iterator it=al.iterator(); while(it.hasNext()) {
		  System.out.print(it.next()+" ");
		  
		 
		 }
		  for(Object i:al) {
			  System.out.print(i+" ");
		  }
		 
		
		
	}

}
