package com.bridgelabz.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Trial {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/home/bridgeit/Downloads/File.txt");
		System.out.println("done");

		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}
