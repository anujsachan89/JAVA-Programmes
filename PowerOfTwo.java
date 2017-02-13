package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo
	{
	public static void main (String [] args)
		{
		Utility u = new Utility();
		System.out.println("Enter Power which should be less than 30");
		int a = u.inputInteger();
		int result = 1;
		for(int i=1;i<=a;i++)
			{
			result=result*2;
			}
		System.out.println(a+"th power of 2 is :"+result);
		}
	}