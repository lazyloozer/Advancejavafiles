package com.kodnest.construcorinhertiace;

import java.util.Scanner;

public class pailndromeChecker extends Number{
	void display() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	if(res==num) {
		System.out.println(num+"is not pailndrome");
	}else {
		System.out.println(num+" paildrome");
	}

}
}
