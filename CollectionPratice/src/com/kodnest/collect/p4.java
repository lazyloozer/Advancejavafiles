package com.kodnest.collect;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

 class student implements Comparable<student>{
	 String name;
	 int grade;
	 public student(String name,int grade) {
		 this.name=name;
		 this.grade=grade;
	 }



@Override
public int compareTo(student o) {
	// TODO Auto-generated method stub
	return 0;
}


}
 public class p4{
		public static <Student> void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			student s=new student("Alice",80);
			student s1=new student("Bob",70);
			TreeSet<student> ts=new TreeSet<student>();
			ts.add(s);
			ts.add(s1);
			for (student o:ts) {
				System.out.println("Sorted Elements");
				System.out.println(o.name+"-"+o.grade);
				
			}
			//Scanner sc=new Scanner(System.in);
			
	
		}
	}
 
