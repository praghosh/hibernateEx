package com.anudip.example;

public class Patient {
	private String name;
	private int age;
	private double height; // height in cm
	// User-defined no-argument constructor
	public Patient() { 		
	}
	
	public static void main(String[] args) {
		// Instantiation using new
		Patient p = new Patient ();
		
		p.setAge(35);
		p.setHeight(159.5);
		p.setName("John Doe");
		
		System.out.println("Patient Name is " + p.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}

