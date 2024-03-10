//Imagine you are developing a data analysis tool that needs to count the frequency of each unique number in a list. Your task is to create a Java program that takes a list of numbers as input, counts the frequency of each unique number, and provides a report of the number frequencies.
//
//Input:
//
//You are given a list of integers representing numbers. The list may contain duplicate numbers.
//
//Output:
//
//The program should generate a report that lists each unique number and its corresponding frequency in the list.



package com.kodnest.collect;


	import java.util.ArrayList;

	import java.util.HashMap;

	import java.util.List;

	import java.util.Map;

	import java.util.Scanner;
	public class Frequency {
	  public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    List<Integer> numbers = new ArrayList<>();



	    String input = scanner.nextLine();

	    String[] numberArray = input.split(" ");

	    for (String num : numberArray) {

	      numbers.add(Integer.parseInt(num));

	    }



	    Map<Integer, Integer> numberFrequencies = countNumberFrequencies(numbers);



	    // Print the number frequencies

	    System.out.println("Number Frequencies:");

	    for (Map.Entry<Integer, Integer> entry : numberFrequencies.entrySet()) {

	      System.out.println(entry.getKey() + ": " + entry.getValue());

	    }

	  }



	  public static Map<Integer, Integer> countNumberFrequencies(List<Integer> numbers) {

	    Map<Integer, Integer> numberFrequencies = new HashMap<>();



	    for (int num : numbers) {

	      numberFrequencies.put(num, numberFrequencies.getOrDefault(num, 0) + 1);

	    }



	    return numberFrequencies;

	  }

	}


