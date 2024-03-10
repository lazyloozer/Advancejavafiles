package com.kodnest.pratice2;

public class BorderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{4,7,8},
				{9,7,6},
				{3,1,2}};
		
		int n=a.length;
		int i=0;
		
		for(int j=0;j<n;j++) {
			System.out.println(a[0][j]);
		
		}
		//int j=n-1;
		for(int i1=1;i1<n;i1++) {
			System.out.println(a[i][n-1]);
			
		}

		//int i1=j;
		for(int j1=1;j1>=0;j1--) {
			System.out.println(a[n-1][j1]);
		}
		//int j1=0;
		for(int i11=1;i11>0;i11--) {
			System.out.println(a[i11][0]);
		}
	}
	

}
