package com.bridgelabz.programs;


import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.Utility;

public class ClassTest {
	public static void main(String [] args){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Utility u = new Utility();
		System.out.println("Enter the size of Array");
		int size = u.inputInteger();
		System.out.println("Enter  Array");
		for(int i = 0;i<size;i++)
		{
			map.put(i,u.inputInteger()%11);
		}
		for(int i = 0;i<size;i++)
		{
			System.out.println(map.get(i));
		}
}
}