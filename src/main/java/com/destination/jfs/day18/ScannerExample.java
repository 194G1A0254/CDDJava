package com.destination.jfs.day18;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data: ");
		byte byt = sc.nextByte();
		System.out.println("Byte data is : "+byt);
		System.out.println("+++++");
		System.out.println("Enter the short data: ");
		short srt = sc.nextShort();
		System.out.println("Short data is : "+srt);
		System.out.println("+++++");
		System.out.println("Enter the int data: ");
		int i = sc.nextInt();
		System.out.println("Int data is : "+i);
		System.out.println("+++++");
		System.out.println("Enter the long data: ");
		long lng = sc.nextLong();
		System.out.println("Long data is : "+lng);
		System.out.println("+++++");
		System.out.println("Enter the String data: ");
		String str = sc.next();
		System.out.println("String data is : "+str);
		System.out.println("+++++");
		System.out.println("Enter the boolean data: ");
		boolean b = sc.nextBoolean();
		System.out.println("Boolean data is : "+b);
		System.out.println("+++++");
		System.out.println("Enter the float data: ");
		float f = sc.nextFloat();
		System.out.println("Float data is : "+f);
		System.out.println("+++++");
		System.out.println("Enter the double data: ");
		double d = sc.nextDouble();
		System.out.println("Double data is : "+d);
		System.out.println("+++++");
		// TODO Auto-generated method stub

	}

}
