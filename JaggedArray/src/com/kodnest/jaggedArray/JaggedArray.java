package com.kodnest.jaggedArray;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a=new int [3][][];
		a[0]=new int [2][];
		a[0][0]=new int[4];
		a[0][1]=new int[3];
		
		a[1]=new int [2][];
		a[1][0]=new int[2];
		a[1][1]=new int[3];
		
		a[2]=new int [3][];
		a[2][0]=new int[4];
		a[2][1]=new int[2];
		a[2][2]=new int[2];
		/*a[3]=new int [2][];
		a[3][0]=new int[4];
		a[3][1]=new int[3];*/
		
		
		
		
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				for(int k=0;k<=a[i][j].length-1;k++) {
				(a[i][j][k])=60;
				}
			}
		}
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				for(int k=0;k<=a[i][j].length-1;k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}
		

		

		

		

	}

}
