package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class student {
	@Id
	int id;
	String name;
//	@OneToOne
//	Bike bike;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Bike getBike() {
//		return bike;
//	}
//
//	public void setBike(Bike bike) {
//		this.bike = bike;
//	}

	public student(int id, String name, Bike bike) {
		super();
		this.id = id;
		this.name = name;
//		this.bike = bike;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return id+">>>"+name;
	}




//	@Override
//	public String toString() {
//		return id+""+name+""+""+bike.getName()+""+bike.getPrice();
//	}
	




	

}
