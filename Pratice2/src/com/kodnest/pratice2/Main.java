package com.kodnest.pratice2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] locations = new int[n];
	    for (int i = 0; i < n; i++) {
	        locations[i] = scanner.nextInt();
	    }
	    System.out.println(solve(locations, n));
	}

	static int solve(int[] locations, int n) {
	    // Initialize minCount with a large value
	    int minCount = Integer.MAX_VALUE;

	    // Calculate minCount for all possible roads
	    for (int i = 0; i < n; i++) {
	        int count = 0;
	        for (int j = 0; j < n; j++) {
	            if (j <= i || locations[j] < locations[i]) {
	                count++;
	            }
	        }
	        minCount = Math.min(minCount, count);
	    }

	    return minCount;
	}

}
