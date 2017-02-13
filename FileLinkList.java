package com.bridgelabz.programs;

import java.util.*;

import com.bridgelabz.utility.Utility;

/*import com.bridgelabz.utility.Utility;
*/
import java.io.*;

public class FileLinkList {
	public static void main(String args[]) throws IOException {
		/*Utility u = new Utility();*/
		String content = new String();
		int count = 1;
		File file = new File("/home/bridgeit/Downloads/File.txt");
		LinkedList<String> list = new LinkedList<String>();
		

		try {
			Scanner sc = new Scanner(new FileInputStream(file));
			while (sc.hasNextLine()) {
				content = sc.next();
				list.add(content);
			}
			sc.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nProgram terminated Safely...");
		}

		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.print("Node " + (count++) + " : ");
			System.out.println(i.next());
		}
		System.out.println("Enter String you want to search");
		Utility u = new Utility();
		String str = u.inputString();
		if (str==content){
		System.out.println("it is already present");
		}
		else{
			list.add(content);
		}
	}
			
	}