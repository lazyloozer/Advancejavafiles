package com.kodnest.pattern;

public class PatternTrangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--) {
				
				
				System.out.print(" ");
			}
                  for(int j=1;j<=i;j++) {
				
				//if(j<=i )
				
				System.out.print("*");
			}
			System.out.println();*/
		
		
		
		
		
		
		
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		
	//First half	
for(int i=1;i<=5;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print(" ");
	}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++) {
			System.out.print("*");
		}
	
	
	System.out.println();
}
//second half
for(int i=1;i<=4;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("_");
	}
	for(int j=4;j>=i;j--) {
		System.out.print("*");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("_");
	}
	for(int j=3;j<=i;j++) {
		System.out.print("");
	}
	
	
	
	System.out.println();
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}


