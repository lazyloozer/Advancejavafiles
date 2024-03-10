

//using length attribute
package com.kodnest.array;
public class ArrayLen {

	public static void main(String[] args) {
	
		/* int a[]= {10,20,30,40};
		 for(int i=0;i<=a.length-1;i++) {
			 System.out.println(a[i]);
		 }*/
		
		
		
		//even index elements
		
		/*int []a= {4,5,6,7,8};
		for(int i=0;i<=a.length-1;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}*/
		
		
		//odd index elements
		
		/*int a[]= {2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				System.out.println(a[i]);
			}
		}*/
		
		// odd index values
		
		/*int a[]= {2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}*/
		
		// mutiples of 3 and 4
		
		/*int[]a= {5,11,15,7,20};
		for(int i=0;i<=a.length-1;i++) {
			if((a[i]%3==0) && (a[i]%4==0)){
				System.out.println(a[i]);
			}
		}*/
		
		// mutiples of 3 or 4
		
				/*int[]a= {5,11,15,7,20};
				for(int i=0;i<=a.length-1;i++) {
					if((a[i]%3==0) || (a[i]%4==0)){
						System.out.println(a[i]);
					}
				}*/
		
		// mutiples of 5
		
				/*int[]a= {5,11,15,7,20};
				for(int i=0;i<=a.length-1;i++) {
					if((a[i]%5==0{
						System.out.println(a[i]);
					}
				}*/
		
		//reverse order
		
		/*int[]a= {10,20,30,40};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}*/
		
		//sum of all elements
		
		/*int a[]= {1,2,3,4};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);*/
		
		
		// sum of even elements
		
		/*int a[]= {1,2,3,4};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i] % 2==0) {
				
			
			sum=sum+a[i];
		}}
		System.out.println(sum);*/
		
		//sum of odd elements

		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i] % 2==1) {
				
			
			sum=sum+a[i];
		}}
		System.out.println(sum);

		
		

	}

}
