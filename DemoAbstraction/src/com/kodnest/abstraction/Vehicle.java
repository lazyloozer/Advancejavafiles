package com.kodnest.abstraction;
abstract class Vehicle{
	//abstract  void starts();
	
	// concreate method
	public void start() {
		System.out.println("Vehicle has started");
	}
	public void stop() {
		System.out.println("Vehicle has stopped");
	}
	//abstart method
	public  abstract void refuel();
}

class ElectricCar extends Vehicle{
	@Override
	public void refuel() {
		System.out.println("Charging with power");
	}
}
	class PetrolCar extends Vehicle{
		@Override
		public void refuel() {
			System.out.println("Charging with petrol");
		}
	}
	
		
		class DieselCar extends Vehicle{
			@Override
			public void refuel() {
				System.out.println("Charging with Dieselcar");
			}
		}
	
