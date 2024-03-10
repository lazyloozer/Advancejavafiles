package com.kodnest.multithreading;

public class Task implements Runnable {
public void run() {
	try {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		Thread.sleep(2000);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	

}
	

