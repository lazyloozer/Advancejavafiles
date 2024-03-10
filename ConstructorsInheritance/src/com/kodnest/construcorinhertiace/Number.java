package com.kodnest.construcorinhertiace;

public class Number {
	int num;
	int res=isPalindrome(num);
	


 int isPalindrome(int n) {
	int reversed_n=0;
	while(num>0) {
		reversed_n=reversed_n*10+num%10;
	}
	return reversed_n;
	
}
}


