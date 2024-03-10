package com.kodnest.pattern;

public class PatternNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rows=4;
//		for (int i = 1; i <= rows; i++) {
//
//			for (int j = 1; j <= i; j++) {
//
//			System.out.print("*");
//
//			}
//
//			System.out.println(); // Move to the next line after each row
//
//			}
//
//			// Print decreasing rows of asterisks
//
//			for (int i = rows - 1; i >= 1; i--) {
//
//			for (int j = 1; j <= i; j++) {
//
//			System.out.print("*");
//
//			}
//
//			System.out.println(); // Move to the next line after each row
//
//			}
		int rows = 3; // Number of rows for the pattern

		for (int i = 1; i <= rows; i++) {

		// Print ampersands based on the row number

		for (int j = 1; j <= i; j++) {

		System.out.print("&");

		}

		// Print hashtags based on the row number

		for (int k = i; k < rows; k++) {

		System.out.print("#");

		}

		System.out.println(); // Move to the next line after each row

		}

		}

			}

			
	


