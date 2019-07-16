package com.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		try {
			int a = 10;
			int b = 10;
			double d = a/b;
			String[] names = new String[10];
			names[0].length();
			System.out.println("No Exception.....");
		} catch(ArithmeticException ex) {
			System.out.println("In catch block arithmatic exception.....");
			ex.printStackTrace();
		} catch(NullPointerException ex) {
			System.out.println("In catch block of null pointer exception.....");
			ex.printStackTrace();
		} finally {
			System.out.println("Finally executes always");
		}
		
		System.out.println("Normal Code Flow");

	}

}
