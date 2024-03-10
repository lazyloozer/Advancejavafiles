package com.kodnest.multithreading;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task=new Task();
		
		Thread t1=new Thread(Thread.currentThread());
		task.run();

	}

}
