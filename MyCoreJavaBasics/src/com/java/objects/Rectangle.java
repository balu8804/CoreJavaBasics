package com.java.objects;

import java.util.*;

public class Rectangle implements Shape {
	public void findTheArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rectangle :");
		System.out.println("Enter the length: ");
		double length = scanner.nextDouble();
		System.out.println("Enter the Breadth: ");
		double breadth = scanner.nextDouble();
		double area = (length * breadth);
		System.out.println("Area of Rectangle is :" + area);
	}

}
