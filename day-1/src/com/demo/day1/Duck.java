package com.demo.day1;

public class Duck {

	public void fun() {
		System.out.println("This is fun");
		f1();
	}
	
	public static void f1() {
		//fun();	//cannot access non static fun from static f1
		System.out.println("This is f1");
		
	}
	static int duckCount=0;
	
	public Duck() {
		duckCount++;
	}
	
	
}
