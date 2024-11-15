package com.destination.jfs.day14;

class Dog{
	static String name;
	static String color;
	static String breed;
	static int age;
	static int cost;
	static void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
		
	}
	 static void allocateData() {
		name="tommy";
		color="black";
		breed="gr";
		age=2;
		cost=5000;
		
	}
}


public class StaticVariableExample {


	public static void main(String[] args) {
		System.out.println(Dog.name);
		System.out.println(Dog.color);
		System.out.println(Dog.breed);
		System.out.println(Dog.age);
		System.out.println(Dog.cost);
		
		System.out.println("++++");
		Dog.allocateData();
		Dog.display();
		
		
		// TODO Auto-generated method stub

	}



}
