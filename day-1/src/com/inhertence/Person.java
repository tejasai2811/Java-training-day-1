package com.inhertence;

public class Person {

	protected int id;
	protected String name;
	
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String getDetails() {
		return id +" "+ name;
	}
}
