package com.inhertence;

public class PersonMain {

	public static void main(String[] args) {
		
		Employee e = new Employee(10,"Janice",60000);
		System.out.println(e.getDetails());
		
		//Person p1 = new Employee(101,"Scott",55000);
		Person p1 = new TraineeEmployee(102,"Carl",45000,"Good");
		
		System.out.println(p1.getDetails());
		
		Object o = new TraineeEmployee(102,"Carl",45000,"Good");
		
		System.out.println(o.getClass().getName());
	}

}
