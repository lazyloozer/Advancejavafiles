package com.kodnest.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	int uid;
	String uname;
	
	Trainer t;
	public University() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("0-para constr");
	}
	@Autowired
	public University(int uid, String uname, Trainer t) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.t = t;

		System.out.println("para-constructor");
	}
	public int getUid() {

		System.out.println("getter uid");
		return uid;
	}
	public void setUid(int uid) {

		System.out.println("Setter uid");
		this.uid = uid;
	}

	public String getUname() {

		System.out.println("getter uname");
		return uname;
	}
	public void setUname(String uname) {

		System.out.println("Setter uname");
		this.uname = uname;
	}
	public Trainer getT() {

		System.out.println("Getter Trainer");
		return t;
	}
	public void setT(Trainer t) {

		System.out.println("Setter Trainer");
		this.t = t;
	}
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", t=" + t + "]";
	}

}
