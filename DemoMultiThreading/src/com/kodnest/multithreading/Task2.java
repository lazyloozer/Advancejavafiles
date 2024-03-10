package com.kodnest.multithreading;

public class Task2 extends Thread {
public Task2(String name) {
	super(name);
}
public void run() {
	for(int i=0;i<=10;i++) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Auto-Correction");
	}
}
}
