package com.destination.jfs.day13;
class Dog{
	String name;
	String color;
	String breed;
	int age;
	int cost;
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
		
	}
	void allocateData() {
		name="tommy";
		color="black";
		breed="gr";
		age=2;
		cost=5000;
		
	}
}


public class InstanceVariableExample {


	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();
		System.out.println("++++");
		d1.allocateData();
		d1.display();
		
		
		// TODO Auto-generated method stub

	}

}
