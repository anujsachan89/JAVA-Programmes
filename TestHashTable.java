package com.bridgelabz.programs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestHashTable {

	public static void main(String args[]) throws IOException {
		int content;
		int count = 1;
		File file = new File("/home/bridgeit/Desktop/LinkedList.txt");
		LinkedList<Integer> list = new LinkedList<Integer>();
		

		try {
			Scanner sc = new Scanner(new FileInputStream(file));
			while (sc.hasNextLine()) {
				content = sc.nextInt();
				list.add(content);
			}
			sc.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nProgram terminated Safely...");
		}

		Iterator k = list.iterator();
		while (k.hasNext()) {
			System.out.print("Node " + (count++) + " : ");
			System.out.println(k.next());
		}
		System.out.println(list.size());
		System.out.println(k);	
		
		}		
		}