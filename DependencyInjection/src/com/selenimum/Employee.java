package com.selenimum;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		System.out.println("Def Cons");
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}

}
