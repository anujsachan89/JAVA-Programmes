package com.bridgelabz.programs;

import java.util.Scanner;

public class VendingMachine {
	static int total = 0;
    /*
    * This method find out the possible ways to calculate the minimum number of notes.
    **/	
static void function(int value){
	
	if(value >= 1000){
		value = value-1000;
		System.out.print("1000-");
		total++;
		function(value);
	}
	else if(value >= 500){
		value = value-500;
		System.out.print("500- ");
		total++;
		function(value);
	}
	else if(value >= 100){
		value = value-100;
		System.out.print("100- ");
		total++;
		function(value);
	}
	else if (value >=50){
		value = value-50;
		System.out.print("50- ");
		total++;
		function(value);
	}
	else if(value >= 10){
		value = value-10;
		System.out.print("10- ");
		total++;
		function(value);
	}
	else if(value >= 5){
		value = value-5;
		System.out.print("5- ");
		total++;
		function(value);
	}
	else if(value >= 2){
		value = value-2;
		System.out.print("2- ");
		total++;
		function(value);
	}
	else if(value >= 1){
		value = value-1;
		System.out.print("1- ");
		total++;
		function(value);
	}


}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of Change to be Returned");
//To read the integer value from the keyboard.
int value = sc.nextInt();
System.out.println("change Values:");		
if(value != 0)
	function(value);
else
	System.out.println("No Change");
System.out.println("Total No. of notes: "+total);
	
}
}
