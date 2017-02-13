package com.bridgelabz.programs;

import java.io.File;

import com.bridgelabz.utility.FIleUtility;
import com.bridgelabz.utility.UnOrderedNode;

public class UnOrderedList {
	public static void main(String[] args){
		FIleUtility fu = new FIleUtility();
		UnOrderedNode node = new UnOrderedNode();
		File file = new File("/home/bridgeit/Downloads/File.txt");
		String string = fu.readFile(file);
		System.out.println("File Contents are: "+string);
		string = string.trim();
		String[] str = string.split(" ");
		
		for(int i=0;i<str.length;i++){
			node.addNode(str[i]);
		}
		
		System.out.print("Please Enter String You want to search: ");
		String searchStr = fu.inputString();
		node.search(searchStr);
	}
}