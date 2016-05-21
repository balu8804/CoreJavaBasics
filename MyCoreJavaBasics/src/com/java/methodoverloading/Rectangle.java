package com.java.methodoverloading;

import java.util.*;

public class Rectangle {
	public int getTheRectangle(int length, int breadth) {

		int area = length * breadth;

		return area;
	}

	public double getTheRectangle(double length, double breadth) {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Values for the area of rectangle: ");
		System.out.println("Enter the Length: ");
		int length = scanner.nextInt();
		System.out.println("Enter the Breadth: ");
		int breadth = scanner.nextInt();
		int area = rectangle.getTheRectangle(length, breadth);
		System.out.println("Area of Rectangle is: " + area);
		double len = length;
		double bre = breadth;
		double perimeter = rectangle.getTheRectangle(len, bre);
		System.out.println("Perimeter of Rectangle is: " + perimeter);
		scanner.close();
	}

}
