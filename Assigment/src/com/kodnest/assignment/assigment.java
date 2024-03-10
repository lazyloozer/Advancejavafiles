package com.kodnest.assignment;



	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
import java.util.Scanner;
	public class assigment {

	

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        List<String> stringList = new ArrayList<>();

		        System.out.println("Enter strings (press Enter without typing anything to finish input):");

		        // Read strings from user input
		        while (true) {
		            String input = scanner.nextLine().trim();
		            if (input.isEmpty()) {
		                break;
		            }
		            stringList.add(input);
		        }

		        // Filter out numeric strings from the list
		        List<String> filteredList = new ArrayList<>();
		        for (String str : stringList) {
		            if (!str.matches(".*\\d+.*")) {
		                filteredList.add(str);
		            }
		        }

		        // Convert mutable list to mutable list
		        List<String> mutableList = new ArrayList<>(filteredList);

		        // Sorting the list using the custom comparator
		        Collections.sort(mutableList, new LengthThenLexicographicalComparator());

		        // Displaying the sorted list
		        System.out.println("\nSorted strings:");
		        for (String str : mutableList) {
		            System.out.println(str);
		        }
		    }

		    // Custom comparator for sorting strings first by length and then lexicographically
		    static class LengthThenLexicographicalComparator implements Comparator<String> {
		        @Override
		        public int compare(String str1, String str2) {
		            // First, compare by length
		            int lengthComparison = Integer.compare(str1.length(), str2.length());

		            // If lengths are equal, compare lexicographically
		            if (lengthComparison == 0) {
		                return str1.compareTo(str2);
		            }

		            return lengthComparison;
		        }
		    }
		}





