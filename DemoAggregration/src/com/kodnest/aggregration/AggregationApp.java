package com.kodnest.aggregration;

import java.util.Scanner;

public class AggregationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pilot name");
		Pilot p=new Pilot(sc.nextLine());
		System.out.println("Enter the airline");
		Airlines airlines=new Airlines(sc.nextLine(),p);
	     airlines.operate();
		airlines=null;
		p.fly();
		

	}

}
