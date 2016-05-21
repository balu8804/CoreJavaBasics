package com.java.methodoverloading;

public class EmployeeDetails {

	public double calculateAppraisal() {
		String name = "kumar";
		int age = 45;
		double salary = 5000;
		double increment = 2000;
		double appraisal = salary + increment;
		// System.out.println("Appraisal Amount is " + appraisal);
		return appraisal;

	}

	public double calculateAppraisal(double salary, double increment) {
		double appraisal = salary + increment;
		return appraisal;

	}

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		double appraisal = employee.calculateAppraisal();
		System.out.println("Default Method Result is: " + appraisal);
		appraisal = employee.calculateAppraisal(5000, 60000);
		System.out.println("Overloaded Method Result is: " + appraisal);

	}

}
