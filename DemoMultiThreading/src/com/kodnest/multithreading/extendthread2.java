package com.kodnest.multithreading;

public class extendthread2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i='A';i<='L';i++) {
			System.out.println((char)i);
		}
	}

}
