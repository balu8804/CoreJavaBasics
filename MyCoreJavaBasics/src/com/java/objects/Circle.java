package com.java.objects;

import java.lang.Math;
import java.util.*;

public class Circle implements Shape {
	public void findTheArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Circle : ");
		System.out.println("Enter the radius");
		double radius = scanner.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("Area of the Circle is : " + area);
		scanner.close();

	}
}