package com.destination.jfs.day14;

class Calculator {
	void add() {
		int a= 20;
		int b= 20;
		System.out.println(a+b);
	}
	void sub(int c, int d) {
		System.out.println(c-d);
	}
}


public class LocalVariableExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.sub(100, 80);
		// TODO Auto-generated method stub

	}

}



