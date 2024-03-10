package com.kodnest.compare;

import java.util.Scanner;
import java.util.TreeSet;

class number implements Comparable<number>{
	int num;

	public number(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return num+" ";
	}

	@Override
	public int compareTo(number n) {
		if(this.num>n.num) {
			return 1;
	}else if(this.num<n.num) {
		return -1;
	}
		return 0;
	}
	
}

public class assigment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		number n1 = new number(sc.nextInt());
		number n2 = new number(sc.nextInt());
		number n3 = new number(sc.nextInt());
		number n4 = new number(sc.nextInt());
		number n5 = new number(sc.nextInt());
		number n6 = new number(sc.nextInt());
		number n7 = new number(sc.nextInt());
		TreeSet<number> ts = new TreeSet<number>();
		ts.add(n1);
		ts.add(n2);
		ts.add(n3);
		ts.add(n4);
		ts.add(n5);
		ts.add(n6);
		ts.add(n7);
		System.out.println(ts);
	}

	}

