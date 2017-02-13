package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;

public class BinarySearch {
	public static void main(String[] args) {
		Utility u = new Utility();
		int size;
		System.out.println("Please Enter Strings");
		String names = u.inputString();
		System.out.println(names);
		// spliting the string using comma and stored into array
		String[] str1 = names.split("\\s+");
		size = str1.length;
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			System.out.println(str1[i]);
		}

		System.out.println("Please Enter the string to be find :");
		String str2 = u.inputString();
		for (int i = 0; i < size; i++) {
			if (str1[i].equals(str2)) {
				System.out.println("String Found at location"+ (i+1));
				return;
			}
		}
		System.out.println("String Not Found");
	}
}