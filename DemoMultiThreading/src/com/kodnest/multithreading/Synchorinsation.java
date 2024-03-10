package com.kodnest.multithreading;

public class Synchorinsation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hosiptal h=new Hosiptal();
		Thread t1=new Thread(h);
		t1.setName("Thor mawa");;
		Thread t2=new Thread(h);
		t2.setName("BatMan Mawa");
		t1.start();
		t2.start();
	}
}
	
class Hosiptal implements Runnable{

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		try {
			String name=Thread.currentThread().getName();
			System.out.println(name+" is in ICU");
			Thread.sleep(2000);
			System.out.println(name+" is getting Treatment");
			Thread.sleep(2000);
			
			System.out.println(name+" is Discharges");
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
