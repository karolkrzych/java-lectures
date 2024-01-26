package com.company;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * Declare one dimension table with int values
		 * Create methode to find max value in this table
		 * Create methode to find min value in this table
		 * Create methode to return table with sorted values
		 */

		int[] values = { 1, 2, 6, 23, 5, 99, 123, 24 };

		findMax(values);
		findMin(values);
		sortArray(values);
	}

	static int findMax(int[] values) {
		int localMax = values[0];
		for (int value : values) {
			if (value > localMax) {
				localMax = value;
			}
		}
		System.out.println("Max: " + localMax);
		return localMax;
	}

	static int findMin(int[] values) {
		int localMin = values[0];
		for (int value : values) {
			if (value < localMin) {
				localMin = value;
			}
		}
		System.out.println("Min: " + localMin);
		return localMin;
	}

	static void sortArray(int[] values) {
		Arrays.sort(values);
		System.out.println("Sorted! " + Arrays.toString(values));
	}
}
