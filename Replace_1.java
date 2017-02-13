package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Replace_1 {
	public static void main(String[] args) {
		Utility u = new Utility();
		String s1, s2, s3;
		System.out.print("Enter First String: ");
		s1 = u.inputString();
		System.out.print("Enter Word to replace: ");
		s2 = u.inputString();
		System.out.print("Enter Word to replace with: ");
		s3 = u.inputString();
		String finalString = s1.replace(s2, s3);
		System.out.println(finalString);
	}
}