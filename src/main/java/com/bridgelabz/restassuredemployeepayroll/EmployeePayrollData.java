package com.bridgelabz.restassuredemployeepayroll;

public class EmployeePayrollData {
	private int id;
	private String name;
	private Double salary;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
