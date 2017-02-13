package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class SimulateBankingCashCounter {
	
	public void Withdraw(int num){
		int balance=100000;
		int s;
		s= balance-num;
		System.out.println("Your  new Balance after withdrwal is : "+s);
	}
	public void Deposit(int num){
		int balance=100000;
		int s;
		s= balance+num;
		System.out.println("Your  new Balance after withdrwal is : "+s);
	}
	public static void main (String [] args){
		Utility u = new Utility();
		System.out.println("Welcome to Banking Cash Counter");
		System.out.println("Please Choose your option: \n1.Withdraw \n2. Deposit");
		int num=u.inputInteger();
		SimulateBankingCashCounter v= new SimulateBankingCashCounter();
		if(num==1)
		{
			System.out.println("How much money you want to withdraw");
			int num1=u.inputInteger();
			v.Withdraw(num1);
		}
		else{
			System.out.println("How much money you want to deposit");
			int num2=u.inputInteger();
		v.Deposit(num2);
		}			
	} 
}
