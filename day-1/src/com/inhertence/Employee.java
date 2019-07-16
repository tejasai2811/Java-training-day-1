package com.inhertence;

public class Employee extends Person {

	protected double salary;
	
	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary=salary;
	}

	@Override
	public String getDetails() {
		
		return super.getDetails() + " " + salary;
	}
	
	/*public String getDetails() {
		
		return super.getDetails() + " " + salary;
	}*/
}
