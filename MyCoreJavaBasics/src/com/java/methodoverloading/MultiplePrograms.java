package com.java.methodoverloading;

import java.util.*;

public class MultiplePrograms {
	
	public int findSumOfNaturalNumbers() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = (n * (n + 1)) / 2;
		scanner.close();
		return x;
	}

	public int findTheLargestNumberOfAnArray() {
		int array[] = new int[] { 12, 17, 35, 43, 62, 19, 9, 11, 7, 2, 8 };

		int maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximum)
				maximum = array[i];
		}
		return maximum;
	}

	public int findTheSmallestNumberOfAnArray() {
		int array[] = new int[] { 12, 17, 35, 43, 62, 19, 9, 11, 7, 2, 8 };

		int minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum)
				minimum = array[i];
		}
		return minimum;
	}

	public int[] findTheAscendingOrder() {
		int[] array = new int[] { 12, 17, 35, 43, 62, 19, 9, 11, 7, 2, 8 };
		int tmp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
			System.out.print(array[i] + " ");
		}
		return array;
	}

	public int[] findTheDescendingOrder() {
		int[] array1 = new int[] { 12, 17, 35, 43, 62, 19, 9, 11, 7, 2, 8 };
		int tmp = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i; j < array1.length; j++) {
				if (array1[i] < array1[j]) {
					tmp = array1[i];
					array1[i] = array1[j];
					array1[j] = tmp;
				}

			}
			System.out.print(array1[i] + " ");
		}
		return array1;
	}

	public static void main(String[] args) {
		MultiplePrograms multipleprograms = new MultiplePrograms();
		System.out
				.println("Please Enter the number for Sum Of Natural Numbers: ");
		Scanner scanner = new Scanner(System.in);
		int x = multipleprograms.findSumOfNaturalNumbers();
		System.out.println("Sum of Natural numbers are: " + x);
		int maximum = multipleprograms.findTheLargestNumberOfAnArray();
		System.out.println("Largest Number of an Array is: " + maximum);
		int minimum = multipleprograms.findTheSmallestNumberOfAnArray();
		System.out.println("Smallest Number of an Array is: " + minimum);
		System.out.print("Ascending Order for Array are: ");
		multipleprograms.findTheAscendingOrder();
		System.out.print(" Descending Order for Array are: ");
		multipleprograms.findTheDescendingOrder();

		scanner.close();

	}

}
