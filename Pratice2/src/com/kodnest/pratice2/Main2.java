package com.kodnest.pratice2;

import java.util.Scanner;

public class Main2 {
	private static int maxPassengers;

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    // Read the size of the matrix
	    int n = scanner.nextInt();
	    int m = scanner.nextInt();
	    // Initialize the matrix
	    int[][] matrix = new int[n][m];

	    // Read the matrix values
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            matrix[i][j] = scanner.nextInt();
	        }
	    }

	    // Create a temporary matrix to keep track of vis
	    boolean[][] visited = new boolean[n][m];

	    // Start at (0,0) and simulate the taxi's movement
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            if (matrix[i][j] == 1) {
	                int passengers = dfs(matrix, visited, i, j);
	                maxPassengers = Math.max(maxPassengers, passengers);
	            }
	        }
	    }

	    // Print the maximum number of passengers
	    System.out.println(maxPassengers);
	}

	public static int dfs(int[][] matrix, boolean[][] visited, int i, int j) {
	    if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == -1 || visited[i][j]) {
	        return 0;
	    }

	    visited[i][j] = true;

	    // Check up, down, left, right for passengers or obstacles
	    int passengers = 1 + Math.max(0, dfs(matrix, visited, i - 1, j)) + Math.max(0, dfs(matrix, visited, i + 1, j)) + Math.max(0, dfs(matrix, visited, i, j - 1)) + Math.max(0, dfs(matrix, visited, i, j + 1));

	    visited[i][j] = false;

	    return passengers;
	}

}
