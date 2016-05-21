package com.java.constructors;

public class EmployeeDetails {
	String name;
	double salary;
	int age;

	EmployeeDetails() {
		System.out.println("default Constructor ");
	}

	EmployeeDetails(String n, int a, double s) {
		name = n;
		age = a;
		salary = s;
	}

	EmployeeDetails(EmployeeDetails ed) {
		name = ed.name;
		age = ed.age;
		salary = ed.salary;
	}

	void displayEmployeeDetails() {
		System.out.println("Displaying Details: ");
		System.out.println("Name is: " +name + " Salary is: " +salary
				+ " Age is: " +age);
	}

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails("balu", 25, 1000);
		EmployeeDetails emp1 = new EmployeeDetails(emp);
		emp1.displayEmployeeDetails();
		emp.displayEmployeeDetails();
	}

}
