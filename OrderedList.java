package com.bridgelabz.programs;

import java.io.File;

import com.bridgelabz.utility.FIleUtility;
import com.bridgelabz.utility.OrderedNode;

public class OrderedList {
	public static void main(String[] args){
		FIleUtility u = new FIleUtility();
		OrderedNode node = new OrderedNode();
		File file = new File("/home/bridgeit/Downloads/File.txt");
		String string= u.readFile(file); //reading file method of Utility class is called.
		System.out.println("Contents of file are: "+string);
		string = string.trim();
		String strArray[] = string.split(" ");
		
		for(int i=0;i<strArray.length;i++){
			node.addNode(Integer.parseInt(strArray[i]));
		}
		
		System.out.print("List Elements are: ");
		node.showList();

		System.out.print("\nPlease Enter the element you want to Search: ");
		int value = u.inputInteger();
		node.search(value); 
	}
}