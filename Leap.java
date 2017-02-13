package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Leap
{
public static void main (String [] args)
{
	Utility u = new Utility();
	System.out.println("Enter Year ");
	int i = u.inputInteger();
	if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
    System.out.println("Year " + i + " is a leap year");
    else
    System.out.println("Year " + i + " is not a leap year");
        }
}
