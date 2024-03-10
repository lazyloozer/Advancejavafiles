package com.kodnest.bean;


public class Laptop {
	String Lname;
	String color;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String lname, String color) {
		super();
		Lname = lname;
		this.color = color;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [Lname=" + Lname + ", color=" + color + ", getLname()=" + getLname() + ", getColor()="
				+ getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
