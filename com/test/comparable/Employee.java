package com.test.comparable;

//single sorting sequence
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.id == employee.id)
			return 0;
		else if (this.id > employee.id)
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return this.id + "|" + this.name + "|" + this.salary;
	}

}
