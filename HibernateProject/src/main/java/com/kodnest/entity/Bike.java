package com.kodnest.entity;

public class Bike {
	String name;
	double price ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Bike(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

}
