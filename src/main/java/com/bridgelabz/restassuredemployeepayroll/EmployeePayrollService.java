package com.bridgelabz.restassuredemployeepayroll;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {
	private List<EmployeePayrollData> employeePayrollList;

	public enum IOService {
		REST_IO
	}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = new ArrayList<>(employeePayrollList);
	}

	public long countEntries(IOService ioService) {
		if (ioService.equals(IOService.REST_IO))
			return employeePayrollList.size();
		return 0;
	}

	public void addEmployeeToPayroll(EmployeePayrollData employeePayrollData, IOService ioService) {
		if (ioService.equals(IOService.REST_IO))
			employeePayrollList.add(employeePayrollData);
	}

	public void updateEmployeeSalary(String name, double salary, IOService ioService) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollData(name);
		if (employeePayrollData != null) {
			employeePayrollData.setSalary(salary);
		}
	}

	public EmployeePayrollData getEmployeePayrollData(String name) {
		return this.employeePayrollList.stream()
				.filter(employeePayrollListItem -> employeePayrollListItem.getName().equals(name)).findFirst()
				.orElse(null);
	}

	public void printWelcome(String[] args) {
		System.out.println("Welcome to Rest API");
	}
}
