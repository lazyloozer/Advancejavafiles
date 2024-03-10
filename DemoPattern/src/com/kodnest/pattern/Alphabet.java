package com.kodnest.pattern;

public class Alphabet {

	public static void main(String[] args) {
		
		//A
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(i==1||i==3||j==1||j==5) 
				{
				System.out.print("A");
			} else {
			System.out.print(" ");
		}

	}
			System.out.println();

}
		
		//B
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 && j!=5 || j==1 || i==3 && j!=5|| i==5 && j!=5 || (i==2 && j==5) || (i==4 && j==5)) {
				
					System.out.print("B");
			}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		//C
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 && j!=5  || j==1&& i!=5||j==5 && i!=1 && i!=5||i==5 && j!=5) {
					System.out.print("D");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
