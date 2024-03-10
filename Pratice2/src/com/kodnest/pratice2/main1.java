package com.kodnest.pratice2;

import java.util.*;

public class main1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    // Number of lighthouses
	    int n = sc.nextInt();

	    // X and Y coordinates of lighthouses
	    int[] x = new int[n];
	    int[] y = new int[n];

	    for (int i = 0; i < n; i++) {
	        x[i] = sc.nextInt();
	        y[i] = sc.nextInt();
	    }

	    System.out.println(countSafeLighthouses(n, x, y));
	}

	public static int countSafeLighthouses(int n, int[] x, int[] y) {
	    int safeLighthouses = 1;
	    int prevX = x[0];
	    int prevY = y[0];

	    for (int i = 2; i < n; i++) {
	        if (Math.abs(x[i] - prevX) <= 1 && Math.abs(y[i] - prevY) <= 1) {
	            safeLighthouses++;
	        }
	        prevX = x[i];
	        prevY = y[i];
	    }

	    return safeLighthouses;
	}

}
