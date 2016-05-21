package com.java.namingconventions;

import java.util.*;

import java.lang.Math;

public final class FinalKeywordDemo {
	public static void getTheAreaOfCircle() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");

		double radius = scanner.nextDouble();
		double area = (4 / 3) * Math.PI * radius * radius;

		System.out.println("Area is " + area);

	}

	public static void main(String[] args) {
		getTheAreaOfCircle();

	}

}
