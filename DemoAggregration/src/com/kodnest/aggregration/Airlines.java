package com.kodnest.aggregration;

public class Airlines {
	String airname;
	Pilot Pilot;
	
	public Airlines(String airname,Pilot Pilot) {
		this.airname=airname;
		this.Pilot=Pilot;
		
		
	}
	void operate() {
		System.out.println(airname  + " operation ");
		Pilot.fly();
	}

}
