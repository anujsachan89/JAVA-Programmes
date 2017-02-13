package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;
public class InsertionSort {
	  
	public static void main(String[] args) {
		  Utility u = new Utility();
		  System.out.println("Enter Size of String");
		  int size = u.inputInteger();
		  String[] array=new String[size];
		  System.out.println("Enter String");
		 String names= u.inputString();
		  String[] a = names.split("\\s+");		  
		  for (int i = 0; i < size; i++) {// for reading array
			   a[i] = u.inputString();
		  }
		  array = u.insertionSortString(a);  
		  for (int i = 0; i < size; i++) {// for reading array
				System.out.print(array[i] + " ");
			}
		  
	}
}