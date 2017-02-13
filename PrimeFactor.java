package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeFactor
{
	public static void main(String []args)
	{
		Utility u = new Utility();
		System.out.println("enter a number");
		int num=u.inputInteger();
                 int i=2;

		while(num>1)
		{
		
	                        //int i=2;
				if(num%i==0)
				{
					System.out.println(i+" ");
					num=num/i;
                                       
                                         
				}
				else
					i++;
			
		}
	}
}
