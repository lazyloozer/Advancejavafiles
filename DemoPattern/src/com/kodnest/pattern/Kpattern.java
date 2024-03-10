package com.kodnest.pattern;

public class Kpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=11;j++) {
				if(j==1
						||i+j==5)
						{
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
