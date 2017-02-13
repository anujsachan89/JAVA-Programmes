package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Utility u = new Utility();

		System.out.println("enter number of elements");

		int n = u.inputInteger();

		int array[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			array[i] = u.inputInteger();
		}
		array = u.bubbleSortArray(array);

		for (int i = 0; i < n; i++) {// for reading array
			System.out.print(array[i] + " ");
		}
	}
}