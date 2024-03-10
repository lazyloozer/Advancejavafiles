package com.kodnest.multithreading;

public class maintask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1=new Task1("typing");
		Thread t2=new Thread();
		t1.start();
		t1.run();

	}

}
