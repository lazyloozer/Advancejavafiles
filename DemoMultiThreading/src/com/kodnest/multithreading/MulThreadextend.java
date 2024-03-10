package com.kodnest.multithreading;

public class MulThreadextend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
	thread1 t1=new thread1();
	extendthread2 t2=new extendthread2();
	t1.setName("THread-first");
	t2.setName("Thread-Second");
	t1.setPriority(7);
	t2.setPriority(10);
	t1.start();
	t2.start();

	}

}
