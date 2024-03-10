package com.kodnest.bean;

public class Trainer {
	int id;
	String name;
	
	public Trainer() {
		super();

		System.out.println("0 para-constr");
	}
	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;

		System.out.println("Para-constr");
	}
	public int getId() {

		System.out.println("getter id");
		return id;
	}
	public void setId(int id) {

		System.out.println("Setter id");
		this.id = id;
	}
	public String getName() {

		System.out.println("Getter name");
		return name;
	}
	public void setName(String name) {

		System.out.println("Setter name");
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}

}
