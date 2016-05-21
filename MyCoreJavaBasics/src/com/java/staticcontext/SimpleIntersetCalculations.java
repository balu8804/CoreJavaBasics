package com.java.staticcontext;

import java.util.*;

public class SimpleIntersetCalculations {
	private static double p, t, r, si;

	static {
		p = 10;
		t = 2;
		r = 4;
		System.out.println("This program is to Find the simple Interest");
	}

	public static double calculateSimpleInterest() {
		si = (p * t * r) / 100;
		return si;

	}

	public static void main(String[] args) {
		SimpleIntersetCalculations s = new SimpleIntersetCalculations();
		System.out.println("The Simple Interset is: "
				+ calculateSimpleInterest());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter principle amount: ");
		p = scanner.nextDouble();
		System.out.println("Please Enter Time Duration: ");
		t = scanner.nextDouble();
		System.out.println("Please provide Rate of Interest: ");
		r = scanner.nextDouble();
		System.out.println("The Simple Interset is: "
				+ calculateSimpleInterest());
		s.test();
		calculateSimpleInterest();
		scanner.close();
	}

	void test() {
		p = 200;
		calculateSimpleInterest();
	}

}
