package Week3Session1;

 

/* 
 * 
 * Assignment 1
 * Write a Java program to create a class called Vehicle with a
 *  method called drive() ...
 */

class Vehicle {

	public Vehicle (String make, String model, int year, int maximumSpeed) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	void drive() {
		System.out.println("Vehicle is moving");
	}

	String make  ;
	String model ; 
	int year;
	int maximumSpeed;	// in km/hour;
}

class Car extends Vehicle    {

	public Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}

	@Override
	void drive() {
		System.out.println( make + " "+  model + " Car is moving");
	}	 
}
class Bike extends Vehicle  {

	public Bike(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	 
	}
	
	@Override
	void drive() {
		System.out.println(  make + " " + model + " Bike is moving");
	}	
}

public class VehicleTest { 
	public static void main(String[] args) {
		Vehicle v = new Car("Porsche" , "Macan", 2022, 252);
		System.out.println(  v.make + " " + v.model + "-" + v.year);
		v.drive();
		
		
		Bike b = new Bike("Bajaj", "Pulsar-150" , 2021, 115);
		System.out.println(  b.make + " " + b.model + "-" + b.year);
		b.drive();
	}

}
