package com.kodnest.pattern;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print((char)(i+64));
			}
			System.out.println();
		}*/
		
		
		
		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+102));
			}
			System.out.println();
		}

	}
	

}
