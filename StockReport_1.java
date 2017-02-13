package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;
public class StockReport_1 
	{
		int number;
		String name[]=new String[100];
		int share[]=new int[100];
		int value[]=new int[100];
		int total[]=new int[100];
		int allTotal=0;

		Utility u = new Utility();
		public void entry()
			{
				for(int i=0;i<number;i++)
				{ 
					System.out.println("\n please enter details of stock:"+(i+1));
					System.out.println("Name:");
					name[i]=u.inputString();
					System.out.println("enter no of share");
					share[i]=u.inputInteger();
					System.out.println("value of each share");						value[i]=u.inputInteger();
				}
			}
public void calculate()
			{
				for(int i=0;i<number;i++)
				{
					total[i]=share[i]*value[i];
					System.out.println("Total value for Stock "+(i+1)+" is: "+total[i]+" Rs.");
				}
			}
public void totalval()
			{
				for(int i=0;i<number;i++)
				{
					allTotal=allTotal+total[i];
				}							
				System.out.println("\n total value of all"+number+ " stock is"+allTotal);
			}


public static void main(String []args)
			{
				StockReport_1 s1=new StockReport_1();
				s1.entry();
				s1.calculate();
				s1.totalval();
			}
	}