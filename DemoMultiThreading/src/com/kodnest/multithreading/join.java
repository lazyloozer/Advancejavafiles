package com.kodnest.multithreading;

public class join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task4 t4=new task4();
		t4.start();
		for(int i=0;i<=10;i++) {
			System.out.println("!!!!!!!");
			try {
				t4.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
class task4 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
}