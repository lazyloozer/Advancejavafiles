package com.kodnest.collect;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int windows=Integer.parseInt(sc.nextLine());
		LinkedHashSet<String> window = new LinkedHashSet<String>();
		while(sc.hasNext()) {
			String event=sc.nextLine().trim();
			window.add(event);
			System.out.println(window);
			
			if(window.size()>windows) {
				String oldestevent=window.iterator().next();
				window.remove(oldestevent);
				
				
			}
		}
		
		

	}

}
