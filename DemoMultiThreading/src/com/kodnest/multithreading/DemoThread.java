package com.kodnest.multithreading;

public class DemoThread {

	public static void main(String[] args) {
		Thread t1=new Thread(Thread.currentThread());
		t1.setName("Thread2");
		t1.setPriority(3);
		System.out.println(t1);
		

	}

}
