package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Gambler
{
	public static void main(String []args)
	{
		Utility u = new Utility();
		System.out.println("enter how much stake you have");
		int stake=u.inputInteger();
		System.out.println("enter how many times you wants play");
		int trials=u.inputInteger();
		System.out.println("set a goal");
		int goal=u.inputInteger();
		int loss=0;
		int win=0;
		for(int t=1;t<=trials;t++)
		{
			int cash=stake;
			/*To calculate the points i.e increment points value by 1 when he won,else decrement by 1.*/
			while(cash > 0 && cash < goal )
			{
				if(Math.random() < 0.5)
				{
					cash++;
				}
				else
					cash--;
			}
			if(cash==goal)
			{
				win++;
			}
			else
				loss++;
		}
		System.out.println("no. of wins " +win );
		System.out.println("no. of loss "+loss);
	}
}
