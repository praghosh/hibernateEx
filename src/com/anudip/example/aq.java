package com.anudip.example;

class Animal { 
	public void makeSound() { 
		System.out.println("Animal is making a sound"); 
	} 
}
class Cat extends Animal { 
	@Override public void makeSound() 
	{ 
		System.out.println("Meow"); 
	} 
}