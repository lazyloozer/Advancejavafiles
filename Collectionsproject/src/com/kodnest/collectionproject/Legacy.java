package com.kodnest.collectionproject;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Legacy {
	public static void main(String[] args) {
		Stack s=new Stack();
		Vector v=new Vector();
		Hashtable ht=new Hashtable();
		Properties p=new Properties();
		//interfaces
		
				//Enumeration e=new Enumeration();
				//Dictionary d=new Dictionary();
		s.add(10);
		s.add(200);
		s.add(30);
		System.out.println(s);
		v.add(10);
		v.add(200);
		v.add(30);
		System.out.println(v);
		ht.put(1,10);
		ht.put(3,200);
		ht.put(0,30);
		System.out.println(ht);
		p.put(1,10);
		p.put(3,200);
		p.put(0,30);
		System.out.println(p);
	
		
		
		
		
		
		
	}

}
