package com.kodnest.construcorinhertiace;
//default every child class AS PARENT CLASS OBJECT AS DEFAULT

public class studentapp extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(10);
		student s1=new student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sid);
		

	}

}
