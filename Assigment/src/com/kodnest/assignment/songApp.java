package com.kodnest.assignment;

import java.util.Scanner;

public class songApp {

	public static void main(String[] args) {
		song s=new song();
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		// TODO Auto-generated method stub
		
		s.setStitle(s1);
		s.setTitle(s2);
		//System.out.println(s.getStitle());
		System.out.println("Updated Song Title : "+s.getTitle());

	}

}
