package com.bridgelabz.programs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class HashingList {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(new File("/home/bridgeit/Desktop/LinkedList.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (s.hasNext()) {
			list.add(s.nextInt());
		}
		System.out.println(list);

		HashMap<Integer, LinkedList<Integer>> map1 = new HashMap<Integer, LinkedList<Integer>>();
		for (Integer integer : list) {
			System.out.println(integer);
			
			int slotNo = integer%11;
			System.out.println("Slot"+slotNo);
			
			LinkedList<Integer> numberList = map1.get(slotNo);
			if( numberList == null )
			{
				//System.out.println("Value is null");
				numberList = new LinkedList<Integer>();
				map1.put(slotNo, numberList);
			}
			
			//System.out.println("Value is not null");
			numberList.add(integer);
			
		}
		System.out.println(map1);
			
		System.out.println("Enter Number you want to search or delete");
		int num = sc.nextInt();
		int SlotNumber= num%11;
		map1.get(SlotNumber);
		
		LinkedList<Integer> numberList1 = map1.get(SlotNumber);
		System.out.println(numberList1);
		if(numberList1.contains(num))
		{
			System.out.println("Number is present");
		}
		else
		{
			numberList1.add(num);
		}
		System.out.println(map1);
	}		
}