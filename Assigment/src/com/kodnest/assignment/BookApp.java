package com.kodnest.assignment;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the boook details");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		boolean s3=sc.nextBoolean();
		
		b.setTitle(s);
		b.setAuthor(s1);
		b.setAvailable(s3);
			
			System.out.println("Book Details");
			System.out.println("Title: "+b.getTitle());
			System.out.println("Author: "+b.getAuthor());
			if(b.available=true) {
				System.out.println("Availability: Available");
			
			
		}

	}

}
