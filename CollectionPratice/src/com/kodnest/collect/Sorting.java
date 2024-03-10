package com.kodnest.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>list1 = readArrayList(sc);
		ArrayList<Integer>list2 = readArrayList(sc);
		ArrayList<Integer>mergelist=new ArrayList<Integer>(list1);
		mergelist.addAll(list2);
		
		Collections.sort(mergelist);
		System.out.println(mergelist);
		
		
			
			
		}

	private static ArrayList<Integer> readArrayList(Scanner sc) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		String[] tokens=sc.nextLine().split("\\s+");
		for (String token : tokens) {
			list.add(Integer.parseInt(token));
			
		}
		return list;
			
	
	}
		 
 

	}

