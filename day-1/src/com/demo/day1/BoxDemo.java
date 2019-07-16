package com.demo.day1;

public class BoxDemo {

	public static void main(String[] args) {
		
		//int x = 10;
		//Box b = new Box();
		
		Box b1 = new Box(10,20,30);
		
		double vol = b1.getVolume();
		
		System.out.println(vol);
		System.out.println(b1.getColor());
		
		//---------------
		
		Box b2 = new Box(100,170,300,"Green");
		
		double vol2 = b2.getVolume();
		
		System.out.println(vol2);
		System.out.println(b2.getColor());
		
		//---------------
		
		Box b3 = new Box(100,170,300,"Green",10.5);
		
		double vol3 = b3.getVolume();
		
		System.out.println(vol3);
		System.out.println(b3.getColor());
		System.out.println(b3.getWeight());

	}

}
