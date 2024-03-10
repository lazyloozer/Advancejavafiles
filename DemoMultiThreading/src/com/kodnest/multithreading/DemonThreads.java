package com.kodnest.multithreading;

public class DemonThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonMaintask main=new DeamonMaintask("Typing");
		Task2 t1=new Task2("mike");
		task3 t2=new task3("jake");
		t1.setDaemon(true);
		t2.setDaemon(true);
		main.start();
		t1.start();
		t2.start();

	}

}
