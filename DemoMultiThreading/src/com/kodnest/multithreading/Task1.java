package com.kodnest.multithreading;

public class Task1 extends Thread {
	public Task1(String name) {
		super(name);
		
		
	
		
	}
	public void run() {
		
		System.out.println(Thread.currentThread());
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
