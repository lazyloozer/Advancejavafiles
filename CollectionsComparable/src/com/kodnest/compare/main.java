package com.kodnest.compare;

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student> {
	int id;
	String name;
	
	public student(int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	

	@Override
	public String toString() {
		return id+""+name;
	}


	@Override
	public int compareTo(student o) {
		if(this.nametoCompare(o.name)){
			return 1;
		}else if(this.id<o.id) {
			return -1;
		}
		
	return 0;
	
	
}


	private boolean nametoCompare(String name2) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class main {

	public static void main(String[] args) {
		student s1 = new student(50,"raj");
		student s2 = new student(100,"tej");
		student s3 = new student(20,"baj");
		student s4 = new student(10,"age");
		ArrayList<student> al = new ArrayList<student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
