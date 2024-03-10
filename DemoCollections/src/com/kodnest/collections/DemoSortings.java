package com.kodnest.collections;

import java.util.Collections;

class student{
	int age;
	String name;
	public student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{name:"+name+",age:"+age+"}";
	}
}

public class DemoSortings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s=new student(10,"mike");
		System.out.println(s);
		student s1=new student(11,"jake");
		System.out.println(s1);
		Collections.sort(null);//sorting with duplicate values
	
		

	}

}
