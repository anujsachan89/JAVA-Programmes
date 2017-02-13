package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;

public class FindYourNumber 
{
	public static void main(String[] args)
	{
		Utility u = new Utility();
		System.out.println("Enter the number of choices");
		int steps= u.inputInteger();
		int result = 1,N;
		boolean check;
		for(int i=0;i<steps;i++)
		{
			result = result*2;
		}
		N = result;
		System.out.println("Imagine the no. between 0 to "+(N-1));
		int first = 1;
		int last = N/2;
		int i=2,j=4;
		for(int k=1;k<steps;k++)
		{
			System.out.println("Is Your no Present Between "+(first-1)+" to "+(last-1)+"??\ntrue or false");
			check= u.inputBoolean();
			if(check){
				N = N/2;
				last = last-((last-first+1)/2);
			}
			else
			{
				first = first+N/i;
				last = last+N/j;
				i = i+i;
                j = j+j;
			}
		}
		System.out.println("Is Your no is "+(first-1)+"?? \ntrue or false");
		check= u.inputBoolean();
		if(check)
			System.out.println("Answer is: "+(first-1));
		else
			System.out.println("Answer is: "+(last));
	}
}