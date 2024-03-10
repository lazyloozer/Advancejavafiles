package com.kodnest.pratice2;

import java.util.Scanner;

public class JArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][][]=new int[2][][];
		     a[0]=new int [2][];
		     a[1]=new int[1][];
		     a[0][0]=new int[3];
		     a[0][1]=new int[2];
		     a[1][0]=new int[2];
		     System.out.println("Enter the values");
		     for(int i=0;i<a.length;i++) {
		    	 for(int j=0;j<a[i].length;j++) {
		    		 for(int k=0;k<a[i][j].length;k++) {
		    			 a[i][j][k]=sc.nextInt();
		    		 }
		    	 }
		     }
		     System.out.println("The Values are");;
		     for(int i=0;i<a.length;i++) {
		    	 for(int j=0;j<a[i].length;j++) {
		    		 for(int k=0;k<a[i][j].length;k++) {
		    			System.out.println(a[i][j][k]); 

		    		 }}}
	}

}
