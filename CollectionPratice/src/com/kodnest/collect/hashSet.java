//Imagine you are working on a project where you need to convert a HashSet of strings into an ArrayList and then print the elements in alphabetical order. Your task is to create a Java program that performs this conversion and sorting.
//
//Input:
//
//You are given a HashSet of strings containing unique elements.
//
//Output:
//
//The program should convert the HashSet to an ArrayList and print the elements in alphabetical order.

package com.kodnest.collect;


	import java.util.ArrayList;

	import java.util.HashSet;

	import java.util.List;

	import java.util.Scanner;

	import java.util.Set;

	import java.util.Collections;
	public class hashSet {



	  public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    Set<String> stringSet = new HashSet<>();



	     

	    String input = scanner.nextLine();

	    String[] elements = input.split(" ");

	    Collections.addAll(stringSet, elements);



	    List<String> sortedList = convertAndSort(stringSet);



	    // Print the sorted ArrayList

	    System.out.println("Sorted ArrayList:");

	    for (String element : sortedList) {

	      System.out.println(element);

	    }

	  }



	  public static List<String> convertAndSort(Set<String> stringSet) {

	    List<String> sortedList = new ArrayList<>(stringSet);

	    Collections.sort(sortedList);

	    return sortedList;

	  }

	}


